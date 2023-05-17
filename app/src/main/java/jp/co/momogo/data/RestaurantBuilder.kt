package jp.co.momogo.data

import jp.co.momogo.data.staticdata.*
import jp.co.momogo.di.Dispatcher
import jp.co.momogo.di.MomogoDispatchers.*
import jp.co.momogo.model.Restaurant
import jp.co.momogo.model.RestaurantType
import jp.co.momogo.utils.combine
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
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
    fun getRestaurants(): Flow<List<Restaurant>> {
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

        return combine(
            japanese,
            western,
            koreans,
            chinese,
            seafoods,
            ramen,
            fried,
            skewers,
            noodle,
            curry,
            dessert
        ) { _japan, _western, _korean, _chines, _seafood, _ramen, _fried, _skewers, _noodle, _curry, _dessert ->
            _japan + _western + _korean + _chines + _seafood + _ramen + _fried + _skewers + _noodle + _curry + _dessert
        }
            .distinctUntilChanged()
            .flowOn(dispatcher)
    }

    private fun getJapanesesRestaurants(): Flow<List<Restaurant>> = flow {
        val result = japaneseRestaurantNameList.mapIndexed { index, name ->
            Restaurant(
                id = index,
                name = name,
                location = addressList[index],
                category = RestaurantType.Japanese,
                mainImageUrl = japaneseRestaurantImageList[index],
                rating = Random.nextInt(2, 6),
                menus = menuBuilder.getJapaneseMenu()
            )
        }
        emit(result)
    }

    private fun getWesternRestaurants(): Flow<List<Restaurant>> = flow {
        val result = westernRestaurantNameList.mapIndexed { index, name ->
            Restaurant(
                id = index + 10,
                name = name,
                location = addressList[index],
                category = RestaurantType.Western,
                mainImageUrl = westernRestaurantImageList[index],
                rating = Random.nextInt(2, 6),
                menus = menuBuilder.getWesternMenu()
            )
        }
        emit(result)
    }

    private fun getKoreansRestaurants(): Flow<List<Restaurant>> = flow {
        val result = koreanRestaurantNameList.mapIndexed { index, name ->
            Restaurant(
                id = index + 20,
                name = name,
                location = addressList[index],
                category = RestaurantType.Koreans,
                mainImageUrl = koreanRestaurantImageList[index],
                rating = Random.nextInt(2, 6),
                menus = menuBuilder.getKoreanMenu()
            )
        }
        emit(result)
    }

    private fun getChineseRestaurants(): Flow<List<Restaurant>> = flow {
        val result = chineseRestaurantNameList.mapIndexed { index, name ->
            Restaurant(
                id = index + 30,
                name = name,
                location = addressList[index],
                category = RestaurantType.Chinese,
                mainImageUrl = chineseRestaurantImageList[index],
                rating = Random.nextInt(2, 6),
                menus = menuBuilder.getChineseMenu()
            )
        }
        emit(result)
    }

    private fun getSeafoodsRestaurants(): Flow<List<Restaurant>> = flow {
        val result = seafoodRestaurantNameList.mapIndexed { index, name ->
            Restaurant(
                id = index + 40,
                name = name,
                location = addressList[index],
                category = RestaurantType.Seafood,
                mainImageUrl = seafoodRestaurantImageList[index],
                rating = Random.nextInt(2, 6),
                menus = menuBuilder.getSeafoodsMenu()
            )
        }
        emit(result)
    }

    private fun getRamenRestaurants(): Flow<List<Restaurant>> = flow {
        val result = ramenRestaurantNameList.mapIndexed { index, name ->
            Restaurant(
                id = index + 50,
                name = name,
                location = addressList[index],
                category = RestaurantType.Ramen,
                mainImageUrl = ramenRestaurantImageList[index],
                rating = Random.nextInt(2, 6),
                menus = menuBuilder.getRamenMenu()
            )
        }
        emit(result)
    }

    private fun getFriedRestaurants(): Flow<List<Restaurant>> = flow {
        val result = friedRestaurantNameList.mapIndexed { index, name ->
            Restaurant(
                id = index + 60,
                name = name,
                location = addressList[index],
                category = RestaurantType.Fried,
                mainImageUrl = friedRestaurantImageList[index],
                rating = Random.nextInt(2, 6),
                menus = menuBuilder.getFriedMenu()
            )
        }
        emit(result)
    }

    private fun getSkewersRestaurants(): Flow<List<Restaurant>> = flow {
        val result = skewersRestaurantNameList.mapIndexed { index, name ->
            Restaurant(
                id = index + 70,
                name = name,
                location = addressList[index],
                category = RestaurantType.Skewers,
                mainImageUrl = skewersRestaurantImageList[index],
                rating = Random.nextInt(2, 6),
                menus = menuBuilder.getSkewersMenu()
            )
        }
        emit(result)
    }

    private fun getNoodleRestaurants(): Flow<List<Restaurant>> = flow {
        val result = noodleRestaurantNameList.mapIndexed { index, name ->
            Restaurant(
                id = index + 80,
                name = name,
                location = addressList[index],
                category = RestaurantType.Noodle,
                mainImageUrl = noodleRestaurantImageList[index],
                rating = Random.nextInt(2, 6),
                menus = menuBuilder.getNoodleMenu()
            )
        }
        emit(result)
    }

    private fun getCurryRestaurants(): Flow<List<Restaurant>> = flow {
        val result = curryRestaurantNameList.mapIndexed { index, name ->
            Restaurant(
                id = index + 90,
                name = name,
                location = addressList[index],
                category = RestaurantType.Curry,
                mainImageUrl = curryRestaurantImageList[index],
                rating = Random.nextInt(2, 6),
                menus = menuBuilder.getCurryMenu()
            )
        }
        emit(result)
    }

    private fun getDessertRestaurants(): Flow<List<Restaurant>> = flow {
        val result = dessertRestaurantNameList.mapIndexed { index, name ->
            Restaurant(
                id = index + 100,
                name = name,
                location = addressList[index],
                category = RestaurantType.Dessert,
                mainImageUrl = dessertRestaurantImageList[index],
                rating = Random.nextInt(2, 6),
                menus = menuBuilder.getDessertMenu()
            )
        }
        emit(result)
    }
}