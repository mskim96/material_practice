package jp.co.momogo.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import jp.co.momogo.databinding.HomeRestaurantItemBinding
import jp.co.momogo.model.Restaurant

class RestaurantAdapter : ListAdapter<Restaurant, RestaurantViewHolder>(restaurantDiff) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestaurantViewHolder {
        return RestaurantViewHolder(
            HomeRestaurantItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: RestaurantViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}

class RestaurantViewHolder(private val binding: HomeRestaurantItemBinding) :
    RecyclerView.ViewHolder(binding.root) {
    fun bind(item: Restaurant) {
        binding.apply {
            restaurant = item
        }
    }
}

private val restaurantDiff = object : DiffUtil.ItemCallback<Restaurant>() {
    override fun areItemsTheSame(oldItem: Restaurant, newItem: Restaurant) =
        oldItem.id == newItem.id

    override fun areContentsTheSame(oldItem: Restaurant, newItem: Restaurant) =
        oldItem == newItem
}