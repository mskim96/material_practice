package jp.co.momogo.data

import jp.co.momogo.model.Restaurant
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.take
import javax.inject.Inject

class RestaurantRepositoryImpl @Inject constructor(
    private val restaurantBuilder: RestaurantBuilder
) : RestaurantRepository {

    // Note: Just for ui test.
    override fun getPreferenceRestaurants(): Flow<List<Restaurant>> {
        return restaurantBuilder.getRestaurants()
            .map { restaurant ->
                restaurant.shuffled()
            }.take(10)
    }

    // Note: Just for ui test.
    override fun getPopulateRestaurants(): Flow<List<Restaurant>> {
        return restaurantBuilder.getRestaurants()
            .map { restaurant ->
                restaurant.filter { it.rating > 3 }
            }.take(10)
    }

    // Note: Just for ui test.
    override fun getNearDistanceRestaurants(): Flow<List<Restaurant>> {
        return restaurantBuilder.getRestaurants()
            .map { restaurant -> restaurant.shuffled() }
            .take(10)
    }

    // Note: Just for ui test.
    override fun getRestaurantDetails(restaurantId: Int): Flow<Restaurant> {
        val result = restaurantBuilder.getRestaurants()
            .map { restaurants ->
                restaurants.first { it.id == restaurantId }
            }
        return result
    }
}