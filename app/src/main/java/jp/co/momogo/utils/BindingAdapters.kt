package jp.co.momogo.utils

import android.graphics.drawable.Drawable
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import jp.co.momogo.home.HomeUiState
import jp.co.momogo.home.RestaurantVerticalAdapter

@BindingAdapter("imageUrl", "circleCrop", "placeholder", requireAll = false)
fun ImageView.bindImageUrl(
    url: String,
    circleCrop: Boolean = false,
    placeholder: Drawable? = null
) {
    val request = Glide.with(this).load(url)
    if (circleCrop) request.circleCrop()
    if (placeholder != null) request.placeholder(placeholder)
    request.into(this)
}

@BindingAdapter("homeItems")
fun RecyclerView.bindAdapter(uiState: HomeUiState) {
    if (uiState is HomeUiState.RestaurantsWithType) {
        (adapter as RestaurantVerticalAdapter).submitList(uiState.data)
    }
}