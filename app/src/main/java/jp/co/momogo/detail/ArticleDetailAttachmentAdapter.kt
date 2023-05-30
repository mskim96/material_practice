package jp.co.momogo.detail

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import jp.co.momogo.databinding.DetailArticleAttachmentItemBinding

class ArticleDetailAttachmentAdapter :
    ListAdapter<String, ArticleDetailAttachmentViewHolder>(articleDetailAttachmentDiff) {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ArticleDetailAttachmentViewHolder {
        return ArticleDetailAttachmentViewHolder(
            DetailArticleAttachmentItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ArticleDetailAttachmentViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    val variableSpanSizeLookup = object : GridLayoutManager.SpanSizeLookup() {
        override fun getSpanSize(position: Int): Int {
            return when (position % 4) {
                0 -> 1
                1, 2 -> 2
                else -> 1
            }
        }
    }
}

class ArticleDetailAttachmentViewHolder(private val binding: DetailArticleAttachmentItemBinding) :
    RecyclerView.ViewHolder(binding.root) {
    fun bind(item: String) {
        binding.apply { innerattach = item }
    }
}

private val articleDetailAttachmentDiff = object : DiffUtil.ItemCallback<String>() {
    override fun areItemsTheSame(oldItem: String, newItem: String) = oldItem == newItem

    override fun areContentsTheSame(oldItem: String, newItem: String) = oldItem == newItem
}