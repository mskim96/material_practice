package jp.co.momogo.home.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import jp.co.momogo.databinding.HomeArticleItemBinding
import jp.co.momogo.model.Article

class ArticleAdapter(private val listener: ArticleAdapterListener) :
    ListAdapter<Article, ArticleViewHolder>(articleDiff) {

    interface ArticleAdapterListener {
        fun onArticleClicked(view: View, article: Article)
        fun onArticleLongPressed(article: Article): Boolean
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleViewHolder {
        return ArticleViewHolder(
            HomeArticleItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: ArticleViewHolder, position: Int) {
        holder.bind(getItem(position), listener)
    }
}

class ArticleViewHolder(private val binding: HomeArticleItemBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(item: Article, listener: ArticleAdapter.ArticleAdapterListener) {
        val attachmentAdapter = ArticleAttachmentAdapter().apply {
            submitList(item.attachment)
        }

        binding.apply {
            article = item
            attachmentRecyclerView.adapter = attachmentAdapter
            this.listener = listener
        }
    }
}

private val articleDiff = object : DiffUtil.ItemCallback<Article>() {
    override fun areItemsTheSame(oldItem: Article, newItem: Article) =
        oldItem.id == newItem.id

    override fun areContentsTheSame(oldItem: Article, newItem: Article) =
        oldItem == newItem
}