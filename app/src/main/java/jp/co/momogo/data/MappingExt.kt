package jp.co.momogo.data

import jp.co.momogo.datasource.model.*
import jp.co.momogo.model.*

/**
 * Mapping [ArticleResource] to an [Article]
 */
fun ArticleResource.asExternal() = Article(
    id = id,
    title = title,
    body = body,
    cuisineType = cuisineType,
    attachment = attachment,
    like = like,
    author = author.asExternal()
)

@JvmName("ArticleResourceToExternal")
fun List<ArticleResource>.asExternal() = map(ArticleResource::asExternal)

/**
 * Mapping [UserResource] to an [User]
 */
fun UserResource.asExternal() = User(
    id = id,
    username = username,
    profileImage = profileImage
)

/**
 * Mapping [CuisineResource] to an [Cuisine]
 */
fun CuisineResource.asExternal() = Cuisine(
    id = id,
    foodName = name,
    description = description,
    cuisineType = cuisineType,
    imageUrl = imageUrl,
    price = price
)

@JvmName("FoodResourceToExternalModel")
fun List<CuisineResource>.asExternal() = map(CuisineResource::asExternal)

/**
 * Mapping [MenuResource] to an [Menu]
 */
fun MenuResource.asExternal() = Menu(
    menuList = menuList.asExternal()
)

/**
 * Mapping [ReviewResource] to an [Review]
 */
fun ReviewResource.asExternal() = Review(
    id = id,
    title = title,
    body = body,
    rating = rating,
    author = author.asExternal()
)

@JvmName("ReviewResourceToExternalModel")
fun List<ReviewResource>.asExternal() = map(ReviewResource::asExternal)

/**
 * Mapping [RestaurantResource] to an [Restaurant]
 */
fun RestaurantResource.asExternal() = Restaurant(
    id = id,
    name = name,
    description = description,
    location = location,
    category = category,
    distance = distance,
    rating = rating,
    restaurantImages = restaurantImages,
    menus = menus.asExternal(),
    review = review.asExternal()
)

fun List<RestaurantResource>.asExternal() = map(RestaurantResource::asExternal)