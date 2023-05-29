package jp.co.momogo.datasource

import jp.co.momogo.datasource.model.ArticleResource
import jp.co.momogo.datasource.store.ArticleResourceStore
import javax.inject.Inject

/**
 * Network datasource interface
 */
interface ArticleDataSource {

    /**
     * Get article list data.
     */
    fun getArticles(): List<ArticleResource>

    /**
     * Get article detail.
     */
    fun getArticleDetail(articleId: Int): ArticleResource
}

class ArticleDataSourceImpl @Inject constructor(
    private val articleResourceStore: ArticleResourceStore
) : ArticleDataSource {

    override fun getArticles() = articleResourceStore.articles

    override fun getArticleDetail(articleId: Int) =
        articleResourceStore.articles.first { it.id == articleId }
}