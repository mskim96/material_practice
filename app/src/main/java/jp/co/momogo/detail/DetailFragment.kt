package jp.co.momogo.detail

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.google.android.material.transition.MaterialContainerTransform
import dagger.hilt.android.AndroidEntryPoint
import jp.co.momogo.R
import jp.co.momogo.databinding.DetailFragmentBinding
import jp.co.momogo.utils.BaseFragment
import jp.co.momogo.utils.lifecycleWithCollectIn

@AndroidEntryPoint
class DetailFragment : BaseFragment<DetailFragmentBinding>(R.layout.detail_fragment) {

    private val detailViewModel: DetailViewModel by viewModels()

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
                        thumbnails.adapter = DetailThumbnailAdapter().apply {
                            submitList(it.data.imageList)
                        }
                        menus.adapter = DetailMenuAdapter().apply {
                            submitList(it.data.menus)
                        }
                        location.text = it.data.location
                        category.text = it.data.category.displayName
                        ratingText.text = it.data.rating.toFloat().toString()
                        name.text = it.data.name
                        description.text = it.data.description
                    }
                }
                is DetailUiState.Error -> Unit
            }
        }
    }
}