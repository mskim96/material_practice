package jp.co.momogo.search

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.annotation.StringRes
import androidx.appcompat.widget.Toolbar
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.transition.MaterialSharedAxis
import dagger.hilt.android.AndroidEntryPoint
import jp.co.momogo.R
import jp.co.momogo.data.SearchSuggestionStore
import jp.co.momogo.databinding.SearchFragmentBinding
import jp.co.momogo.databinding.SearchSuggestionItemBinding
import jp.co.momogo.databinding.SearchSuggestionTitleBinding
import jp.co.momogo.model.SearchSuggestion
import jp.co.momogo.utils.BaseFragment

@AndroidEntryPoint
class SearchFragment : BaseFragment<SearchFragmentBinding>(R.layout.search_fragment) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enterTransition = MaterialSharedAxis(MaterialSharedAxis.Y, true).apply {
            duration = resources.getInteger(R.integer.motion_duration_large).toLong()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view = super.onCreateView(inflater, container, savedInstanceState)
        bind { }
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpSuggestions(binding.searchSuggestionContainer)

        /**
         * Back pressed dispatcher callback.
         */
        requireActivity().onBackPressedDispatcher.addCallback(
            viewLifecycleOwner,
            onBackPressedCallback
        )
    }

    private fun setUpSuggestions(suggestionContainer: ViewGroup) {
        addSuggestionTitleView(suggestionContainer, R.string.search_suggestion_today)
        addSuggestionItemViews(suggestionContainer, SearchSuggestionStore.YESTERDAY_SUGGESTIONS)
        addSuggestionTitleView(suggestionContainer, R.string.search_suggestion_recent)
        addSuggestionItemViews(suggestionContainer, SearchSuggestionStore.THIS_WEEK_SUGGESTIONS)
    }

    private fun addSuggestionTitleView(parent: ViewGroup, @StringRes titleResId: Int) {
        val inflater = LayoutInflater.from(parent.context)
        val titleBinding = SearchSuggestionTitleBinding.inflate(inflater, parent, false)
        titleBinding.title = titleResId
        parent.addView(titleBinding.root)
    }

    private fun addSuggestionItemViews(parent: ViewGroup, suggestions: List<SearchSuggestion>) {
        suggestions.forEach {
            val inflater = LayoutInflater.from(parent.context)
            val suggestionBinding = SearchSuggestionItemBinding.inflate(inflater, parent, false)
            suggestionBinding.suggestion = it
            parent.addView(suggestionBinding.root)
        }
    }

    /**
     * Back pressed callback for shared axis.
     */
    private val onBackPressedCallback = object : OnBackPressedCallback(true) {
        override fun handleOnBackPressed() {
            findNavController().popBackStack(R.id.home, true)
            findNavController().navigate(R.id.home)
        }
    }
}