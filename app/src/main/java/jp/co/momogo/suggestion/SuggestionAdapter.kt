package jp.co.momogo.suggestion

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import jp.co.momogo.databinding.SuggestItemBinding
import jp.co.momogo.model.Food

class SuggestionAdapter : ListAdapter<Food, SuggestionViewHolder>(FoodDiff) {

    val variableSpanSizeLookup = object : GridLayoutManager.SpanSizeLookup() {

        override fun getSpanSize(position: Int): Int {
            return when (position % 6) {
                0 -> 2
                4 -> 1
                5 -> 2
                else -> 1
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuggestionViewHolder {
        return SuggestionViewHolder(
            SuggestItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: SuggestionViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}

class SuggestionViewHolder(private val binding: SuggestItemBinding) :
    RecyclerView.ViewHolder(binding.root) {
    fun bind(item: Food) {
        binding.apply {
            food = item
            executePendingBindings()
        }
    }
}

/**
 * Food diff for [SuggestionAdapter]
 */
object FoodDiff : DiffUtil.ItemCallback<Food>() {
    override fun areItemsTheSame(oldItem: Food, newItem: Food) = oldItem.id == newItem.id
    override fun areContentsTheSame(oldItem: Food, newItem: Food) = oldItem == newItem
}