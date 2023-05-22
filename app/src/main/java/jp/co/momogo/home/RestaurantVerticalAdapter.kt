package jp.co.momogo.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import jp.co.momogo.databinding.HomeVerticalBinding
import jp.co.momogo.model.RestaurantWithSuggestionType
import jp.co.momogo.utils.NestedRecyclerViewStateRecoverAdapter
import jp.co.momogo.utils.NestedRecyclerViewViewHolder

/**
 * Restaurant parent adapter.
 */
class RestaurantVerticalAdapter(
    private val listener: RestaurantListener
) : NestedRecyclerViewStateRecoverAdapter<RestaurantWithSuggestionType, VerticalViewHolder>(
    verticalDiffUtil
) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VerticalViewHolder {
        return VerticalViewHolder(
            HomeVerticalBinding.inflate(LayoutInflater.from(parent.context), parent, false),
            listener
        )
    }

    override fun onBindViewHolder(holder: VerticalViewHolder, position: Int) {
        holder.bind(getItem(position))
        super.onBindViewHolder(holder, position)
    }
}

class VerticalViewHolder(
    private val binding: HomeVerticalBinding,
    private val listenerEvent: RestaurantListener
) : RecyclerView.ViewHolder(binding.root), NestedRecyclerViewViewHolder {

    private lateinit var items: RestaurantWithSuggestionType

    init {
        binding.innerGrid.apply {
            adapter = RestaurantItemAdapter(listenerEvent)
        }
    }

    fun bind(item: RestaurantWithSuggestionType) {
        binding.apply {
            items = item
            itemWithType = item
            this.listener = listenerEvent
            innerGrid.apply {
                (binding.innerGrid.adapter as RestaurantItemAdapter).submitList(item.restaurants)
            }
            executePendingBindings()
        }
    }

    override fun getId() = items.type.displayName

    override fun getLayoutManager() = binding.innerGrid.layoutManager
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