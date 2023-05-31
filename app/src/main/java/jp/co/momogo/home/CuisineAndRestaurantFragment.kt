package jp.co.momogo.home

import android.os.Bundle
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.navigation.fragment.findNavController
import dagger.hilt.android.AndroidEntryPoint
import jp.co.momogo.R
import jp.co.momogo.databinding.CuisineAndRestaurantFragmentBinding
import jp.co.momogo.home.adapter.CuisineAdapter
import jp.co.momogo.home.adapter.RestaurantAdapter
import jp.co.momogo.model.Restaurant
import jp.co.momogo.utils.BaseFragment

/**
 * [CuisineAndRestaurantFragment] is inside of the [HomeFragment] viewpager2.
 */
@AndroidEntryPoint
class CuisineAndRestaurantFragment :
    BaseFragment<CuisineAndRestaurantFragmentBinding>(R.layout.cuisine_and_restaurant_fragment),
    RestaurantAdapter.RestaurantAdapterListener {

    private val homeViewModel: HomeViewModel by viewModels(
        ownerProducer = { requireParentFragment() }
    )
    private val cuisineAdapter by lazy { CuisineAdapter() }
    private val restaurantAdapter by lazy { RestaurantAdapter(this) }

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

    /**
     * Store position of the restaurant recycler view when fragment destroyed.
     */
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        val restaurantState = binding.restaurants.layoutManager?.onSaveInstanceState()
        outState.putParcelable("restaurantsPositionState", restaurantState)
    }

    /**
     * Restore position of the restaurant recycler view.
     */
    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        val recyclerViewState =
            savedInstanceState?.getParcelable<Parcelable>("restaurantsPositionState")
        binding.restaurants.layoutManager?.onRestoreInstanceState(recyclerViewState)
    }

    /**
     * Navigate to restaurantDetail when item clicked.
     */
    override fun onRestaurantClicked(view: View, restaurant: Restaurant) {
        val restaurantDetailTransitionName = getString(R.string.restaurant_detail_transition_name)
        val extras = FragmentNavigatorExtras(view to restaurantDetailTransitionName)
        val direction = HomeFragmentDirections.actionHomeToRestaurantDetailFragment(restaurant.id)
        findNavController().navigate(direction, extras)
    }
}