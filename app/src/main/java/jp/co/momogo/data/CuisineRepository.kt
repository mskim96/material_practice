package jp.co.momogo.data

import jp.co.momogo.datasource.CuisineDataSource
import jp.co.momogo.di.DefaultDispatcher
import jp.co.momogo.model.Cuisine
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.withContext
import javax.inject.Inject

/**
 * Food Repository interface.
 */
interface CuisineRepository {

    /**
     * Get foods stream.
     */
    fun getFoodsStream(): Flow<List<Cuisine>>

    /**
     * Get food detail.
     */
    fun getFoodDetail(foodId: Int): Flow<Cuisine>
}

class CuisineRepositoryImpl @Inject constructor(
    private val foodNetwork: CuisineDataSource,
    @DefaultDispatcher private val dispatcher: CoroutineDispatcher
) : CuisineRepository {

    override fun getFoodsStream(): Flow<List<Cuisine>> = flow {
        val foods = withContext(dispatcher) {
            foodNetwork.getFoodList().asExternal()
        }
        emit(foods)
    }

    override fun getFoodDetail(foodId: Int): Flow<Cuisine> = flow {
        val food = withContext(dispatcher) {
            foodNetwork.getFoodDetail(foodId = foodId).asExternal()
        }
        emit(food)
    }
}