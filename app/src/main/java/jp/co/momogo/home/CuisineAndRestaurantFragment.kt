package jp.co.momogo.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import jp.co.momogo.R
import jp.co.momogo.databinding.CuisineAndRestaurantFragmentBinding
import jp.co.momogo.utils.BaseFragment

@AndroidEntryPoint
class CuisineAndRestaurantFragment :
    BaseFragment<CuisineAndRestaurantFragmentBinding>(R.layout.cuisine_and_restaurant_fragment) {

    private val homeViewModel: HomeViewModel by viewModels(
        ownerProducer = { requireParentFragment() }
    )
    private val cuisineAdapter by lazy { CuisineAdapter() }
    private val restaurantAdapter by lazy { RestaurantAdapter() }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = super.onCreateView(inflater, container, savedInstanceState)
        bind {
            viewmodel = homeViewModel
            cuisineadapter = cuisineAdapter
            restaurantadapter = restaurantAdapter
        }
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}