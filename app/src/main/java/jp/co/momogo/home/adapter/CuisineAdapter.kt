package jp.co.momogo.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import jp.co.momogo.databinding.HomeCuisineItemBinding
import jp.co.momogo.model.Cuisine

/**
 * [CuisineAdapter] is adapter for cuisines.
 */
class CuisineAdapter : ListAdapter<Cuisine, CuisineViewHolder>(cuisineDiff) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CuisineViewHolder {
        return CuisineViewHolder(
            HomeCuisineItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: CuisineViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}

class CuisineViewHolder(
    private val binding: HomeCuisineItemBinding
) : RecyclerView.ViewHolder(binding.root) {
    fun bind(item: Cuisine) {
        binding.apply {
            cuisine = item
        }
    }
}

private val cuisineDiff = object : DiffUtil.ItemCallback<Cuisine>() {
    override fun areItemsTheSame(oldItem: Cuisine, newItem: Cuisine) =
        oldItem.id == newItem.id

    override fun areContentsTheSame(oldItem: Cuisine, newItem: Cuisine) =
        oldItem == newItem
}