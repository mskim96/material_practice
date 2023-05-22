package jp.co.momogo.databuilder.model

import jp.co.momogo.database.MenuEntity

/**
 * Fake menu resource that looks like it's from the network.
 */
data class MenuResource(
    val id: Int,
    val name: String,
    val description: String,
    val imageUrl: String,
    val price: Int,
    val restaurantId: Int
)

fun MenuResource.toEntity() = MenuEntity(
    id = id,
    name = name,
    description = description,
    imageUrl = imageUrl,
    price = price,
    restaurantId = restaurantId
)

@JvmName("MenuResourceToEntity")
fun List<MenuResource>.toEntity() = map(MenuResource::toEntity)