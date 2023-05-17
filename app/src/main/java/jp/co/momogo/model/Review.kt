package jp.co.momogo.model

/**
 * Review class for display [Restaurant].
 */
data class Review(
    val id: Int,
    val title: String,
    val description: String,
    val image: List<String> = emptyList(),
    val author: User
)
