package jp.co.momogo.model

import androidx.annotation.StringRes

/**
 * Article external model.
 */
data class Article(
    val id: Int,
    @StringRes val title: Int,
    @StringRes val body: Int,
    val cuisineType: List<CuisineType>,
    val attachment: List<String>,
    val like: Int,
    val author: User
)