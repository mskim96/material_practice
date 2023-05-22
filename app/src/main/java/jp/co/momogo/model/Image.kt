package jp.co.momogo.model

/**
 * Data class for restaurant's image list in detail pages.
 */
data class Image(
    val url: String
)

fun String.toImage() = Image(url = this)