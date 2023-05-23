package jp.co.momogo.detail

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import jp.co.momogo.databinding.DetailReviewItemBinding
import jp.co.momogo.model.Review

class DetailReviewAdapter : ListAdapter<Review, DetailReviewViewHolder>(reviewDiffUtil) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DetailReviewViewHolder {
        return DetailReviewViewHolder(
            DetailReviewItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: DetailReviewViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}

class DetailReviewViewHolder(private val binding: DetailReviewItemBinding) :
    RecyclerView.ViewHolder(binding.root) {
    fun bind(item: Review) {
        binding.apply {
            review = item
        }
    }
}

private val reviewDiffUtil = object : DiffUtil.ItemCallback<Review>() {
    override fun areItemsTheSame(oldItem: Review, newItem: Review) =
        oldItem.id == newItem.id

    override fun areContentsTheSame(oldItem: Review, newItem: Review) =
        oldItem == newItem
}