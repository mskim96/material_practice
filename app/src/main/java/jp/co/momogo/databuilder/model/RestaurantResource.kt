package jp.co.momogo.databuilder.model

import jp.co.momogo.database.RestaurantEntity
import jp.co.momogo.model.RestaurantType

/**
 * Fake restaurants resource that looks like it's from the network.
 */
data class RestaurantResource(
    val id: Int,
    val name: String,
    val description: String,
    val location: String,
    val category: RestaurantType,
    val mainImageUrl: String,
    val rating: Int,
    val menus: List<MenuResource>,
)

fun RestaurantResource.toEntity() = RestaurantEntity(
    id = id,
    name = name,
    description = description,
    location = location,
    category = category,
    mainImageUrl = mainImageUrl,
    rating = rating,
)