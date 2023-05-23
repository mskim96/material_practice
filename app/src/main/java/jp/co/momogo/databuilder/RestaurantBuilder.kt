package jp.co.momogo.databuilder

import jp.co.momogo.data.*
import jp.co.momogo.databuilder.model.RestaurantResource
import jp.co.momogo.databuilder.staticdata.*
import jp.co.momogo.di.Dispatcher
import jp.co.momogo.di.MomogoDispatchers.*
import jp.co.momogo.model.Restaurant
import jp.co.momogo.model.RestaurantType
import kotlinx.coroutines.CoroutineDispatcher
import javax.inject.Inject
import javax.inject.Singleton
import kotlin.random.Random

/**
 * [Restaurant] builder for fake data.
 */
@Singleton
class RestaurantBuilder @Inject constructor(
    private val menuBuilder: RestaurantMenuBuilder,
    @Dispatcher(IO) private val dispatcher: CoroutineDispatcher
) {

    /**
     * Combine all restaurants and emit them.
     */
    fun getRestaurants(): List<RestaurantResource> {
        val japanese = getJapanesesRestaurants()
        val western = getWesternRestaurants()
        val koreans = getKoreansRestaurants()
        val chinese = getChineseRestaurants()
        val seafoods = getSeafoodsRestaurants()
        val ramen = getRamenRestaurants()
        val fried = getFriedRestaurants()
        val skewers = getSkewersRestaurants()
        val noodle = getNoodleRestaurants()
        val curry = getCurryRestaurants()
        val dessert = getDessertRestaurants()
        val banner = getBannerRestaurants()

        return listOf(japanese + western + koreans + chinese + seafoods + ramen + fried + skewers + noodle + curry + dessert + banner)
            .flatten()
    }

    private fun getJapanesesRestaurants(): List<RestaurantResource> {
        val result = japaneseRestaurantNameList.mapIndexed { index, name ->
            RestaurantResource(
                id = index,
                name = name,
                description = restaurantDescription,
                location = addressList[index],
                category = RestaurantType.Japanese,
                mainImageUrl = japaneseRestaurantImageList[index],
                rating = Random.nextInt(2, 6),
                menus = menuBuilder.getJapaneseMenu(restaurantId = index),
            )
        }
        return result
    }

    private fun getWesternRestaurants(): List<RestaurantResource> {
        val result = westernRestaurantNameList.mapIndexed { index, name ->
            val id = index + 10
            RestaurantResource(
                id = id,
                name = name,
                description = restaurantDescription,
                location = addressList[index],
                category = RestaurantType.Western,
                mainImageUrl = westernRestaurantImageList[index],
                rating = Random.nextInt(2, 6),
                menus = menuBuilder.getWesternMenu(restaurantId = id)
            )
        }
        return result
    }

    private fun getKoreansRestaurants(): List<RestaurantResource> {
        val result = koreanRestaurantNameList.mapIndexed { index, name ->
            val id = index + 20
            RestaurantResource(
                id = id,
                name = name,
                description = restaurantDescription,
                location = addressList[index],
                category = RestaurantType.Koreans,
                mainImageUrl = koreanRestaurantImageList[index],
                rating = Random.nextInt(2, 6),
                menus = menuBuilder.getKoreanMenu(restaurantId = id)
            )
        }
        return result
    }

    private fun getChineseRestaurants(): List<RestaurantResource> {
        val result = chineseRestaurantNameList.mapIndexed { index, name ->
            val id = index + 30
            RestaurantResource(
                id = id,
                name = name,
                description = restaurantDescription,
                location = addressList[index],
                category = RestaurantType.Chinese,
                mainImageUrl = chineseRestaurantImageList[index],
                rating = Random.nextInt(2, 6),
                menus = menuBuilder.getChineseMenu(restaurantId = id)
            )
        }
        return result
    }

    private fun getSeafoodsRestaurants(): List<RestaurantResource> {
        val result = seafoodRestaurantNameList.mapIndexed { index, name ->
            val id = index + 40
            RestaurantResource(
                id = id,
                name = name,
                description = restaurantDescription,
                location = addressList[index],
                category = RestaurantType.Seafood,
                mainImageUrl = seafoodRestaurantImageList[index],
                rating = Random.nextInt(2, 6),
                menus = menuBuilder.getSeafoodsMenu(restaurantId = id)
            )
        }
        return result
    }

    private fun getRamenRestaurants(): List<RestaurantResource> {
        val result = ramenRestaurantNameList.mapIndexed { index, name ->
            val id = index + 50
            RestaurantResource(
                id = id,
                name = name,
                description = restaurantDescription,
                location = addressList[index],
                category = RestaurantType.Ramen,
                mainImageUrl = ramenRestaurantImageList[index],
                rating = Random.nextInt(2, 6),
                menus = menuBuilder.getRamenMenu(restaurantId = id)
            )
        }
        return result
    }

    private fun getFriedRestaurants(): List<RestaurantResource> {
        val result = friedRestaurantNameList.mapIndexed { index, name ->
            val id = index + 60
            RestaurantResource(
                id = id,
                name = name,
                description = restaurantDescription,
                location = addressList[index],
                category = RestaurantType.Fried,
                mainImageUrl = friedRestaurantImageList[index],
                rating = Random.nextInt(2, 6),
                menus = menuBuilder.getFriedMenu(restaurantId = id)
            )
        }
        return result
    }

    private fun getSkewersRestaurants(): List<RestaurantResource> {
        val result = skewersRestaurantNameList.mapIndexed { index, name ->
            val id = index + 70
            RestaurantResource(
                id = id,
                name = name,
                description = restaurantDescription,
                location = addressList[index],
                category = RestaurantType.Skewers,
                mainImageUrl = skewersRestaurantImageList[index],
                rating = Random.nextInt(2, 6),
                menus = menuBuilder.getSkewersMenu(restaurantId = id)
            )
        }
        return result
    }

    private fun getNoodleRestaurants(): List<RestaurantResource> {
        val result = noodleRestaurantNameList.mapIndexed { index, name ->
            val id = index + 80
            RestaurantResource(
                id = id,
                name = name,
                description = restaurantDescription,
                location = addressList[index],
                category = RestaurantType.Noodle,
                mainImageUrl = noodleRestaurantImageList[index],
                rating = Random.nextInt(2, 6),
                menus = menuBuilder.getNoodleMenu(restaurantId = id)
            )
        }
        return result
    }

    private fun getCurryRestaurants(): List<RestaurantResource> {
        val result = curryRestaurantNameList.mapIndexed { index, name ->
            val id = index + 90
            RestaurantResource(
                id = id,
                name = name,
                description = restaurantDescription,
                location = addressList[index],
                category = RestaurantType.Curry,
                mainImageUrl = curryRestaurantImageList[index],
                rating = Random.nextInt(2, 6),
                menus = menuBuilder.getCurryMenu(restaurantId = id)
            )
        }
        return result
    }

    private fun getDessertRestaurants(): List<RestaurantResource> {
        val result = dessertRestaurantNameList.mapIndexed { index, name ->
            val id = index + 100
            RestaurantResource(
                id = id,
                name = name,
                description = restaurantDescription,
                location = addressList[index],
                category = RestaurantType.Dessert,
                mainImageUrl = dessertRestaurantImageList[index],
                rating = Random.nextInt(2, 6),
                menus = menuBuilder.getDessertMenu(id)
            )
        }
        return result
    }

    /**
     * 잠시 둘것.
     */
    private fun getBannerRestaurants(): List<RestaurantResource> {
        val result = bannerNameList.mapIndexed { index, name ->
            val id = index + 200
            RestaurantResource(
                id = id,
                name = name,
                description = bannerSubtitleList[index],
                location = addressList[index],
                category = RestaurantType.Japanese,
                mainImageUrl = bannerImageList[index],
                rating = Random.nextInt(2, 6),
                menus = menuBuilder.getJapaneseMenu(id)
            )
        }
        return result
    }
}