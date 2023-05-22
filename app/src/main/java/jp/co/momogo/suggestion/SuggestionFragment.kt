package jp.co.momogo.suggestion

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import dagger.hilt.android.AndroidEntryPoint
import jp.co.momogo.R
import jp.co.momogo.databinding.SuggestionFragmentBinding
import jp.co.momogo.model.seaMenus
import jp.co.momogo.utils.BaseFragment

@AndroidEntryPoint
class SuggestionFragment : BaseFragment<SuggestionFragmentBinding>(R.layout.suggestion_fragment) {

    private val suggestionAdapter = SuggestionAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = super.onCreateView(inflater, container, savedInstanceState)
        bind {

        }
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.suggestionGrid.layoutManager = GridLayoutManager(
            requireContext(),
            2,
        )
            .apply {
                spanSizeLookup = suggestionAdapter.variableSpanSizeLookup
            }
        binding.suggestionGrid.adapter = suggestionAdapter
        suggestionAdapter.submitList(seaMenus)
    }
}