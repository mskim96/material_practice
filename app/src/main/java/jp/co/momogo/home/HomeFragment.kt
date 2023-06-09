package jp.co.momogo.home

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.doOnPreDraw
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.chip.Chip
import com.google.android.material.tabs.TabLayoutMediator
import dagger.hilt.android.AndroidEntryPoint
import jp.co.momogo.R
import jp.co.momogo.databinding.HomeFragmentBinding
import jp.co.momogo.home.adapter.HomeViewPagerAdapter
import jp.co.momogo.model.CuisineType
import jp.co.momogo.model.asCuisineType
import jp.co.momogo.utils.BaseFragment
import jp.co.momogo.utils.extractColorForGradients

@AndroidEntryPoint
class HomeFragment : BaseFragment<HomeFragmentBinding>(R.layout.home_fragment) {

    private val homeViewModel: HomeViewModel by viewModels()

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
        extractColorForGradients(requireContext(), R.drawable.home_main, binding.collapse)
        setupCategoryFilterChips()
        setupViewPager()

        /**
         * Postpone enter transitions to allow shared element transitions to run.
         */
        postponeEnterTransition()
        view.doOnPreDraw { startPostponedEnterTransition() }
    }

    /**
     * Set up toolbar and badge example.
     */
    private fun setupToolbar() {
        val navController = findNavController()
        val appBarConfiguration = AppBarConfiguration(navController.graph)
        val toolbar = requireActivity().findViewById<MaterialToolbar>(R.id.toolbar)
        toolbar.setupWithNavController(navController, appBarConfiguration)

        toolbar.setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.search -> {
                    true
                }
                else -> false
            }
        }
    }

    /**
     * Set up Category filter chips.
     * filtering if chip item selected.
     */
    private fun setupCategoryFilterChips() {
        binding.chips.chipGroup.setOnCheckedStateChangeListener { _, checkedIds ->
            if (checkedIds.isNotEmpty()) { // validate empty checked chip ids.
                val checkedChipText = requireActivity().findViewById<Chip?>(checkedIds[0]).text
                // Validate chip text and set filter if food category chip is checked.
                if (checkedChipText.isNotBlank()) homeViewModel.setFilterCategory(
                    category = checkedChipText.toString().asCuisineType()
                )
            } else {
                // Set disable filter if food category chip unchecked.
                homeViewModel.setFilterCategory(category = CuisineType.None)
            }
        }
    }

    /**
     * Set up Viewpager2.
     */
    private fun setupViewPager() {
        val fragments = listOf(CuisineAndRestaurantFragment(), ArticleFragment())

        binding.viewpager.adapter =
            HomeViewPagerAdapter(childFragmentManager, viewLifecycleOwner.lifecycle).apply {
                addFragment(fragments)
            }

        TabLayoutMediator(binding.tabs, binding.viewpager) { tab, position ->
            when (position) {
                0 -> tab.text = resources.getString(R.string.discover)
                1 -> tab.text = resources.getString(R.string.article)
            }
        }.attach()

        binding.viewpager.isUserInputEnabled = false
    }
}