package jp.co.momogo.model

data class RestaurantWithSuggestionType(
    val type: SuggestionType,
    val restaurants: List<Restaurant>
)

enum class SuggestionType(val displayName: String, val subTitle: String) {
    PreferenceCategory("好みのカテゴリーからおすすめ", "あなたの"),
    Populate("急上昇の店", "最近"),
    NearDistance("近い店", "今の距離から");
}

@JvmName("MappingRestaurantListWithSuggestionType")
fun List<Restaurant>.withSuggestionType(type: SuggestionType) = RestaurantWithSuggestionType(
    type = type,
    restaurants = this
)