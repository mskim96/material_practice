package jp.co.momogo.utils

import android.graphics.drawable.Drawable
import android.widget.Button
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.annotation.DrawableRes
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DecodeFormat
import com.bumptech.glide.load.engine.DiskCacheStrategy
import jp.co.momogo.detail.ArticleDetailUiState
import jp.co.momogo.detail.RestaurantDetailUiState
import jp.co.momogo.detail.adapter.ArticleDetailAttachmentAdapter
import jp.co.momogo.detail.adapter.RestaurantDetailTopImageAdapter
import jp.co.momogo.detail.adapter.ReviewAdapter
import jp.co.momogo.home.*
import jp.co.momogo.home.adapter.ArticleAdapter
import jp.co.momogo.home.adapter.CuisineAdapter
import jp.co.momogo.home.adapter.RestaurantAdapter
import java.text.NumberFormat
import java.util.*

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

@BindingAdapter("attachImage")
fun ImageView.bindAttachImage(
    url: String,
) {
    val request = Glide.with(this).load(url)
    request
        .override(150)
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

@BindingAdapter("cuisinePrice")
fun TextView.bindCuisinePrice(amount: Int) {
    val localeJapan = Locale("ja", "JP")
    val currencyFormatter = NumberFormat.getCurrencyInstance(localeJapan)
    val result = currencyFormatter.format(amount)
    this.text = result
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

@BindingAdapter("articleTitle")
fun TextView.bindArticleTitle(uiState: ArticleDetailUiState) {
    if (uiState is ArticleDetailUiState.ArticleDetail) {
        this.text = resources.getText(uiState.data.title)
    }
}

@BindingAdapter("articleBody")
fun TextView.bindArticleBody(uiState: ArticleDetailUiState) {
    if (uiState is ArticleDetailUiState.ArticleDetail) {
        this.text = resources.getText(uiState.data.body)
    }
}

@BindingAdapter("articleAuthorProfile")
fun ImageView.bindArticleAuthorProfileImage(uiState: ArticleDetailUiState) {
    if (uiState is ArticleDetailUiState.ArticleDetail) {
        this.bindDrawableUrl(uiState.data.author.profileImage, true)
    }
}

@BindingAdapter("articleAuthorName")
fun TextView.bindArticleAuthorName(uiState: ArticleDetailUiState) {
    if (uiState is ArticleDetailUiState.ArticleDetail) {
        this.text = resources.getString(uiState.data.author.username)
    }
}

@BindingAdapter("articleInnerAttachmentItems")
fun RecyclerView.bindArticleInnerAttachmentItems(uiState: ArticleDetailUiState) {
    val adapter = this.adapter
    if (adapter is ArticleDetailAttachmentAdapter && uiState is ArticleDetailUiState.ArticleDetail) {
        adapter.submitList(uiState.data.attachment)
    }
}

@BindingAdapter("restaurantTopImages")
fun RecyclerView.bindRestaurantTopImages(uiState: RestaurantDetailUiState) {
    val adapter = this.adapter
    if (adapter is RestaurantDetailTopImageAdapter && uiState is RestaurantDetailUiState.RestaurantDetail) {
        adapter.submitList(uiState.data.restaurantImages)
    }
}

@BindingAdapter("restaurantName")
fun TextView.bindRestaurantName(uiState: RestaurantDetailUiState) {
    if (uiState is RestaurantDetailUiState.RestaurantDetail) {
        this.text = uiState.data.name
    }
}

@BindingAdapter("restaurantType")
fun TextView.bindRestaurantType(uiState: RestaurantDetailUiState) {
    if (uiState is RestaurantDetailUiState.RestaurantDetail) {
        this.text = uiState.data.category[0].displayName
    }
}

@BindingAdapter("restaurantLocation")
fun Button.bindRestaurantLocation(uiState: RestaurantDetailUiState) {
    if (uiState is RestaurantDetailUiState.RestaurantDetail) {
        this.text = uiState.data.location
    }
}

@BindingAdapter("restaurantRating")
fun Button.bindRestaurantRating(uiState: RestaurantDetailUiState) {
    if (uiState is RestaurantDetailUiState.RestaurantDetail) {
        this.text = uiState.data.rating.toString()
    }
}

@BindingAdapter("restaurantDescription")
fun TextView.bindRestaurantDescription(uiState: RestaurantDetailUiState) {
    if (uiState is RestaurantDetailUiState.RestaurantDetail) {
        this.text = resources.getText(uiState.data.description)
    }
}

@BindingAdapter("restaurantMenus")
fun RecyclerView.bindRestaurantMenus(uiState: RestaurantDetailUiState) {
    val adapter = this.adapter
    if (adapter is CuisineAdapter && uiState is RestaurantDetailUiState.RestaurantDetail) {
        adapter.submitList(uiState.data.menus.menuList)
    }
}

@BindingAdapter("reviewDoubleToFloat")
fun RatingBar.bindReviewRating(amount: Double) {
    val convert = amount.toFloat()
    this.rating = convert
}

@BindingAdapter("reviewItems")
fun RecyclerView.bindReviewItems(uiState: RestaurantDetailUiState) {
    val adapter = this.adapter
    if (adapter is ReviewAdapter && uiState is RestaurantDetailUiState.RestaurantDetail) {
        adapter.submitList(uiState.data.review)
    }
}