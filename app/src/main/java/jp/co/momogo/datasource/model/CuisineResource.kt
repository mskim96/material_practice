package jp.co.momogo.datasource.model

import androidx.annotation.StringRes
import jp.co.momogo.model.CuisineType

/**
 * Fake cuisine resource that looks like it's from the network.
 */
data class CuisineResource(
    val id: Int,
    val name: String,
    @StringRes val description: Int,
    val cuisineType: List<CuisineType>,
    val imageUrl: String,
    val price: Int
)