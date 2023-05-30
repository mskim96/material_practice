package jp.co.momogo.detail

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import jp.co.momogo.data.ArticleRepository
import jp.co.momogo.model.Article
import jp.co.momogo.ui.ARTICLE_ID
import jp.co.momogo.utils.Result
import jp.co.momogo.utils.asResult
import kotlinx.coroutines.flow.*
import javax.inject.Inject

/**
 * Article detail viewModel.
 *
 * @param savedStateHandle this saved state handle is provide from hilt with navigation safeArgs.
 * @see [this](https://proandroiddev.com/passing-safe-args-to-your-viewmodel-with-hilt-366762ff3f57)
 */
@HiltViewModel
class ArticleDetailViewModel @Inject constructor(
    private val articleRepository: ArticleRepository,
    savedStateHandle: SavedStateHandle
) : ViewModel() {

    private val articleId = savedStateHandle.getStateFlow(ARTICLE_ID, 0)
    private val articleDetail = articleId.map {
        articleRepository.getArticleDetail(it)
    }
        .flattenConcat()
        .asResult()

    val articleDetailUiState: StateFlow<ArticleDetailUiState> = articleDetail.map { state ->
        when (state) {
            is Result.Loading -> ArticleDetailUiState.Loading
            is Result.Success -> ArticleDetailUiState.ArticleDetail(data = state.data)
            is Result.Error -> ArticleDetailUiState.Error(state.exception?.message)
        }
    }.stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(5_000),
        initialValue = ArticleDetailUiState.Loading
    )
}

sealed interface ArticleDetailUiState {
    object Loading : ArticleDetailUiState
    data class ArticleDetail(val data: Article) : ArticleDetailUiState
    data class Error(val exception: String?) : ArticleDetailUiState
}


