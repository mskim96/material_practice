package jp.co.momogo.detail

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import jp.co.momogo.databinding.DetailMenuItemBinding
import jp.co.momogo.model.Menu

class DetailMenuAdapter : ListAdapter<Menu, DetailMenuViewHolder>(menuDiffUtil) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DetailMenuViewHolder {
        return DetailMenuViewHolder(
            DetailMenuItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: DetailMenuViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}

class DetailMenuViewHolder(private val binding: DetailMenuItemBinding) :
    RecyclerView.ViewHolder(binding.root) {
    fun bind(item: Menu) {
        binding.apply {
            menu = item
        }
    }
}

private val menuDiffUtil = object : DiffUtil.ItemCallback<Menu>() {
    override fun areItemsTheSame(oldItem: Menu, newItem: Menu) =
        oldItem.id == newItem.id

    override fun areContentsTheSame(oldItem: Menu, newItem: Menu) =
        oldItem == newItem
}