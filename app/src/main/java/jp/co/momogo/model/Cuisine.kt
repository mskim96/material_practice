package jp.co.momogo.model

import androidx.annotation.StringRes

/**
 * Cuisine external model.
 */
data class Cuisine(
    val id: Int,
    val foodName: String,
    @StringRes val description: Int,
    val cuisineType: List<CuisineType>,
    val imageUrl: String,
    val price: Int
)