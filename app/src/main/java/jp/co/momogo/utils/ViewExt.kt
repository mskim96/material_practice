package jp.co.momogo.utils

import android.content.Context
import android.graphics.Color
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.GradientDrawable
import android.view.ViewGroup
import androidx.annotation.DrawableRes
import androidx.core.content.res.ResourcesCompat
import androidx.palette.graphics.Palette

/**
 * Extract color from image and make gradient.
 */
fun extractColorForGradients(
    context: Context,
    @DrawableRes imageDrawable: Int,
    viewGroup: ViewGroup
) {
    val drawable = ResourcesCompat.getDrawable(context.resources, imageDrawable, null)
    val bitmap = (drawable as? BitmapDrawable)?.bitmap

    if (bitmap != null) {
        Palette.from(bitmap).generate { palette ->
            val dominantColor = palette?.dominantSwatch?.rgb ?: 0

            // make gradation
            val gradientDrawable = GradientDrawable(
                GradientDrawable.Orientation.TOP_BOTTOM,
                // The first color code is extra for ui test.
                intArrayOf(Color.parseColor("#3E2A20"), dominantColor, Color.TRANSPARENT),
            )
            gradientDrawable.gradientType = GradientDrawable.LINEAR_GRADIENT

            // set background with gradation
            viewGroup.background = gradientDrawable
        }
    }
}