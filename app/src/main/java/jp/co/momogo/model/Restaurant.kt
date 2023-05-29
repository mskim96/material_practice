package jp.co.momogo.model

import androidx.annotation.StringRes

/**
 * Restaurant external model.
 */
data class Restaurant(
    val id: Int,
    val name: String,
    @StringRes val description: Int,
    val location: String,
    val distance: Double,
    val category: List<CuisineType>,
    val rating: Double,
    val restaurantImages: List<String>,
    val menus: Menu,
    val review: List<Review>
)