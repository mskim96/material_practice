package jp.co.momogo.detail

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import jp.co.momogo.data.RestaurantRepository
import jp.co.momogo.model.Restaurant
import jp.co.momogo.ui.RESTAURANT_ID
import jp.co.momogo.utils.Result
import jp.co.momogo.utils.asResult
import kotlinx.coroutines.flow.*
import javax.inject.Inject

@HiltViewModel
class RestaurantDetailViewModel @Inject constructor(
    restaurantRepository: RestaurantRepository,
    savedStateHandle: SavedStateHandle
) : ViewModel() {

    private val restaurantId = savedStateHandle.getStateFlow(RESTAURANT_ID, 0)
    private val restaurantDetail = restaurantId.map {
        restaurantRepository.getRestaurantDetails(it)
    }
        .flattenConcat()
        .asResult()

    val restaurantDetailUiState: StateFlow<RestaurantDetailUiState> =
        restaurantDetail.map { state ->
            when (state) {
                is Result.Loading -> RestaurantDetailUiState.Loading
                is Result.Success -> RestaurantDetailUiState.RestaurantDetail(state.data)
                is Result.Error -> RestaurantDetailUiState.Error(state.exception?.message)
            }
        }
            .stateIn(
                scope = viewModelScope,
                started = SharingStarted.WhileSubscribed(5_000L),
                initialValue = RestaurantDetailUiState.Loading
            )
}

sealed interface RestaurantDetailUiState {
    object Loading : RestaurantDetailUiState
    data class RestaurantDetail(val data: Restaurant) : RestaurantDetailUiState
    data class Error(val exception: String?) : RestaurantDetailUiState
}