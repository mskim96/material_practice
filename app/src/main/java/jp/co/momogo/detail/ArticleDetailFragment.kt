package jp.co.momogo.detail

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.GridLayoutManager
import com.google.android.material.transition.MaterialContainerTransform
import dagger.hilt.android.AndroidEntryPoint
import jp.co.momogo.R
import jp.co.momogo.databinding.DetailArticleFragmentBinding
import jp.co.momogo.detail.adapter.ArticleDetailAttachmentAdapter
import jp.co.momogo.utils.BaseFragment

@AndroidEntryPoint
class ArticleDetailFragment :
    BaseFragment<DetailArticleFragmentBinding>(R.layout.detail_article_fragment) {

    private val articleDetailViewModel: ArticleDetailViewModel by viewModels()
    private val articleDetailAttachmentAdapter by lazy { ArticleDetailAttachmentAdapter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /**
         * Transition for when opened detail view.
         */
        sharedElementEnterTransition = MaterialContainerTransform().apply {
            drawingViewId = R.id.nav_host_fragment
            duration = 400
            scrimColor = Color.TRANSPARENT
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = super.onCreateView(inflater, container, savedInstanceState)
        bind {
            viewmodel = articleDetailViewModel
            adapter = articleDetailAttachmentAdapter
        }
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupArticleAttachRecyclerView()
    }

    private fun setupArticleAttachRecyclerView() {
        binding.run {
            attachmentRecyclerView.layoutManager = GridLayoutManager(requireContext(), 3)
                .apply {
                    spanSizeLookup = articleDetailAttachmentAdapter.variableSpanSizeLookup
                }
        }
    }
}