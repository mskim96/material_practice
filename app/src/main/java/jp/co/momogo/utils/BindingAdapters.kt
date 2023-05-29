package jp.co.momogo.utils

import android.graphics.drawable.Drawable
import android.widget.ImageView
import androidx.annotation.DrawableRes
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DecodeFormat
import com.bumptech.glide.load.engine.DiskCacheStrategy
import jp.co.momogo.home.*

@BindingAdapter("imageUrl", "circleCrop", "placeholder", requireAll = false)
fun ImageView.bindImageUrl(
    url: String,
    circleCrop: Boolean = false,
    placeholder: Drawable? = null
) {
    val request = Glide.with(this).load(url)
    if (circleCrop) request.circleCrop()
    if (placeholder != null) request.placeholder(placeholder)
    request
        .override(500)
        .diskCacheStrategy(DiskCacheStrategy.RESOURCE)
        .skipMemoryCache(true)
        .format(DecodeFormat.PREFER_ARGB_8888)
        .encodeQuality(80)
        .into(this)
}

@BindingAdapter("drawableUrl", "circleCrop", requireAll = false)
fun ImageView.bindDrawableUrl(
    @DrawableRes drawableRes: Int,
    circleCrop: Boolean = false,
) {
    val request = Glide.with(this).load(drawableRes)
    if (circleCrop) request.circleCrop()
    request
        .override(50, 50)
        .diskCacheStrategy(DiskCacheStrategy.RESOURCE)
        .skipMemoryCache(true)
        .format(DecodeFormat.PREFER_ARGB_8888)
        .encodeQuality(80)
        .into(this)
}

@BindingAdapter("adapter")
fun RecyclerView.bindAdapter(adapter: RecyclerView.Adapter<*>) {
    this.adapter = adapter
}

@BindingAdapter("cuisinesItem")
fun RecyclerView.bindCuisinesItem(uiState: CuisineAndRestaurantUiState) {
    val adapter = this.adapter
    if (adapter is CuisineAdapter && uiState is CuisineAndRestaurantUiState.CuisineAndRestaurant) {
        adapter.submitList(uiState.cuisines)
    }
}

@BindingAdapter("restaurantsItem")
fun RecyclerView.bindRestaurantsItem(uiState: CuisineAndRestaurantUiState) {
    val adapter = this.adapter
    if (adapter is RestaurantAdapter && uiState is CuisineAndRestaurantUiState.CuisineAndRestaurant) {
        adapter.submitList(uiState.restaurants)
    }
}

@BindingAdapter("articlesItem")
fun RecyclerView.bindArticleItem(uiState: ArticleUiState) {
    val adapter = this.adapter
    if (adapter is ArticleAdapter && uiState is ArticleUiState.ArticleData) {
        adapter.submitList(uiState.articles)
    }
}
