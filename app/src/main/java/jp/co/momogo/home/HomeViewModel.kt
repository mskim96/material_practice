package jp.co.momogo.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import jp.co.momogo.data.RestaurantQuery
import jp.co.momogo.data.RestaurantRepository
import jp.co.momogo.model.*
import jp.co.momogo.model.SuggestionType.*
import jp.co.momogo.utils.Result.*
import jp.co.momogo.utils.asResult
import kotlinx.coroutines.flow.*
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    restaurantRepository: RestaurantRepository
) : ViewModel() {

    /**
     * Get restaurants.
     */
    private val preferenceRestaurants = restaurantRepository.getRestaurants()
    private val populateRestaurants = restaurantRepository.getRestaurants(
        RestaurantQuery(filterTopRate = 4)
    )
    private val getNearDistanceRestaurants = restaurantRepository.getRestaurants()

    val banners = restaurantRepository.getBannerRestaurant().map { it.take(6).toBanner() }
        .stateIn(
            scope = viewModelScope,
            started = SharingStarted.WhileSubscribed(0),
            initialValue = emptyList()
        )

    /**
     * Combine restaurants and wrap with suggestion types.
     */
    private val restaurantsWithType = combine(
        preferenceRestaurants,
        populateRestaurants,
        getNearDistanceRestaurants
    ) { _prefer, _popular, _near ->
        listOf(
            /**
             * Take only 10 restaurants.
             */
            _prefer.withSuggestionType(type = PreferenceCategory),
            _popular.withSuggestionType(type = Populate),
            /*_near.asReversed().withSuggestionType(type = NearDistance)*/
        )
    }
        .distinctUntilChanged()
        .asResult()

    /**
     * State flow for home restaurant data.
     */
    val homeUiState: StateFlow<HomeUiState> = restaurantsWithType.map { state ->
        when (state) {
            is Loading -> HomeUiState.Loading
            is Success -> {
                HomeUiState.RestaurantsWithType(
                    data = state.data
                )
            }
            is Error -> HomeUiState.Error(state.exception?.message)
        }
    }.stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(5_000),
        initialValue = HomeUiState.Loading
    )
}

/**
 * Sealed interface for home ui state.
 */
sealed interface HomeUiState {
    object Loading : HomeUiState

    data class RestaurantsWithType(
        val data: List<RestaurantWithSuggestionType>
    ) : HomeUiState

    data class Error(val exception: String?) : HomeUiState
}