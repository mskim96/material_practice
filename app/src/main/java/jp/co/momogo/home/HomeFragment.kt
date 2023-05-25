package jp.co.momogo.home

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.doOnPreDraw
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle.State.RESUMED
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2.*
import com.google.android.material.appbar.MaterialToolbar
import dagger.hilt.android.AndroidEntryPoint
import jp.co.momogo.R
import jp.co.momogo.databinding.HomeFragmentBinding
import jp.co.momogo.model.Restaurant
import jp.co.momogo.model.foodCategories
import jp.co.momogo.utils.*
import kotlinx.coroutines.Job

@AndroidEntryPoint
class HomeFragment : BaseFragment<HomeFragmentBinding>(R.layout.home_fragment), RestaurantListener {

    private val homeViewModel: HomeViewModel by viewModels()
    private var isBannerRunnable: Job? = null

    private val verticalAdapter = RestaurantVerticalAdapter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = super.onCreateView(inflater, container, savedInstanceState)
        bind {
            viewmodel = homeViewModel
        }
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupToolbar()
        setupBannersViewPager()
        setupCategories()
        setupRestaurants()
        /**
         * Postpone enter transitions to allow shared element transitions to run.
         */
        postponeEnterTransition()
        view.doOnPreDraw { startPostponedEnterTransition() }
    }

    override fun onPause() {
        super.onPause()
        isBannerRunnable?.cancel()
    }

    /**
     * Set up toolbar and badge example.
     */
    private fun setupToolbar() {
        val navController = findNavController()
        val appBarConfiguration = AppBarConfiguration(navController.graph)
        val toolbar = requireActivity().findViewById<MaterialToolbar>(R.id.searchbar)
        toolbar.setupWithNavController(navController, appBarConfiguration)
    }

    /**
     * Setup banner and mediator.
     */
    private fun setupBannersViewPager() {
        with(binding.banner) {
            // shuffle banner for refresh effects.
            homeViewModel.banners.lifecycleWithCollectIn(viewLifecycleOwner) {
                adapter = BannerAdapter(it, this@HomeFragment).apply {
                    stateRestorationPolicy =
                        RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY
                }
            }

            // extension function for show both side edges.
            showBothSideEdges(pageMarginRes = R.dimen.banner_margin)
            registerOnPageChangeCallback(bannerCallback)

            // start banner only lifecycle is resume
            lifecycleWithActionIn(viewLifecycleOwner, RESUMED) {
                isBannerRunnable = this@with.startBannerRun(viewLifecycleOwner)
            }
        }
    }

    /**
     * Banner viewpager callback.
     *
     * - if user drag banners, [isBannerRunnable] is cancel.
     * - if banner state is idle, [isBannerRunnable] is restart.
     */
    private val bannerCallback = object : OnPageChangeCallback() {
        override fun onPageScrollStateChanged(state: Int) {
            isBannerRunnable?.let {
                when (state) {
                    SCROLL_STATE_DRAGGING -> if (it.isActive) it.cancel()
                    SCROLL_STATE_IDLE -> if (!it.isActive) isBannerRunnable =
                        binding.banner.startBannerRun(viewLifecycleOwner)
                    SCROLL_STATE_SETTLING -> Unit
                }
            }
        }
    }

    /**
     * Set up food categories.
     */
    private fun setupCategories() {
        binding.category.apply {
            adapter = CategoryAdapter(context).apply {
                stateRestorationPolicy =
                    RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY
                submitList(foodCategories)
            }
        }
    }

    /**
     * Set up restaurants.+
     */
    private fun setupRestaurants() {
        binding.restaurants.apply {
            this.adapter = verticalAdapter
        }
    }

    /**
     * Restaurant click listener.
     */
    override fun moreRestaurantClicked(view: View) {
        // TODO: navigate to search result page.
        Log.d("TAG", "moreRestaurantClicked: Stub")
    }

    override fun onRestaurantClicked(view: View, restaurantId: Int) {
        /**
         * Navigate with shared element.
         */
        val restaurantDetailTransitionName = getString(R.string.restaurant_detail_transition_name)
        val extras = FragmentNavigatorExtras(view to restaurantDetailTransitionName)
        val direction = HomeFragmentDirections.actionHomeToDetail(restaurantId)
        findNavController().navigate(direction, extras)
    }

    override fun onRestaurantLongPressed(restaurant: Restaurant): Boolean {
        Log.d("TAG", "onRestaurantLongPressed: on Long press stub")
        return true
    }
}

