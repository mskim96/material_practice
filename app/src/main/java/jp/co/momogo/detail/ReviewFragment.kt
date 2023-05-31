package jp.co.momogo.detail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.addCallback
import androidx.fragment.app.viewModels
import com.google.android.material.bottomsheet.BottomSheetBehavior
import dagger.hilt.android.AndroidEntryPoint
import jp.co.momogo.R
import jp.co.momogo.databinding.ReviewFragmentBinding
import jp.co.momogo.detail.adapter.ReviewAdapter
import jp.co.momogo.utils.BaseFragment

/**
 * [ReviewFragment]
 */
@AndroidEntryPoint
class ReviewFragment : BaseFragment<ReviewFragmentBinding>(R.layout.review_fragment) {

    private val restaurantDetailViewModel: RestaurantDetailViewModel by viewModels(
        ownerProducer = { requireParentFragment() }
    )
    private val reviewAdapter by lazy { ReviewAdapter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = super.onCreateView(inflater, container, savedInstanceState)
        bind {
            viewmodel = restaurantDetailViewModel
            adapter = reviewAdapter
        }
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}