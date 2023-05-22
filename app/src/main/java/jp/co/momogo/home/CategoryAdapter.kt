package jp.co.momogo.home

import android.content.Context
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.ColorInt
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import jp.co.momogo.R
import jp.co.momogo.databinding.CategoryItemBinding
import jp.co.momogo.model.Category

/**
 * [Category] adapter.
 *
 * @param context context for use resource.
 */
class CategoryAdapter(context: Context) :
    ListAdapter<Category, FoodCategoryViewHolder>(categoryDiff) {

    // set tint and drawable for item checked.
    private val selectedTint = context.getColor(R.color.black_alpha_70)
    private val selectedDrawable = ContextCompat.getDrawable(context, R.drawable.ic_check)!!

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodCategoryViewHolder {
        val binding = CategoryItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        ).apply {
            root.setOnClickListener {
                it.isActivated = !it.isActivated
            }
        }
        return FoodCategoryViewHolder(binding)
    }


    override fun onBindViewHolder(holder: FoodCategoryViewHolder, position: Int) {
        holder.bind(getItem(position), selectedTint, selectedDrawable)
    }
}

class FoodCategoryViewHolder(private val binding: CategoryItemBinding) :
    RecyclerView.ViewHolder(binding.root) {
    fun bind(
        item: Category,
        @ColorInt selectedTint: Int,
        selectedDrawable: Drawable
    ) {
        binding.apply {
            foodcategory = item
            Glide.with(categoryImage)
                .asBitmap()
                .load(item.imageUrl)
                .into(
                    CategoryThumbnailTarget(
                        categoryImage,
                        selectedTint,
                        selectedDrawable
                    )
                )
            executePendingBindings()
        }
    }
}

private val categoryDiff = object : DiffUtil.ItemCallback<Category>() {
    override fun areItemsTheSame(oldItem: Category, newItem: Category) =
        oldItem.id == newItem.id

    override fun areContentsTheSame(oldItem: Category, newItem: Category) =
        oldItem == newItem
}