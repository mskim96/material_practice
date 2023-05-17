package jp.co.momogo.data

import jp.co.momogo.data.staticdata.*
import jp.co.momogo.model.Food
import kotlin.random.Random

class RestaurantMenuBuilder {

    fun getJapaneseMenu(): List<Food> {
        val result = japaneseRestaurantMenuNameList.mapIndexed { index, name ->
            Food(
                id = index,
                name = name,
                imageUrl = japaneseRestaurantMenuImageList[index],
                price = Random.nextInt(1000, 3000),
            )
        }
        return result
    }

    fun getWesternMenu(): List<Food> {
        val result = westernRestaurantMenuNameList.mapIndexed { index, name ->
            Food(
                id = index + 8,
                name = name,
                imageUrl = westernRestaurantMenuImageList[index],
                price = Random.nextInt(1000, 3000)
            )
        }
        return result
    }

    fun getKoreanMenu(): List<Food> {
        val result = koreanRestaurantMenuNameList.mapIndexed { index, name ->
            Food(
                id = index + 16,
                name = name,
                imageUrl = koreanRestaurantMenuImageList[index],
                price = Random.nextInt(1000, 3000)
            )
        }
        return result
    }

    fun getChineseMenu(): List<Food> {
        val result = chineseRestaurantMenuNameList.mapIndexed { index, name ->
            Food(
                id = index + 24,
                name = name,
                imageUrl = chineseRestaurantMenuImageList[index],
                price = Random.nextInt(1000, 3000)
            )
        }
        return result
    }

    fun getSeafoodsMenu(): List<Food> {
        val result = seafoodRestaurantMenuNameList.mapIndexed { index, name ->
            Food(
                id = index + 32,
                name = name,
                imageUrl = seafoodRestaurantMenuImageList[index],
                price = Random.nextInt(1000, 3000)
            )
        }
        return result
    }

    fun getRamenMenu(): List<Food> {
        val result = ramenRestaurantMenuNameList.mapIndexed { index, name ->
            Food(
                id = index + 40,
                name = name,
                imageUrl = ramenRestaurantMenuImageList[index],
                price = Random.nextInt(1000, 3000)
            )
        }
        return result
    }

    fun getFriedMenu(): List<Food> {
        val result = friedRestaurantMenuNameList.mapIndexed { index, name ->
            Food(
                id = index + 48,
                name = name,
                imageUrl = friedRestaurantMenuImageList[index],
                price = Random.nextInt(1000, 3000)
            )
        }
        return result
    }

    fun getSkewersMenu(): List<Food> {
        val result = skewersRestaurantMenuNameList.mapIndexed { index, name ->
            Food(
                id = index + 56,
                name = name,
                imageUrl = skewersRestaurantMenuImageList[index],
                price = Random.nextInt(1000, 3000)
            )
        }
        return result
    }

    fun getNoodleMenu(): List<Food> {
        val result = noodleRestaurantMenuNameList.mapIndexed { index, name ->
            Food(
                id = index + 64,
                name = name,
                imageUrl = noodleRestaurantMenuImageList[index],
                price = Random.nextInt(1000, 3000)
            )
        }
        return result
    }

    fun getCurryMenu(): List<Food> {
        val result = curryRestaurantMenuNameList.mapIndexed { index, name ->
            Food(
                id = index + 72,
                name = name,
                imageUrl = curryRestaurantMenuImageList[index],
                price = Random.nextInt(1000, 3000)
            )
        }
        return result
    }

    fun getDessertMenu(): List<Food> {
        val result = dessertRestaurantMenuNameList.mapIndexed { index, name ->
            Food(
                id = index + 80,
                name = name,
                imageUrl = dessertRestaurantMenuImageList[index],
                price = Random.nextInt(1000, 3000)
            )
        }
        return result
    }
}