package jp.co.momogo.utils

import android.util.DisplayMetrics
import androidx.annotation.DimenRes
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearSmoothScroller
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import kotlinx.coroutines.*

/**
 * Show edges of both side items for [ViewPager2]
 *
 * @param numberOfPage retain to either side of the currently visible pages.
 * @param pageMarginRes margin of items.
 */
fun ViewPager2.showBothSideEdges(
    numberOfPage: Int = 1,
    @DimenRes pageMarginRes: Int,
) {
    offscreenPageLimit = numberOfPage
    val pageMarginPx = resources.getDimensionPixelOffset(pageMarginRes)
    setPageTransformer { page, position ->
        /**
         * if item have 16dp margin of horizontal,
         * need translationX for least 33dp for show edge.
         */
        val offset = position * -((pageMarginPx * 3) / 2)
        page.translationX = offset
    }
}

/**
 * Run banner behavior
 */
fun ViewPager2.startBannerRun(lifecycleOwner: LifecycleOwner): Job =
    lifecycleOwner.lifecycleScope.launch {
        withContext(Dispatchers.Default) {
            while (true) {
                delay(BANNER_RUN_DELAY)
                val itemCount = this@startBannerRun.adapter?.itemCount ?: break
                val nextBanner =
                    // Move first item if current position equal or greater than item count.
                    (this@startBannerRun.currentItem + 1).let { if (it < itemCount) it else 0 }

                // switching dispatcher for ui.
                withContext(Dispatchers.Main) {
                    this@startBannerRun.currentItem = nextBanner
                }
            }
        }
    }

private const val BANNER_RUN_DELAY = 4000L