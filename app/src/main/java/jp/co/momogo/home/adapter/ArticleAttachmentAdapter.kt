package jp.co.momogo.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import jp.co.momogo.databinding.HomeArticleAttachmentItemBinding

class ArticleAttachmentAdapter : ListAdapter<String, ArticleAttachmentViewHolder>(attachmentDiff) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleAttachmentViewHolder {
        return ArticleAttachmentViewHolder(
            HomeArticleAttachmentItemBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: ArticleAttachmentViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}

class ArticleAttachmentViewHolder(private val binding: HomeArticleAttachmentItemBinding) :
    RecyclerView.ViewHolder(binding.root) {
    fun bind(item: String) {
        binding.apply {
            imageurl = item
        }
    }
}

private val attachmentDiff = object : DiffUtil.ItemCallback<String>() {
    override fun areItemsTheSame(oldItem: String, newItem: String) =
        oldItem == newItem

    override fun areContentsTheSame(oldItem: String, newItem: String) =
        oldItem == newItem
}