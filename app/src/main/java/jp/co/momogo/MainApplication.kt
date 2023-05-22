package jp.co.momogo

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import jp.co.momogo.data.RestaurantRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltAndroidApp
class MainApplication : Application() {

    @Inject
    lateinit var restaurantRepository: RestaurantRepository
    private val applicationScope = CoroutineScope(SupervisorJob() + Dispatchers.Default)
    override fun onCreate() {
        super.onCreate()

        applicationScope.launch {
            restaurantRepository.synchronize()
        }
    }
}