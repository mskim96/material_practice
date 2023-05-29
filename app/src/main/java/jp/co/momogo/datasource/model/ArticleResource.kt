package jp.co.momogo.datasource.model

import androidx.annotation.StringRes
import jp.co.momogo.model.CuisineType

/**
 * Fake article resource that looks like it's from the network.
 */
data class ArticleResource(
    val id: Int,
    @StringRes val title: Int,
    @StringRes val body: Int,
    val attachment: List<String>,
    val cuisineType: List<CuisineType>,
    val like: Int,
    val author: UserResource
)
