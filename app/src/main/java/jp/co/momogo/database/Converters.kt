package jp.co.momogo.database

import androidx.room.TypeConverter
import jp.co.momogo.model.RestaurantType
import jp.co.momogo.model.asRestaurantType

class CategoryConverter {

    @TypeConverter
    fun stringToCategory(displayName: String?): RestaurantType =
        displayName.asRestaurantType()

    @TypeConverter
    fun categoryToString(value: RestaurantType?): String? =
        value?.let(RestaurantType::displayName)

}