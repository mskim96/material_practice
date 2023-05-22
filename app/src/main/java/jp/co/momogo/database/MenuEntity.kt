package jp.co.momogo.database

import androidx.room.Entity
import androidx.room.PrimaryKey
import jp.co.momogo.model.Menu
import jp.co.momogo.model.toImage

/**
 * Menu entity.
 */
@Entity(tableName = "menu")
data class MenuEntity(
    @PrimaryKey val id: Int,
    val name: String,
    val description: String,
    val imageUrl: String,
    val price: Int,
    val restaurantId: Int
)

fun MenuEntity.toExternal() = Menu(
    id = id,
    name = name,
    description = description,
    imageUrl = imageUrl.toImage(),
    price = price,
)

@JvmName("MenuEntityToExternal")
fun List<MenuEntity>.toExternal() = map(MenuEntity::toExternal)