package jp.co.momogo.legacy

import androidx.annotation.ColorInt
import androidx.annotation.FloatRange
import com.google.android.material.animation.ArgbEvaluatorCompat
import kotlin.math.roundToInt

/**
 * Linearly interpolate between two values
 *
 * ```
 * // lerp example.
 * @param startValue = 10
 * @param endValue = 20
 * @param fraction = 0.5
 *
 * 선형 보간법을 이용한 두 값의 가중치 구하기.
 * example) 10 과 20 의 0.5 를 구하는 공식 사용
 * 10 + 0.5 * (20 - 10)
 * ```
 */
private fun lerp(
    startValue: Float,
    endValue: Float,
    @FloatRange(from = 0.0, fromInclusive = true, to = 1.0, toInclusive = true) fraction: Float
): Float {
    return startValue + fraction * (endValue - startValue)
}

/**
 * Linearly interpolate between two values
 */
private fun lerp(
    startValue: Int,
    endValue: Int,
    @FloatRange(from = 0.0, fromInclusive = true, to = 1.0, toInclusive = true) fraction: Float
): Int {
    return (startValue + fraction * (endValue - startValue)).roundToInt()
}

/**
 * Linearly interpolate between two values when the fraction is in a given range.
 */
private fun lerp(
    startValue: Float,
    endValue: Float,
    @FloatRange(
        from = 0.0,
        fromInclusive = true,
        to = 1.0,
        toInclusive = true
    ) startFraction: Float,
    @FloatRange(from = 0.0, fromInclusive = true, to = 1.0, toInclusive = true) endFraction: Float,
    @FloatRange(from = 0.0, fromInclusive = true, to = 1.0, toInclusive = true) fraction: Float
): Float {
    if (fraction < startFraction) return startValue
    if (fraction > endFraction) return endValue

    return lerp(startValue, endValue, (fraction - startFraction) / (endFraction - startFraction))
}

/**
 * Linearly interpolate between two values when the fraction is in a given range.
 */
private fun lerp(
    startValue: Int,
    endValue: Int,
    @FloatRange(
        from = 0.0,
        fromInclusive = true,
        to = 1.0,
        toInclusive = true
    ) startFraction: Float,
    @FloatRange(from = 0.0, fromInclusive = true, to = 1.0, toInclusive = true) endFraction: Float,
    @FloatRange(from = 0.0, fromInclusive = true, to = 1.0, toInclusive = true) fraction: Float
): Int {
    if (fraction < startFraction) return startValue
    if (fraction > endFraction) return endValue

    return lerp(startValue, endValue, (fraction - startFraction) / (endFraction - startFraction))
}

/**
 * Linearly interpolate between two colors when the fraction is in a given range.
 */
@ColorInt
fun lerpArgb(
    @ColorInt startColor: Int,
    @ColorInt endColor: Int,
    @FloatRange(from = 0.0, fromInclusive = true, to = 1.0, toInclusive = true) fraction: Float
): Int {
    return ArgbEvaluatorCompat.getInstance().evaluate(
        fraction,
        startColor,
        endColor
    )
}

/**
 * Linearly interpolate between two colors when the fraction is in a given range.
 */
@ColorInt
fun lerpArgb(
    @ColorInt startColor: Int,
    @ColorInt endColor: Int,
    @FloatRange(
        from = 0.0,
        fromInclusive = true,
        to = 1.0,
        toInclusive = true
    ) startFraction: Float,
    @FloatRange(from = 0.0, fromInclusive = true, to = 1.0, toInclusive = true) endFraction: Float,
    @FloatRange(from = 0.0, fromInclusive = true, to = 1.0, toInclusive = true) fraction: Float
): Int {
    if (fraction < startFraction) return startColor
    if (fraction > endFraction) return endColor

    return lerpArgb(
        startColor,
        endColor,
        (fraction - startFraction) / (endFraction - startFraction)
    )
}