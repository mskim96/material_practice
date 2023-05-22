package jp.co.momogo.home

import android.animation.ValueAnimator
import android.graphics.*
import android.graphics.drawable.Drawable
import android.widget.ImageView
import androidx.annotation.ColorInt
import androidx.core.graphics.toRectF
import androidx.core.graphics.withScale
import androidx.interpolator.view.animation.FastOutSlowInInterpolator
import com.bumptech.glide.request.target.ImageViewTarget
import kotlin.math.abs

/**
 * Wrap [Bitmap] for custom drawable on imageView.
 */
class CategoryThumbnailTarget(
    imageView: ImageView,
    @ColorInt private val selectedTint: Int,
    private val selectedDrawable: Drawable
) : ImageViewTarget<Bitmap>(imageView) {

    // wrap glide's target by bitmap.
    override fun setResource(resource: Bitmap?) {
        resource?.let {
            val d = (currentDrawable as? FoodCategoryDrawable) ?: FoodCategoryDrawable(
                selectedTint,
                selectedDrawable
            )
            d.bitmap = it
            setDrawable(d)
        }
    }
}

/**
 * Drawable responds to `state_activity` by
 * - Drawing a tint overlay
 * - Overlaying another drawable showing the selection.
 */
private const val ANIM_DURATION = 300L

class FoodCategoryDrawable(
    @ColorInt selectedTint: Int,
    private val selectedDrawable: Drawable
) : Drawable() {

    var bitmap: Bitmap? = null
        set(value) {
            if (value != null) {
                thumbPaint.shader =
                    BitmapShader(value, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP)
            }
            progress = 0f
        }

    // thumbnail Paint
    private val thumbPaint = Paint(Paint.ANTI_ALIAS_FLAG)

    // Set paint to overlay over image.
    private val tintPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        color = selectedTint
        style = Paint.Style.FILL
    }

    // set color alpha.
    private val tintAlpha = Color.alpha(selectedTint)

    // set path
    private val path = Path()

    // set progress value it coerce in 0 to 1 and update.
    private var progress = 0f
        set(value) {
            val clamped = value.coerceIn(0f, 1f)
            if (clamped != field) {
                field = clamped
                update()
            }
        }

    // animator for progress.
    private var progressAnim: ValueAnimator? = null

    // interpolator
    private val interp = FastOutSlowInInterpolator()

    // set pivot x, y (center)
    private var pivotX = 0f
    private var pivotY = 0f

    /**
     * set the alpha value of tint paint to 0 or 1 and redraw it.
     */
    private fun update() {
        path.run {
            if (!bounds.isEmpty) {
                reset()
                addRoundRect(
                    bounds.toRectF(),
                    floatArrayOf(0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f),
                    Path.Direction.CW
                )
            }
        }
        tintPaint.alpha = (progress * tintAlpha).toInt()
        callback?.invalidateDrawable(this)
    }

    /**
     *
     */
    override fun onStateChange(state: IntArray): Boolean {
        val initialProgress = progress
        // set 1 or 0 to new progress if state is activate.
        val newProgress = if (state.contains(android.R.attr.state_activated)) {
            1f
        } else {
            0f
        }
        progressAnim?.cancel()
        progressAnim = ValueAnimator.ofFloat(initialProgress, newProgress).apply {
            addUpdateListener {
                progress = animatedValue as Float
            }
            duration = (abs(newProgress - initialProgress) * ANIM_DURATION).toLong()
            interpolator = interp
        }
        progressAnim?.start()
        return newProgress == initialProgress
    }

    override fun isStateful() = true

    override fun onBoundsChange(bounds: Rect) {
        update()
        val dLeft = (bounds.right - selectedDrawable.intrinsicWidth) / 2
        val dTop = (bounds.bottom - selectedDrawable.intrinsicHeight) / 2
        selectedDrawable.setBounds(
            dLeft,
            dTop,
            dLeft + selectedDrawable.intrinsicWidth,
            dTop + selectedDrawable.intrinsicHeight
        )
        pivotX = (bounds.width() / 2f) - (3f / 24f * selectedDrawable.intrinsicWidth)
        pivotY = (bounds.height() / 2f) + (5f / 24f * selectedDrawable.intrinsicWidth)
    }

    override fun draw(canvas: Canvas) {
        canvas.drawPath(path, thumbPaint)
        if (progress > 0f) {
            canvas.drawPath(path, tintPaint)
            canvas.withScale(progress, progress, pivotX, pivotY) {
                selectedDrawable.draw(canvas)
            }
        }
    }

    override fun setAlpha(alpha: Int) {
        thumbPaint.alpha = alpha
    }

    override fun setColorFilter(colorFilter: ColorFilter?) {
        thumbPaint.colorFilter = colorFilter
    }

    override fun getOpacity() = PixelFormat.TRANSLUCENT
}