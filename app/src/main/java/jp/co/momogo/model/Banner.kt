package jp.co.momogo.model

/**
 * Banner data class.
 */
data class Banner(
    val title: String,
    val subTitle: String,
    val imageUrl: Image,
    val restaurantId: Int
)