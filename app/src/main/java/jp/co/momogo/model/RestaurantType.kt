package jp.co.momogo.model

/**
 * Restaurant Types.
 */
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

    Dessert("パン · デザート"),

    Nothing("Unknown")
}

fun String?.asRestaurantType() = when (this) {
    null -> RestaurantType.Nothing
    else -> RestaurantType.values()
        .firstOrNull { type -> type.displayName == this }
        ?: RestaurantType.Nothing
}