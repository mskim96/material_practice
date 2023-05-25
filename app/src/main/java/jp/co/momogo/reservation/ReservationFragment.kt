package jp.co.momogo.reservation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.transition.MaterialContainerTransform
import jp.co.momogo.R
import jp.co.momogo.databinding.ReservationFragmentBinding
import jp.co.momogo.utils.BaseFragment

class ReservationFragment :
    BaseFragment<ReservationFragmentBinding>(R.layout.reservation_fragment) {

    // TODO: Draw Reservation fragment's layout.
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view = super.onCreateView(inflater, container, savedInstanceState)
        enterTransition = MaterialContainerTransform().apply {
            // Manually add the Views to be shared since this is not a standard Fragment to
            // Fragment shared element transition.
            startView = requireActivity().findViewById(R.id.reservation)
            endView = binding.reservationRoot
        }
        bind { }
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}