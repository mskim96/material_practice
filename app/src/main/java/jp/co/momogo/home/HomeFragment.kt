package jp.co.momogo.home

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle.State.*
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import androidx.viewpager2.widget.ViewPager2.*
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.badge.BadgeDrawable
import com.google.android.material.badge.BadgeUtils
import com.google.android.material.tabs.TabLayoutMediator
import dagger.hilt.android.AndroidEntryPoint
import jp.co.momogo.R
import jp.co.momogo.databinding.HomeFragmentBinding
import jp.co.momogo.model.banners
import jp.co.momogo.utils.BaseFragment
import jp.co.momogo.utils.lifecycleWithActionIn
import jp.co.momogo.utils.showBothSideEdges
import jp.co.momogo.utils.startBannerRun
import kotlinx.coroutines.*

@AndroidEntryPoint
class HomeFragment : BaseFragment<HomeFragmentBinding>(R.layout.home_fragment) {

    private val homeViewModel: HomeViewModel by viewModels()
    private var isBannerRunnable: Job? = null

    private val verticalAdapter by lazy { RestaurantVerticalAdapter(requireContext()) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = super.onCreateView(inflater, container, savedInstanceState)
        bind {
            viewmodel = homeViewModel
            adapter = verticalAdapter
        }
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupToolbar()
        setupBannersViewPager()
    }

    override fun onPause() {
        super.onPause()
        isBannerRunnable?.cancel()
    }

    /**
     * Set up toolbar and badge example.
     */
    @SuppressLint("UnsafeOptInUsageError")
    private fun setupToolbar() {
        val navController = findNavController()
        val appBarConfiguration = AppBarConfiguration(navController.graph)
        val toolbar = requireActivity().findViewById<MaterialToolbar>(R.id.toolbar)
        toolbar.setupWithNavController(navController, appBarConfiguration)

        // Set badge in toolbar.
        val badge = BadgeDrawable.create(requireContext()).apply { number = 3 }
        BadgeUtils.attachBadgeDrawable(badge, toolbar, R.id.cart)
    }

    /**
     * Setup banner and mediator.
     */
    private fun setupBannersViewPager() {
        with(binding.banner) {
            this.apply {
                // shuffle banner for refresh effects.
                adapter = BannerAdapter(banners.shuffled())
                // extension function for show both side edges.
                showBothSideEdges(pageMarginRes = R.dimen.banner_margin)

                registerOnPageChangeCallback(bannerCallback)
                TabLayoutMediator(binding.indicator, this) { _, _ -> }.attach()
            }
            // start banner only lifecycle is
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
}

