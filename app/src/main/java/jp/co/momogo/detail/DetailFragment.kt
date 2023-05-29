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
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.transition.MaterialContainerTransform
import com.google.android.material.transition.MaterialElevationScale
import dagger.hilt.android.AndroidEntryPoint
import jp.co.momogo.R
import jp.co.momogo.databinding.DetailFragmentBinding
import jp.co.momogo.utils.BaseFragment

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
        setupToolbar()
        setupFab()
    }

    private fun setupToolbar() {
        val navController = findNavController()
        val appBarConfiguration = AppBarConfiguration(navController.graph)
        val toolbar = requireActivity().findViewById<MaterialToolbar>(R.id.toolbar)
        toolbar.setupWithNavController(navController, appBarConfiguration)
    }

    private fun setupFab() {
        val reservationButton = binding.reservation
        reservationButton.setOnClickListener {
            navigateToReservation()
        }
    }

    private fun navigateToReservation() {
        exitTransition = MaterialElevationScale(false).apply {
            duration = resources.getInteger(R.integer.motion_duration_large).toLong()
        }
        reenterTransition = MaterialElevationScale(true).apply {
            duration = resources.getInteger(R.integer.motion_duration_large).toLong()
        }

        val direction = DetailFragmentDirections.actionDetailToReservationFragment()
        findNavController().navigate(direction)
    }
}