package jp.co.momogo.di

import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import jp.co.momogo.data.RestaurantMenuBuilder
import jp.co.momogo.data.RestaurantRepository
import jp.co.momogo.data.RestaurantRepositoryImpl
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import javax.inject.Qualifier
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface RepositoryModule {

    @Binds
    fun bindsRestaurantsRepository(restaurantRepository: RestaurantRepositoryImpl): RestaurantRepository
}

@Module
@InstallIn(SingletonComponent::class)
object BuilderModule {

    @Provides
    @Singleton
    fun providesRestaurantMenuBuilder(): RestaurantMenuBuilder = RestaurantMenuBuilder()
}

@Module
@InstallIn(SingletonComponent::class)
object DispatchersModule {
    @Provides
    @Dispatcher(MomogoDispatchers.IO)
    fun providesIODispatcher(): CoroutineDispatcher = Dispatchers.IO

    @Provides
    @Dispatcher(MomogoDispatchers.Default)
    fun providesDefaultDispatcher(): CoroutineDispatcher = Dispatchers.Default
}

@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class Dispatcher(val momogoDispatcher: MomogoDispatchers)

enum class MomogoDispatchers {
    Default,
    IO,
}