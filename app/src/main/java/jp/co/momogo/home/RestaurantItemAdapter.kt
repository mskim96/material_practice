package jp.co.momogo.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import jp.co.momogo.databinding.HomeItemBinding
import jp.co.momogo.model.Restaurant

class RestaurantItemAdapter(private val listener: RestaurantListener) :
    ListAdapter<Restaurant, HorizontalViewHolder>(itemDiff) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HorizontalViewHolder {
        return HorizontalViewHolder(
            HomeItemBinding.inflate(LayoutInflater.from(parent.context), parent, false),
            listener
        )
    }

    override fun onBindViewHolder(holder: HorizontalViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}

private val itemDiff = object : DiffUtil.ItemCallback<Restaurant>() {
    override fun areItemsTheSame(oldItem: Restaurant, newItem: Restaurant) =
        oldItem.id == newItem.id


    override fun areContentsTheSame(oldItem: Restaurant, newItem: Restaurant) =
        oldItem == newItem

}