package jp.co.momogo.home

import android.util.Log
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import jp.co.momogo.data.ArticleRepository
import jp.co.momogo.data.CuisineRepository
import jp.co.momogo.data.RestaurantRepository
import jp.co.momogo.model.Article
import jp.co.momogo.model.Cuisine
import jp.co.momogo.model.CuisineType
import jp.co.momogo.model.CuisineType.None
import jp.co.momogo.model.Restaurant
import jp.co.momogo.ui.FOOD_FILTER_KEY
import jp.co.momogo.utils.Result.*
import jp.co.momogo.utils.asResult
import kotlinx.coroutines.flow.*
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    cuisineRepository: CuisineRepository,
    restaurantRepository: RestaurantRepository,
    articleRepository: ArticleRepository,
    private val savedStateHandle: SavedStateHandle
) : ViewModel() {

    private val _savedFilterType = savedStateHandle.getStateFlow(FOOD_FILTER_KEY, None)

    val cuisineAndRestaurantUiState: StateFlow<CuisineAndRestaurantUiState> =
        cuisineAndRestaurantUiState(
            cuisineType = _savedFilterType,
            cuisineRepository = cuisineRepository,
            restaurantRepository = restaurantRepository
        ).stateIn(
            scope = viewModelScope,
            started = SharingStarted.WhileSubscribed(5_000L),
            initialValue = CuisineAndRestaurantUiState.Loading
        )

    val articleUiState: StateFlow<ArticleUiState> =
        articleUiState(
            cuisineType = _savedFilterType,
            articleRepository = articleRepository
        ).stateIn(
            scope = viewModelScope,
            started = SharingStarted.WhileSubscribed(5_000L),
            initialValue = ArticleUiState.Loading
        )

    fun setFilterCategory(category: CuisineType) {
        savedStateHandle[FOOD_FILTER_KEY] = category
    }

    private fun cuisineAndRestaurantUiState(
        cuisineType: Flow<CuisineType>,
        cuisineRepository: CuisineRepository,
        restaurantRepository: RestaurantRepository
    ): Flow<CuisineAndRestaurantUiState> {
        // Observe cuisines and restaurants.
        val cuisinesStream = cuisineRepository.getFoodsStream()
        val restaurantsStream = restaurantRepository.getRestaurantsStream()

        return combine(
            cuisineType,
            cuisinesStream,
            restaurantsStream,
        ) { type, cuisines, restaurants ->
            Log.d("TAG", "cuisineAndRestaurantUiState: $type")
            val filteredCuisines = filteredItems(type, cuisines, cuisineFilterPredicate)
            val filteredRestaurants =
                filteredItems(type, restaurants, restaurantFilterPredicate)
            Pair(filteredCuisines, filteredRestaurants)
        }
            .asResult()
            .map { result ->
                when (result) {
                    is Success -> {
                        val (cuisines, restaurants) = result.data
                        CuisineAndRestaurantUiState.CuisineAndRestaurant(
                            cuisines = cuisines,
                            restaurants = restaurants
                        )
                    }
                    is Loading -> CuisineAndRestaurantUiState.Loading
                    is Error -> CuisineAndRestaurantUiState.Error(result.exception?.message)
                }
            }
    }

    private fun articleUiState(
        cuisineType: Flow<CuisineType>,
        articleRepository: ArticleRepository
    ): Flow<ArticleUiState> {

        val articlesStream = articleRepository.getArticlesStream()
        return combine(cuisineType, articlesStream) { type, articles ->
            filteredItems(type = type, items = articles, articleFilterPredicate)
        }
            .asResult()
            .map { result ->
                when (result) {
                    is Success -> ArticleUiState.ArticleData(articles = result.data)
                    is Loading -> ArticleUiState.Loading
                    is Error -> ArticleUiState.Error(result.exception?.message)
                }
            }
    }
}

/**
 * Cuisine and restaurant ui state.
 */
sealed interface CuisineAndRestaurantUiState {
    object Loading : CuisineAndRestaurantUiState

    data class CuisineAndRestaurant(
        val cuisines: List<Cuisine>,
        val restaurants: List<Restaurant>
    ) : CuisineAndRestaurantUiState

    data class Error(val exception: String?) : CuisineAndRestaurantUiState
}

/**
 * Article ui state.
 */
sealed interface ArticleUiState {
    object Loading : ArticleUiState

    data class ArticleData(
        val articles: List<Article>
    ) : ArticleUiState

    data class Error(val exception: String?) : ArticleUiState
}


private val cuisineFilterPredicate: (CuisineType, Cuisine) -> Boolean =
    { type, cuisine -> type == None || type in cuisine.cuisineType }

private val restaurantFilterPredicate: (CuisineType, Restaurant) -> Boolean =
    { type, restaurant -> type == None || type in restaurant.category }

private val articleFilterPredicate: (CuisineType, Article) -> Boolean =
    { type, article -> type == None || type in article.cuisineType }

private fun <T> filteredItems(
    type: CuisineType,
    items: List<T>,
    predicate: (CuisineType, T) -> Boolean
): List<T> {
    val filteredItem = mutableListOf<T>()
    for (element: T in items) {
        if (predicate(type, element)) {
            filteredItem.add(element)
        }
    }
    return filteredItem
}