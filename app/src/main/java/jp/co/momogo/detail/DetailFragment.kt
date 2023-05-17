package jp.co.momogo.detail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import jp.co.momogo.R
import jp.co.momogo.databinding.DetailFragmentBinding
import jp.co.momogo.utils.BaseFragment

class DetailFragment : BaseFragment<DetailFragmentBinding>(R.layout.detail_fragment) {

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