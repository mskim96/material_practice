package jp.co.momogo.onboarding

import android.os.Bundle
import android.util.DisplayMetrics
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearSmoothScroller
import androidx.recyclerview.widget.RecyclerView
import dagger.hilt.android.AndroidEntryPoint
import jp.co.momogo.R
import jp.co.momogo.databinding.OnboardingFragmentBinding
import jp.co.momogo.model.foodCategories
import jp.co.momogo.utils.BaseFragment

@AndroidEntryPoint
class OnboardingFragment : BaseFragment<OnboardingFragmentBinding>(R.layout.onboarding_fragment) {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view = super.onCreateView(inflater, container, savedInstanceState)
        bind {
            fab.setOnClickListener {
                setupFab()
            }
        }
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupFoodCategories()
    }

    private fun setupFab() {
        findNavController().navigate(R.id.action_onboarding_to_home)
    }

    private fun setupFoodCategories() {
        binding.foodCategoryGrid.apply {
            adapter = FoodCategoryAdapter(context).apply {
                submitList(foodCategories.shuffled())
            }
            smoothScrollToPositionWithSpeed(foodCategories.size)
        }
    }
}

/**
 * Smooth scroll for recycler view.
 *
 * recycler view set by reverse layout = true.
 */
fun RecyclerView.smoothScrollToPositionWithSpeed(
    position: Int,
    millisPerInch: Float = 100f
) {
    val lm = requireNotNull(layoutManager)
    val scroller = object : LinearSmoothScroller(context) {
        override fun calculateSpeedPerPixel(displayMetrics: DisplayMetrics): Float {
            return millisPerInch / displayMetrics.densityDpi
        }
    }
    scroller.targetPosition = position
    lm.startSmoothScroll(scroller)
}