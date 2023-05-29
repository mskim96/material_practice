package jp.co.momogo.model

/**
 * Cuisine type class.
 */
enum class CuisineType(
    val displayName: String, val queryName: String
) {
    Japanese(
        displayName = "Japanese",
        queryName = "japan"
    ),

    Western(
        displayName = "Western",
        queryName = "western"
    ),

    Korean(
        displayName = "Korean",
        queryName = "korea"
    ),

    Chinese(
        displayName = "Chinese",
        queryName = "china"
    ),

    Noodle(
        displayName = "Noodle",
        queryName = "noodle"
    ),

    Meat(
        displayName = "Meat",
        queryName = "meat"
    ),

    SeaFood(
        displayName = "Seafood",
        queryName = "meat"
    ),

    Dessert(
        displayName = "Dessert",
        queryName = "dessert"
    ),

    None(
        displayName = "All",
        queryName = ""
    ),
}

/**
 * String to [CuisineType]
 */
fun String?.asCuisineType() = when (this) {
    null -> CuisineType.None
    else -> CuisineType.values()
        .firstOrNull { type -> type.displayName == this }
        ?: CuisineType.None
}