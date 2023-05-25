package jp.co.momogo.data

import jp.co.momogo.R
import jp.co.momogo.model.SearchSuggestion


/**
 * A static data store of [SearchSuggestion]s.
 */
object SearchSuggestionStore {

    val YESTERDAY_SUGGESTIONS = listOf(
        SearchSuggestion(
            R.drawable.ic_time,
            "星空の中へ",
            "東京都渋谷区渋谷3-15-4"
        ),
        SearchSuggestion(
            R.drawable.ic_home,
            "マチュリテ",
            "東京都渋谷区千駄ヶ谷5-24-2 新宿タカシマヤ 14F"
        )
    )

    val THIS_WEEK_SUGGESTIONS = listOf(
        SearchSuggestion(
            R.drawable.ic_time,
            "デジ家",
            "東京都江戸川区南篠崎町3-2-11"
        ),
        SearchSuggestion(
            R.drawable.ic_time,
            "焼肉トラジ",
            "東京都新宿区神楽坂3-2 神楽坂越後屋ビル　４F"
        ),
        SearchSuggestion(
            R.drawable.ic_time,
            "鶏そば十番156",
            "東京都渋谷区渋谷3-9-10 KDCビル B1F"
        )
    )
}