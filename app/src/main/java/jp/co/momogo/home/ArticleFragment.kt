package jp.co.momogo.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import dagger.hilt.android.AndroidEntryPoint
import jp.co.momogo.R
import jp.co.momogo.databinding.ArticleFragmentBinding
import jp.co.momogo.home.adapter.ArticleAdapter
import jp.co.momogo.model.Article
import jp.co.momogo.utils.BaseFragment

/**
 * [ArticleFragment] is inside of the [HomeFragment] viewpager2.
 */
@AndroidEntryPoint
class ArticleFragment : BaseFragment<ArticleFragmentBinding>(R.layout.article_fragment),
    ArticleAdapter.ArticleAdapterListener {

    private val homeViewModel: HomeViewModel by viewModels(ownerProducer = { requireParentFragment() })
    private val articleAdapter by lazy { ArticleAdapter(this) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view = super.onCreateView(inflater, container, savedInstanceState)
        bind {
            viewmodel = homeViewModel
            articleadapter = articleAdapter
        }
        return view
    }

    /**
     * Navigate articleDetail when item clicked.
     */
    override fun onArticleClicked(view: View, article: Article) {
        val articleDetailTransitionName = getString(R.string.article_detail_transition_name)
        val extras = FragmentNavigatorExtras(view to articleDetailTransitionName)
        val direction =
            HomeFragmentDirections.actionHomeToArticleDetailFragment(article.id)
        findNavController().navigate(direction, extras)
    }

    /**
     * TODO: Article Long pressed event.
     */
    override fun onArticleLongPressed(article: Article): Boolean {
        // show bottom dialog if article long pressed.
        return true
    }
}