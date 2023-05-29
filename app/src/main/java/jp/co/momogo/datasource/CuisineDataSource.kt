package jp.co.momogo.datasource

import jp.co.momogo.datasource.model.CuisineResource
import jp.co.momogo.datasource.store.CuisineResourceStore
import javax.inject.Inject

/**
 * Network datasource interface.
 */
interface CuisineDataSource {

    /**
     * Get food list data.
     */
    fun getFoodList(): List<CuisineResource>

    /**
     * Get food detail.
     */
    fun getFoodDetail(foodId: Int): CuisineResource
}

class CuisineDataSourceImpl @Inject constructor(
    private val cuisineResourceStore: CuisineResourceStore
) : CuisineDataSource {

    override fun getFoodList() = cuisineResourceStore.cuisines

    override fun getFoodDetail(foodId: Int) =
        cuisineResourceStore.cuisines.first { it.id == foodId }
}