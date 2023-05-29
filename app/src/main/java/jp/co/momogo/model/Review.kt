package jp.co.momogo.model

import androidx.annotation.StringRes

/**
 * Review external model.
 */
data class Review(
    val id: Int,
    @StringRes val title: Int,
    @StringRes val body: Int,
    val rating: Double,
    val author: User
)
