package jp.co.momogo.database

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface RestaurantDao {

    @Transaction
    @Query(
        """
        SELECT * FROM restaurant 
        WHERE 
            CASE WHEN :useTopRate
                THEN rating > :topRate
                ELSE rating < 4
            END
        LIMIT 10
    """
    )
    fun getRestaurantStream(
        useTopRate: Boolean = false,
        topRate: Int = 0,
    ): Flow<List<RestaurantWithMenu>>

    @Transaction
    @Query(
        """
        SELECT * FROM restaurant
        WHERE id = :restaurantId
    """
    )
    fun getRestaurantDetail(restaurantId: Int): Flow<RestaurantWithMenu>

    @Query(
        """
        SELECT * FROM restaurant
        WHERE id >= 200
    """
    )
    fun getBannerRestaurant(): Flow<List<RestaurantWithMenu>>

    /**
     * Insert menu into the db if they don't exist, and ignores those that do.
     */
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertOrIgnoreMenuResource(entities: List<MenuEntity>)

    /**
     * Insert restaurant into the db if they don't exist, and ignores those that do.
     */
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertOrIgnoreRestaurantResource(entities: RestaurantEntity)
}