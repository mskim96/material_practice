package jp.co.momogo.suggestion

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dagger.hilt.android.AndroidEntryPoint
import jp.co.momogo.R
import jp.co.momogo.databinding.SuggestionFragmentBinding
import jp.co.momogo.utils.BaseFragment

@AndroidEntryPoint
class SuggestionFragment : BaseFragment<SuggestionFragmentBinding>(R.layout.suggestion_fragment) {


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
    }
}