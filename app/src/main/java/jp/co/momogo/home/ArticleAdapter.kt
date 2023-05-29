package jp.co.momogo.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import jp.co.momogo.databinding.HomeArticleItemBinding
import jp.co.momogo.model.Article

class ArticleAdapter : ListAdapter<Article, ArticleViewHolder>(articleDiff) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleViewHolder {
        return ArticleViewHolder(
            HomeArticleItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: ArticleViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}

class ArticleViewHolder(private val binding: HomeArticleItemBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(item: Article) {
        val attachmentAdapter = ArticleAttachmentAdapter().apply {
            submitList(item.attachment)
        }

        binding.apply {
            article = item
            attachmentRecyclerView.adapter = attachmentAdapter
        }
    }
}

private val articleDiff = object : DiffUtil.ItemCallback<Article>() {
    override fun areItemsTheSame(oldItem: Article, newItem: Article) =
        oldItem.id == newItem.id

    override fun areContentsTheSame(oldItem: Article, newItem: Article) =
        oldItem == newItem
}