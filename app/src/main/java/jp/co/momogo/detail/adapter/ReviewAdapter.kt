package jp.co.momogo.detail.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import jp.co.momogo.databinding.ReviewItemBinding
import jp.co.momogo.model.Review

/**
 * [ReviewAdapter] is list adapter for review items.
 */
class ReviewAdapter : ListAdapter<Review, ReviewViewHolder>(reviewDiff) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReviewViewHolder {
        return ReviewViewHolder(
            ReviewItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: ReviewViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}

class ReviewViewHolder(private val binding: ReviewItemBinding) :
    RecyclerView.ViewHolder(binding.root) {
    fun bind(item: Review) {
        binding.apply {
            review = item
        }
    }
}

/**
 * Review diff callback.
 */
private val reviewDiff = object : DiffUtil.ItemCallback<Review>() {
    override fun areItemsTheSame(oldItem: Review, newItem: Review) =
        oldItem.id == newItem.id

    override fun areContentsTheSame(oldItem: Review, newItem: Review) =
        oldItem == newItem
}