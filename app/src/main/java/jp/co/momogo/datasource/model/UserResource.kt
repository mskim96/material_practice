package jp.co.momogo.datasource.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

/**
 * Fake user resource that looks like it's from the network.
 */
data class UserResource(
    val id: Int,
    @StringRes val username: Int,
    @DrawableRes val profileImage: Int
)
