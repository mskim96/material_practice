package jp.co.momogo.datasource.store

import jp.co.momogo.R
import jp.co.momogo.datasource.model.ReviewResource
import javax.inject.Inject

/**
 * [ReviewResourceStore] for fake restaurant's MenuResource data.
 */
class ReviewResourceStore @Inject constructor(userResourceStore: UserResourceStore) {
    val reviews = listOf(
        ReviewResource(
            id = 0,
            title = R.string.review_title1,
            body = R.string.review_body1,
            rating = 4.5,
            author = userResourceStore.users[0]
        ),

        ReviewResource(
            id = 1,
            title = R.string.review_title2,
            body = R.string.review_body2,
            rating = 4.5,
            author = userResourceStore.users[1]
        ),

        ReviewResource(
            id = 2,
            title = R.string.review_title3,
            body = R.string.review_body3,
            rating = 5.0,
            author = userResourceStore.users[2]
        ),

        ReviewResource(
            id = 3,
            title = R.string.review_title4,
            body = R.string.review_body4,
            rating = 4.1,
            author = userResourceStore.users[3]
        ),

        ReviewResource(
            id = 4,
            title = R.string.review_title5,
            body = R.string.review_body5,
            rating = 3.7,
            author = userResourceStore.users[4]
        ),
    )
}