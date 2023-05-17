package jp.co.momogo.model

/**
 * Restaurant data model.
 */
data class Restaurant(
    val id: Int,
    val name: String,
    val location: String,
    val category: RestaurantType,
    val mainImageUrl: String,
    val rating: Int,
    val menus: List<Food> = emptyList(),
)

enum class RestaurantType(val displayName: String) {
    Japanese("和食"),
    Western("洋食"),
    Koreans("韓国料理"),
    Chinese("中華"),
    Seafood("寿司 · 海鮮"),
    Ramen("ラーメン"),
    Fried("揚げ物"),
    Skewers("串焼き"),
    Noodle("そば · うどん"),
    Curry("カレー"),
    Dessert("パン · デザート")
}