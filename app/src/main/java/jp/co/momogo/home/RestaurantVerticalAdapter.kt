package jp.co.momogo.home

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.carousel.CarouselLayoutManager
import jp.co.momogo.databinding.HomeVerticalBinding
import jp.co.momogo.model.RestaurantWithSuggestionType
import jp.co.momogo.model.SuggestionType

/**
 * Restaurant parent adapter.
 */
class RestaurantVerticalAdapter(val context: Context) :
    ListAdapter<RestaurantWithSuggestionType, VerticalViewHolder>(verticalDiffUtil) {

    private val carouselLayoutManger = CarouselLayoutManager()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VerticalViewHolder {

        return VerticalViewHolder(
            HomeVerticalBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: VerticalViewHolder, position: Int) {
        holder.bind(getItem(position), carouselLayoutManger)
    }
}

class VerticalViewHolder(private val binding: HomeVerticalBinding) :
    RecyclerView.ViewHolder(binding.root) {
    fun bind(
        item: RestaurantWithSuggestionType,
        carousel: CarouselLayoutManager,
    ) {
        binding.apply {
            itemWithType = item
            when (item.type) {
                SuggestionType.Populate -> {
                    recyclerView.layoutManager = carousel
                    recyclerView.adapter = RestaurantHorizontalRankAdapter(item.restaurants)
                }
                else -> recyclerView.adapter = RestaurantHorizontalAdapter(item.restaurants)
            }
            executePendingBindings()
        }
    }
}

/**
 * Diff util for vertical items.
 */
private val verticalDiffUtil = object : DiffUtil.ItemCallback<RestaurantWithSuggestionType>() {
    override fun areItemsTheSame(
        oldItem: RestaurantWithSuggestionType,
        newItem: RestaurantWithSuggestionType
    ): Boolean =
        oldItem.type == newItem.type

    override fun areContentsTheSame(
        oldItem: RestaurantWithSuggestionType,
        newItem: RestaurantWithSuggestionType
    ): Boolean = oldItem == newItem
}