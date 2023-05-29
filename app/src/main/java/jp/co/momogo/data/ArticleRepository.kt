package jp.co.momogo.data

import jp.co.momogo.datasource.ArticleDataSource
import jp.co.momogo.di.DefaultDispatcher
import jp.co.momogo.model.Article
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.withContext
import javax.inject.Inject

interface ArticleRepository {

    /**
     * Get articles stream.
     */
    fun getArticlesStream(): Flow<List<Article>>

    /**
     * Get article detail.
     */
    fun getArticleDetail(articleId: Int): Flow<Article>
}

class ArticleRepositoryImpl @Inject constructor(
    private val articleNetwork: ArticleDataSource,
    @DefaultDispatcher private val dispatcher: CoroutineDispatcher
) : ArticleRepository {

    override fun getArticlesStream(): Flow<List<Article>> = flow {
        val articles = withContext(dispatcher) {
            articleNetwork.getArticles().asExternal()
        }
        emit(articles)
    }

    override fun getArticleDetail(articleId: Int): Flow<Article> = flow {
        val article = withContext(dispatcher) {
            articleNetwork.getArticleDetail(articleId = articleId).asExternal()
        }
        emit(article)
    }
}