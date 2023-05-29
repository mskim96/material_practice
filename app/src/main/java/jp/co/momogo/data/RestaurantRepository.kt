package jp.co.momogo.data

import jp.co.momogo.datasource.RestaurantDataSource
import jp.co.momogo.di.DefaultDispatcher
import jp.co.momogo.model.Restaurant
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.withContext
import javax.inject.Inject

interface RestaurantRepository {

    /**
     * Get restaurants by user preference food category.
     */
    fun getRestaurantsStream(): Flow<List<Restaurant>>

    /**
     * Get restaurant detail.
     */
    fun getRestaurantDetails(restaurantId: Int): Flow<Restaurant>
}

class RestaurantRepositoryImpl @Inject constructor(
    private val restaurantNetwork: RestaurantDataSource,
    @DefaultDispatcher private val dispatcher: CoroutineDispatcher
) : RestaurantRepository {
    override fun getRestaurantsStream(): Flow<List<Restaurant>> = flow {
        val restaurants = withContext(dispatcher) {
            restaurantNetwork.getRestaurants().asExternal()
        }
        emit(restaurants)
    }

    override fun getRestaurantDetails(restaurantId: Int): Flow<Restaurant> = flow {
        val restaurant = withContext(dispatcher) {
            restaurantNetwork.getRestaurantDetail(restaurantId = restaurantId).asExternal()
        }
        emit(restaurant)
    }
}