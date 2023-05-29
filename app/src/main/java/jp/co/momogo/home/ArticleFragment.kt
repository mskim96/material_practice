package jp.co.momogo.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import jp.co.momogo.R
import jp.co.momogo.databinding.ArticleFragmentBinding
import jp.co.momogo.utils.BaseFragment

@AndroidEntryPoint
class ArticleFragment : BaseFragment<ArticleFragmentBinding>(R.layout.article_fragment) {

    private val homeViewModel: HomeViewModel by viewModels(
        ownerProducer = { requireParentFragment() }
    )
    private val articleAdapter by lazy { ArticleAdapter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

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
}