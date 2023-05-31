package jp.co.momogo.detail.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import jp.co.momogo.databinding.DetailRestaurantImageItemBinding

class RestaurantDetailTopImageAdapter :
    ListAdapter<String, RestaurantDetailTopImageViewHolder>(restaurantTopImageDiff) {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RestaurantDetailTopImageViewHolder {
        return RestaurantDetailTopImageViewHolder(
            DetailRestaurantImageItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: RestaurantDetailTopImageViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}

class RestaurantDetailTopImageViewHolder(private val binding: DetailRestaurantImageItemBinding) :
    RecyclerView.ViewHolder(binding.root) {
    fun bind(item: String) {
        binding.apply {
            imageurl = item
        }
    }
}

private val restaurantTopImageDiff = object : DiffUtil.ItemCallback<String>() {
    override fun areItemsTheSame(oldItem: String, newItem: String) =
        oldItem == newItem

    override fun areContentsTheSame(oldItem: String, newItem: String) =
        oldItem == newItem
}