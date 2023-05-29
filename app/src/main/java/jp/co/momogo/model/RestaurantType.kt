package jp.co.momogo.model

/**
 * Restaurant Types.
 */
enum class RestaurantType(val displayName: String, val queryName: String) {

    Japanese(
        displayName = "Japanese Restaurant",
        queryName = "japan"
    ),

    Western(
        displayName = "Western Restaurant",
        queryName = "western"
    ),

    Korean(
        displayName = "Korean Restaurant",
        queryName = "korea"
    ),

    Chinese(
        displayName = "Chinese Restaurant",
        queryName = "china"
    ),

    Dessert(
        displayName = "Caffe",
        queryName = "dessert"
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
}