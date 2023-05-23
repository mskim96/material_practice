package jp.co.momogo.detail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import jp.co.momogo.R
import jp.co.momogo.databinding.ReviewFragmentBinding
import jp.co.momogo.model.Review
import jp.co.momogo.utils.BaseFragment

class ReviewFragment(private val reviews: List<Review>) :
    BaseFragment<ReviewFragmentBinding>(R.layout.review_fragment) {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = super.onCreateView(inflater, container, savedInstanceState)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.reviews.adapter = DetailReviewAdapter().apply {
            submitList(reviews)
        }
    }
}