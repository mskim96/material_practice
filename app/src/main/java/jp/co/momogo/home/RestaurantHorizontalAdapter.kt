package jp.co.momogo.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import jp.co.momogo.databinding.HomeItemBinding
import jp.co.momogo.databinding.HomeItemRankBinding
import jp.co.momogo.model.Restaurant

class RestaurantHorizontalAdapter(private val restaurants: List<Restaurant>) :
    RecyclerView.Adapter<HorizontalViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HorizontalViewHolder {
        return HorizontalViewHolder(
            HomeItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: HorizontalViewHolder, position: Int) {
        holder.bind(restaurants[position])
    }

    override fun getItemCount() = restaurants.size
}

class HorizontalViewHolder(private val binding: HomeItemBinding) :
    RecyclerView.ViewHolder(binding.root) {
    fun bind(item: Restaurant) {
        binding.apply {
            restaurant = item
            executePendingBindings()
        }
    }
}

class RestaurantHorizontalRankAdapter(private val restaurants: List<Restaurant>) :
    RecyclerView.Adapter<HorizontalRankViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HorizontalRankViewHolder {
        return HorizontalRankViewHolder(
            HomeItemRankBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: HorizontalRankViewHolder, position: Int) {
        holder.bind(restaurants[position])
    }

    override fun getItemCount() = restaurants.size
}


class HorizontalRankViewHolder(private val binding: HomeItemRankBinding) :
    RecyclerView.ViewHolder(binding.root) {
    fun bind(item: Restaurant) {
        binding.apply {
            restaurant = item
            executePendingBindings()
        }
    }
}