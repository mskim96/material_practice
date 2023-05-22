package jp.co.momogo.data

import jp.co.momogo.model.Restaurant
import kotlinx.coroutines.flow.Flow

data class RestaurantQuery(
    val filterTopRate: Int? = null,
)

interface RestaurantRepository {

    /**
     * Get restaurants by user preference food category.
     */
    fun getRestaurants(
        query: RestaurantQuery = RestaurantQuery(
            filterTopRate = null,
        )
    ): Flow<List<Restaurant>>

    /**
     *  Get restaurants detail.
     */
    fun getRestaurantDetails(restaurantId: Int): Flow<Restaurant>

    /**
     * Get restaurant's for banner.
     */
    fun getBannerRestaurant(): Flow<List<Restaurant>>

    /**
     * sync restaurant data.
     */
    suspend fun synchronize()
}