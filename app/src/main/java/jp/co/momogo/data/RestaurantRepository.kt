package jp.co.momogo.data

import jp.co.momogo.model.Restaurant
import kotlinx.coroutines.flow.Flow

interface RestaurantRepository {

    /**
     * Get restaurants by user preference food category.
     */
    fun getPreferenceRestaurants(): Flow<List<Restaurant>>

    /**
     * Get restaurants by populate.
     */
    fun getPopulateRestaurants(): Flow<List<Restaurant>>

    /**
     * Get near by restaurants from user distance.
     */
    fun getNearDistanceRestaurants(): Flow<List<Restaurant>>

    /**
     *  Get restaurants detail.
     */
    fun getRestaurantDetails(restaurantId: Int): Flow<Restaurant>
}