package jp.co.momogo.detail

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.transition.MaterialContainerTransform
import dagger.hilt.android.AndroidEntryPoint
import jp.co.momogo.R
import jp.co.momogo.databinding.DetailRestaurantFragmentBinding
import jp.co.momogo.home.adapter.CuisineAdapter
import jp.co.momogo.utils.BaseFragment

@AndroidEntryPoint
class RestaurantDetailFragment :
    BaseFragment<DetailRestaurantFragmentBinding>(R.layout.detail_restaurant_fragment) {

    private val restaurantDetailViewModel: RestaurantDetailViewModel by viewModels()
    private val restaurantDetailTopImageAdapter by lazy { RestaurantDetailTopImageAdapter() }
    private val cuisineAdapter by lazy { CuisineAdapter() }

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
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view = super.onCreateView(inflater, container, savedInstanceState)
        bind {
            viewmodel = restaurantDetailViewModel
            topimageadapter = restaurantDetailTopImageAdapter
            menuadapter = cuisineAdapter
        }
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupToolbar()
    }

    private fun setupToolbar() {
        val navController = findNavController()
        val appBarConfiguration = AppBarConfiguration(navController.graph)
        val toolbar = binding.toolbar
        toolbar.setupWithNavController(navController, appBarConfiguration)
    }
}