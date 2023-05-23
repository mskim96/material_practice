package jp.co.momogo.detail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import jp.co.momogo.R
import jp.co.momogo.databinding.MenuFragmentBinding
import jp.co.momogo.model.Menu
import jp.co.momogo.utils.BaseFragment

class MenuFragment(private val menuList: List<Menu>) :
    BaseFragment<MenuFragmentBinding>(R.layout.menu_fragment) {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = super.onCreateView(inflater, container, savedInstanceState)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.menus.adapter = DetailMenuAdapter().apply {
            submitList(menuList)
        }
    }
}