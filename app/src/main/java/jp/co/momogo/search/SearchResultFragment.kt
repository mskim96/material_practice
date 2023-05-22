package jp.co.momogo.search

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import jp.co.momogo.R
import jp.co.momogo.databinding.SearchResultFragmentBinding
import jp.co.momogo.utils.BaseFragment

/**
 * [SearchResultFragment] is fragment for search result.
 */
class SearchResultFragment :
    BaseFragment<SearchResultFragmentBinding>(R.layout.search_result_fragment) {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = super.onCreateView(inflater, container, savedInstanceState)
        bind { }
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}