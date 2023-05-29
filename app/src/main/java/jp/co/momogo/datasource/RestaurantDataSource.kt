package jp.co.momogo.datasource

import jp.co.momogo.datasource.model.RestaurantResource
import jp.co.momogo.datasource.store.RestaurantResourceStore
import javax.inject.Inject

/**
 * Network datasource interface
 */
interface RestaurantDataSource {

    /**
     * Get restaurant list data.
     */
    fun getRestaurants(): List<RestaurantResource>

    /**
     * Get restaurant detail.
     */
    fun getRestaurantDetail(restaurantId: Int): RestaurantResource
}

class RestaurantDataSourceImpl @Inject constructor(
    private val restaurantResourceStore: RestaurantResourceStore
) : RestaurantDataSource {

    override fun getRestaurants(): List<RestaurantResource> =
        restaurantResourceStore.restaurants

    override fun getRestaurantDetail(restaurantId: Int) =
        restaurantResourceStore.restaurants.first { it.id == restaurantId }
}