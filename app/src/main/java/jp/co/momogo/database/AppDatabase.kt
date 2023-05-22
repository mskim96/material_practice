package jp.co.momogo.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

/**
 * Application local database.
 */
@Database(
    entities = [RestaurantEntity::class, MenuEntity::class],
    version = 1,
    exportSchema = false
)
@TypeConverters(CategoryConverter::class)
abstract class AppDatabase : RoomDatabase() {

    abstract fun restaurantDao(): RestaurantDao

}