package jp.co.momogo.datasource.model

import androidx.annotation.StringRes
import jp.co.momogo.model.CuisineType

/**
 * Fake restaurant resource that looks like it's from the network.
 */
data class RestaurantResource(
    val id: Int,
    val name: String,
    @StringRes val description: Int,
    val location: String,
    val distance: Double,
    val category: List<CuisineType>,
    val rating: Double,
    val restaurantImages: List<String>,
    val menus: MenuResource,
    val review: List<ReviewResource>
)