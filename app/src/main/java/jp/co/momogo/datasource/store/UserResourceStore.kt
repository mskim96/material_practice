package jp.co.momogo.datasource.store

import jp.co.momogo.R
import jp.co.momogo.datasource.model.UserResource
import javax.inject.Inject

/**
 * [UserResourceStore] for fake UserResource data.
 */
class UserResourceStore @Inject constructor() {
    val users = listOf(
        UserResource(
            id = 0,
            username = R.string.username1,
            profileImage = R.drawable.avatar_1
        ),
        UserResource(
            id = 1,
            username = R.string.username2,
            profileImage = R.drawable.avatar_2
        ),
        UserResource(
            id = 2,
            username = R.string.username3,
            profileImage = R.drawable.avatar_3
        ),
        UserResource(
            id = 3,
            username = R.string.username4,
            profileImage = R.drawable.avatar_4
        ),
        UserResource(
            id = 4,
            username = R.string.username5,
            profileImage = R.drawable.avatar_5
        ),
        UserResource(
            id = 5,
            username = R.string.username6,
            profileImage = R.drawable.avatar_6
        ),
        UserResource(
            id = 6,
            username = R.string.username7,
            profileImage = R.drawable.avatar_7
        ),
        UserResource(
            id = 7,
            username = R.string.username8,
            profileImage = R.drawable.avatar_8
        ),
    )
}