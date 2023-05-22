package jp.co.momogo.databuilder

import jp.co.momogo.databuilder.model.MenuResource
import jp.co.momogo.databuilder.staticdata.*
import kotlin.random.Random

class RestaurantMenuBuilder {

    fun getJapaneseMenu(restaurantId: Int): List<MenuResource> {
        val result = japaneseRestaurantMenuNameList.mapIndexed { index, name ->
            MenuResource(
                id = index * restaurantId,
                name = name,
                description = japaneseRestaurantMenuDescriptionList[index],
                imageUrl = japaneseRestaurantMenuImageList[index],
                price = Random.nextInt(1000, 3000),
                restaurantId = restaurantId
            )
        }
        return result
    }

    fun getWesternMenu(restaurantId: Int): List<MenuResource> {
        val result = westernRestaurantMenuNameList.mapIndexed { index, name ->
            MenuResource(
                id = index + 8 * restaurantId,
                name = name,
                description = westernRestaurantMenuDescriptionList[index],
                imageUrl = westernRestaurantMenuImageList[index],
                price = Random.nextInt(1000, 3000),
                restaurantId = restaurantId
            )
        }
        return result
    }

    fun getKoreanMenu(restaurantId: Int): List<MenuResource> {
        val result = koreanRestaurantMenuNameList.mapIndexed { index, name ->
            MenuResource(
                id = index + 16 * restaurantId,
                name = name,
                description = koreanRestaurantMenuDescriptionList[index],
                imageUrl = koreanRestaurantMenuImageList[index],
                price = Random.nextInt(1000, 3000),
                restaurantId = restaurantId
            )
        }
        return result
    }

    fun getChineseMenu(restaurantId: Int): List<MenuResource> {
        val result = chineseRestaurantMenuNameList.mapIndexed { index, name ->
            MenuResource(
                id = index + 24 * restaurantId,
                name = name,
                description = chineseRestaurantMenuDescriptionList[index],
                imageUrl = chineseRestaurantMenuImageList[index],
                price = Random.nextInt(1000, 3000),
                restaurantId = restaurantId
            )
        }
        return result
    }

    fun getSeafoodsMenu(restaurantId: Int): List<MenuResource> {
        val result = seafoodRestaurantMenuNameList.mapIndexed { index, name ->
            MenuResource(
                id = index + 32 * restaurantId,
                name = name,
                description = seafoodRestaurantMenuDescriptionList[index],
                imageUrl = seafoodRestaurantMenuImageList[index],
                price = Random.nextInt(1000, 3000),
                restaurantId = restaurantId
            )
        }
        return result
    }

    fun getRamenMenu(restaurantId: Int): List<MenuResource> {
        val result = ramenRestaurantMenuNameList.mapIndexed { index, name ->
            MenuResource(
                id = index + 40 * restaurantId,
                name = name,
                description = ramenRestaurantMenuDescriptionList[index],
                imageUrl = ramenRestaurantMenuImageList[index],
                price = Random.nextInt(1000, 3000),
                restaurantId = restaurantId
            )
        }
        return result
    }

    fun getFriedMenu(restaurantId: Int): List<MenuResource> {
        val result = friedRestaurantMenuNameList.mapIndexed { index, name ->
            MenuResource(
                id = index + 48 * restaurantId,
                name = name,
                description = friedRestaurantMenuDescriptionList[index],
                imageUrl = friedRestaurantMenuImageList[index],
                price = Random.nextInt(1000, 3000),
                restaurantId = restaurantId
            )
        }
        return result
    }

    fun getSkewersMenu(restaurantId: Int): List<MenuResource> {
        val result = skewersRestaurantMenuNameList.mapIndexed { index, name ->
            MenuResource(
                id = index + 56 * restaurantId,
                name = name,
                description = skewersRestaurantMenuDescriptionList[index],
                imageUrl = skewersRestaurantMenuImageList[index],
                price = Random.nextInt(1000, 3000),
                restaurantId = restaurantId
            )
        }
        return result
    }

    fun getNoodleMenu(restaurantId: Int): List<MenuResource> {
        val result = noodleRestaurantMenuNameList.mapIndexed { index, name ->
            MenuResource(
                id = index + 64 * restaurantId,
                name = name,
                description = noodleRestaurantMenuDescriptionList[index],
                imageUrl = noodleRestaurantMenuImageList[index],
                price = Random.nextInt(1000, 3000),
                restaurantId = restaurantId
            )
        }
        return result
    }

    fun getCurryMenu(restaurantId: Int): List<MenuResource> {
        val result = curryRestaurantMenuNameList.mapIndexed { index, name ->
            MenuResource(
                id = index + 72 * restaurantId,
                name = name,
                description = curryRestaurantMenuDescriptionList[index],
                imageUrl = curryRestaurantMenuImageList[index],
                price = Random.nextInt(1000, 3000),
                restaurantId = restaurantId
            )
        }
        return result
    }

    fun getDessertMenu(restaurantId: Int): List<MenuResource> {
        val result = dessertRestaurantMenuNameList.mapIndexed { index, name ->
            MenuResource(
                id = index + 80 * restaurantId,
                name = name,
                description = dessertRestaurantMenuDescriptionList[index],
                imageUrl = dessertRestaurantMenuImageList[index],
                price = Random.nextInt(1000, 3000),
                restaurantId = restaurantId
            )
        }
        return result
    }
}