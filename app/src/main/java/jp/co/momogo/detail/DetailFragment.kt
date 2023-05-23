package jp.co.momogo.detail

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.google.android.material.transition.MaterialContainerTransform
import dagger.hilt.android.AndroidEntryPoint
import jp.co.momogo.R
import jp.co.momogo.databinding.DetailFragmentBinding
import jp.co.momogo.model.Image
import jp.co.momogo.model.Menu
import jp.co.momogo.model.Review
import jp.co.momogo.utils.BaseFragment
import jp.co.momogo.utils.lifecycleWithCollectIn

@AndroidEntryPoint
class DetailFragment : BaseFragment<DetailFragmentBinding>(R.layout.detail_fragment) {

    private val detailViewModel: DetailViewModel by viewModels()
    private val menuReviewAdapter by lazy { MenuReviewAdapter(this) }

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
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = super.onCreateView(inflater, container, savedInstanceState)
        bind {
            viewmodel = detailViewModel
        }
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupRestaurantDetail()
    }

    private fun setupRestaurantDetail() {
        detailViewModel.detailUiState.lifecycleWithCollectIn(viewLifecycleOwner) {
            when (it) {
                is DetailUiState.Loading -> Unit
                is DetailUiState.RestaurantDetail -> {
                    bind {
                        thumbnails.setupThumbnailData(it.data.imageList)
                        menuReviewViewPager.setupMenuReviewWithTab(
                            tabs,
                            it.data.menus,
                            it.data.review
                        )
                        category.text = it.data.category.displayName
                        rating.text = it.data.rating.toFloat().toString()
                        name.text = it.data.name
                        description.text = it.data.description
                    }
                }
                is DetailUiState.Error -> Unit
            }
        }
    }

    /**
     * setup Thumbnail data.
     */
    private fun RecyclerView.setupThumbnailData(imageList: List<Image>) {
        this.adapter = DetailThumbnailAdapter().apply {
            submitList(imageList)
        }
    }

    /**
     * setup Viewpager for menu and review.
     */
    private fun ViewPager2.setupMenuReviewWithTab(
        tab: TabLayout,
        menus: List<Menu>,
        reviews: List<Review>
    ) {
        this.adapter = menuReviewAdapter.apply {
            addFragment(MenuFragment(menus))
            addFragment(ReviewFragment(reviews))
        }
        TabLayoutMediator(tab, this) { tab, position ->
            when (position) {
                0 -> tab.text = "メニュー"
                else -> tab.text = "レビュー"
            }
        }.attach()
    }
}