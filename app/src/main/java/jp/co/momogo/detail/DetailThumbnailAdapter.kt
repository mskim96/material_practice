package jp.co.momogo.detail

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import jp.co.momogo.databinding.DetailThumbItemBinding
import jp.co.momogo.model.Image

/**
 * [DetailThumbnailAdapter] is Adapter for detail top thumbnail.
 */
class DetailThumbnailAdapter : ListAdapter<Image, DetailThumbnailViewHolder>(detailThumbDiff) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DetailThumbnailViewHolder {
        return DetailThumbnailViewHolder(
            DetailThumbItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: DetailThumbnailViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}

class DetailThumbnailViewHolder(private val binding: DetailThumbItemBinding) :
    RecyclerView.ViewHolder(binding.root) {
    fun bind(item: Image) {
        binding.apply {
            image = item
        }
    }
}

private val detailThumbDiff = object : DiffUtil.ItemCallback<Image>() {
    override fun areItemsTheSame(oldItem: Image, newItem: Image) =
        oldItem.url == newItem.url

    override fun areContentsTheSame(oldItem: Image, newItem: Image) =
        oldItem == newItem

}