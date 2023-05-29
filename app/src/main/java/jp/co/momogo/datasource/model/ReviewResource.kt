package jp.co.momogo.datasource.model

import androidx.annotation.StringRes
import jp.co.momogo.model.User

/**
 * Fake review resource that looks like it's from the network.
 */
data class ReviewResource(
    val id: Int,
    @StringRes val title: Int,
    @StringRes val body: Int,
    val rating: Double,
    val author: UserResource
)
