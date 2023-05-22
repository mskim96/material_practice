package jp.co.momogo.model

/**
 * Restaurant data model.
 */
data class Restaurant(
    val id: Int,
    val name: String,
    val description: String,
    val location: String,
    val category: RestaurantType,
    val mainImageUrl: Image,
    val rating: Int,
    val menus: List<Menu> = emptyList(),
) {
    val imageList: List<Image>
        get() {
            val main = listOf(mainImageUrl)
            val result = menus.map { it.imageUrl }
            return main + result
        }
}

fun Restaurant.toBanner() = Banner(
    restaurantId = id,
    title = name,
    subTitle = description,
    imageUrl = mainImageUrl
)

@JvmName("restaurantToBanners")
fun List<Restaurant>.toBanner() = map(Restaurant::toBanner)