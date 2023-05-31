package jp.co.momogo.detail

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.addCallback
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.transition.MaterialContainerTransform
import dagger.hilt.android.AndroidEntryPoint
import jp.co.momogo.R
import jp.co.momogo.databinding.DetailRestaurantFragmentBinding
import jp.co.momogo.detail.adapter.RestaurantDetailTopImageAdapter
import jp.co.momogo.home.adapter.CuisineAdapter
import jp.co.momogo.utils.BaseFragment

@AndroidEntryPoint
class RestaurantDetailFragment :
    BaseFragment<DetailRestaurantFragmentBinding>(R.layout.detail_restaurant_fragment) {

    private val restaurantDetailViewModel: RestaurantDetailViewModel by viewModels()
    private val args: RestaurantDetailFragmentArgs by navArgs()
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

            // navigate to review click listener.
            binding.reviewButton.setOnClickListener { navigateToReview() }
            setupReviewSheet()
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

    private fun navigateToReview() {
        val behavior = BottomSheetBehavior.from(binding.reviewSheet)
        behavior.state = BottomSheetBehavior.STATE_EXPANDED

//        val direction =
//            RestaurantDetailFragmentDirections.actionRestaurantDetailFragmentToReviewFragment(args.restaurantId)
//        findNavController().navigate(direction)
    }

    fun setupReviewSheet() {
        val behavior = BottomSheetBehavior.from(binding.reviewSheet)
        val backCallback =
            requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner, false) {
                behavior.state = BottomSheetBehavior.STATE_COLLAPSED
            }

        behavior.addBottomSheetCallback(object :
            BottomSheetBehavior.BottomSheetCallback() {
            override fun onStateChanged(bottomSheet: View, newState: Int) {
                backCallback.isEnabled = newState == BottomSheetBehavior.STATE_EXPANDED
            }

            // 나중에 background alpha 조정할 것임. use lerp function(linear interpolation).
            override fun onSlide(bottomSheet: View, slideOffset: Float) {

            }
        })
    }
}