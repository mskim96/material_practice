package jp.co.momogo.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

/**
 * Simple user data class for display a [Review] and [Article].
 */
data class User(
    val id: Int,
    @StringRes val username: Int,
    @DrawableRes val profileImage: Int
)
