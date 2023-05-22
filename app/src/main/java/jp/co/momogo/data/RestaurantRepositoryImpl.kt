package jp.co.momogo.data

import jp.co.momogo.database.RestaurantDao
import jp.co.momogo.database.RestaurantWithMenu
import jp.co.momogo.database.toExternal
import jp.co.momogo.databuilder.RestaurantBuilder
import jp.co.momogo.databuilder.model.toEntity
import jp.co.momogo.model.Restaurant
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.withContext
import javax.inject.Inject
import kotlin.coroutines.coroutineContext

class RestaurantRepositoryImpl @Inject constructor(
    private val restaurantDao: RestaurantDao,
    private val restaurantBuilder: RestaurantBuilder
) : RestaurantRepository {

    // Note: Just for ui test.
    override fun getRestaurants(
        query: RestaurantQuery
    ): Flow<List<Restaurant>> =
        restaurantDao.getRestaurantStream(
            useTopRate = query.filterTopRate != null,
            topRate = query.filterTopRate ?: 0,
        )
            .map { it.map(RestaurantWithMenu::toExternal) }


    // Note: Just for ui test.
    override fun getRestaurantDetails(restaurantId: Int): Flow<Restaurant> {
        return restaurantDao.getRestaurantDetail(restaurantId)
            .map(RestaurantWithMenu::toExternal)
    }

    override fun getBannerRestaurant(): Flow<List<Restaurant>> {
        return restaurantDao.getBannerRestaurant()
            .map { it.map(RestaurantWithMenu::toExternal) }
    }

    override suspend fun synchronize() {
        restaurantDao.getRestaurantStream().collect {
            if (it.isEmpty()) {
                restaurantBuilder.getRestaurants()
                    .map {
                        withContext(coroutineContext) {
                            restaurantDao.insertOrIgnoreRestaurantResource(it.toEntity())
                            restaurantDao.insertOrIgnoreMenuResource(it.menus.toEntity())
                        }
                    }
            }
        }
        getRestaurants()
    }
}