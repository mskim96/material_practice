package jp.co.momogo.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import jp.co.momogo.data.*
import jp.co.momogo.datasource.*
import jp.co.momogo.datasource.store.*

@Module
@InstallIn(SingletonComponent::class)
interface RepositoryModule {

    @Binds
    fun bindsArticlesRepository(articleRepository: ArticleRepositoryImpl): ArticleRepository

    @Binds
    fun bindsRestaurantsRepository(restaurantRepository: RestaurantRepositoryImpl): RestaurantRepository

    @Binds
    fun bindCuisineRepository(foodRepository: CuisineRepositoryImpl): CuisineRepository
}

@Module
@InstallIn(SingletonComponent::class)
interface DataSourceModule {

    @Binds
    fun bindsArticleDataSource(articleDataSource: ArticleDataSourceImpl): ArticleDataSource

    @Binds
    fun bindsRestaurantDataSource(restaurantDataSource: RestaurantDataSourceImpl): RestaurantDataSource

    @Binds
    fun bindsCuisineDataSource(cuisineDataSource: CuisineDataSourceImpl): CuisineDataSource
}