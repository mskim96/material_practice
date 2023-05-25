package jp.co.momogo.detail

import android.util.Log
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import jp.co.momogo.data.RestaurantRepository
import jp.co.momogo.home.HomeUiState
import jp.co.momogo.model.Menu
import jp.co.momogo.model.Restaurant
import jp.co.momogo.model.Review
import jp.co.momogo.utils.Result
import jp.co.momogo.utils.asResult
import kotlinx.coroutines.flow.*
import javax.inject.Inject

/**
 * Detail viewModel for restaurant detail information.
 *
 * @param savedStateHandle this saved state handle is provide from hilt with navigation safeArgs.
 * @see [this](https://proandroiddev.com/passing-safe-args-to-your-viewmodel-with-hilt-366762ff3f57)
 */
@HiltViewModel
class DetailViewModel @Inject constructor(
    restaurantRepository: RestaurantRepository,
    private val savedStateHandle: SavedStateHandle
) : ViewModel() {

    private val restaurantIds = savedStateHandle.getStateFlow(RESTAURANT_IDS, 0)
    private val getRestaurantDetails =
        restaurantIds.map { restaurantRepository.getRestaurantDetails(it) }
            .flattenConcat()
            .asResult()

    val detailUiState: StateFlow<DetailUiState> = getRestaurantDetails.map { state ->
        when (state) {
            is Result.Loading -> DetailUiState.Loading
            is Result.Success -> DetailUiState.RestaurantDetail(data = state.data)
            is Result.Error -> DetailUiState.Error(exception = state.exception?.message)
        }
    }.stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(5_000),
        initialValue = DetailUiState.Loading
    )
}

sealed interface DetailUiState {
    object Loading : DetailUiState
    data class RestaurantDetail(val data: Restaurant) : DetailUiState
    data class Error(val exception: String?) : DetailUiState
}

const val RESTAURANT_IDS = "restaurantId"