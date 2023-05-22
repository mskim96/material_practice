package jp.co.momogo.database

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.Relation
import jp.co.momogo.model.Restaurant
import jp.co.momogo.model.RestaurantType
import jp.co.momogo.model.toImage

/**
 * Restaurant entity.
 */
@Entity(tableName = "restaurant")
data class RestaurantEntity(
    @PrimaryKey val id: Int,
    val name: String,
    val description: String,
    val location: String,
    val category: RestaurantType,
    val mainImageUrl: String,
    val rating: Int,
)

/**
 * Restaurant with menu class for Room.
 */
data class RestaurantWithMenu(
    @Embedded val restaurant: RestaurantEntity,
    @Relation(
        parentColumn = "id",
        entityColumn = "restaurantId"
    )
    val menus: List<MenuEntity>
)

fun RestaurantWithMenu.toExternal() = Restaurant(
    id = restaurant.id,
    name = restaurant.name,
    description = restaurant.description,
    location = restaurant.location,
    category = restaurant.category,
    mainImageUrl = restaurant.mainImageUrl.toImage(),
    rating = restaurant.rating,
    menus = menus.toExternal()
)

@JvmName("RestaurantWithMenuToExternal")
fun List<RestaurantWithMenu>.toExternal() = map(RestaurantWithMenu::toExternal)