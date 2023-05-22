package jp.co.momogo.di

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import jp.co.momogo.database.AppDatabase
import jp.co.momogo.database.RestaurantDao
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataBaseModule {

    @Provides
    @Singleton
    fun provideRoomDatabase(
        @ApplicationContext context: Context
    ) = Room.databaseBuilder(
        context, AppDatabase::class.java, "app.db"
    ).build()

    @Provides
    @Singleton
    fun provideRestaurantDao(database: AppDatabase): RestaurantDao =
        database.restaurantDao()
}