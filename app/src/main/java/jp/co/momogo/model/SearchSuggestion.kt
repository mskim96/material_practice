package jp.co.momogo.model

import androidx.annotation.DrawableRes

data class SearchSuggestion(
    @DrawableRes val iconResId: Int,
    val title: String,
    val subtitle: String
)