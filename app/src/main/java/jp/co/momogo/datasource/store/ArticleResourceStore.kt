package jp.co.momogo.datasource.store

import jp.co.momogo.R
import jp.co.momogo.datasource.model.ArticleResource
import jp.co.momogo.model.CuisineType
import javax.inject.Inject

/**
 *  [ArticleResourceStore] for fake ArticleResource data.
 */
class ArticleResourceStore @Inject constructor(
    userResourceStore: UserResourceStore,
) {
    val articles = listOf(
        ArticleResource(
            id = 0,
            title = R.string.article_title1,
            body = R.string.article_body1,
            attachment = listOf(
                "https://images.unsplash.com/photo-1591814252471-068b545dff62?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NDF8fGphcGFuZXNlJTIwY3Vpc2luZXxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=700&q=60",
                "https://images.unsplash.com/photo-1504416285472-eccf03dd31eb?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MjN8fGphcGFuZXNlJTIwZm9vZHxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=700&q=60",
                "https://images.unsplash.com/photo-1611518040286-9af8ba97ab46?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Nnx8amFwYW5lc2UlMjBmb29kfGVufDB8fDB8fHww&auto=format&fit=crop&w=700&q=60",
                "https://images.unsplash.com/photo-1629684782790-385ed5adb497?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTV8fGphcGFuZXNlJTIwZm9vZHxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=700&q=60",
            ),
            cuisineType = listOf(CuisineType.Japanese, CuisineType.Meat),
            like = 37,
            author = userResourceStore.users[5]
        ),

        ArticleResource(
            id = 1,
            title = R.string.article_title2,
            body = R.string.article_body2,
            attachment = listOf(
                "https://images.unsplash.com/photo-1482049016688-2d3e1b311543?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTB8fGZvb2R8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=700&q=60",
                "https://images.unsplash.com/photo-1467003909585-2f8a72700288?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTJ8fGZvb2R8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=700&q=60",
                "https://images.unsplash.com/photo-1476224203421-9ac39bcb3327?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MjN8fGZvb2R8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=700&q=60",
                "https://images.unsplash.com/photo-1529042410759-befb1204b468?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MjZ8fGZvb2R8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=700&q=60",
            ),
            cuisineType = listOf(CuisineType.Meat, CuisineType.Western),
            like = 3,
            author = userResourceStore.users[6]
        ),

        ArticleResource(
            id = 2,
            title = R.string.article_title3,
            body = R.string.article_body3,
            attachment = listOf(
                "https://images.unsplash.com/photo-1538128844159-f08f41bfb169?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTV8fHJhbWVuJTIwbm9vZGxlfGVufDB8fDB8fHww&auto=format&fit=crop&w=700&q=60",
                "https://images.unsplash.com/photo-1557872943-16a5ac26437e?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MjN8fHJhbWVuJTIwbm9vZGxlfGVufDB8fDB8fHww&auto=format&fit=crop&w=700&q=60",
                "https://images.unsplash.com/photo-1558220831-9ad8f955fb9b?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mjd8fHJhbWVuJTIwbm9vZGxlfGVufDB8fDB8fHww&auto=format&fit=crop&w=700&q=60",
                "https://images.unsplash.com/photo-1582317359559-7c41901108ab?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MzN8fHJhbWVuJTIwbm9vZGxlfGVufDB8fDB8fHww&auto=format&fit=crop&w=700&q=60",
            ),
            cuisineType = listOf(CuisineType.Japanese, CuisineType.Noodle),
            like = 7,
            author = userResourceStore.users[7]
        ),

        ArticleResource(
            id = 3,
            title = R.string.article_title4,
            body = R.string.article_body4,
            attachment = listOf(
                "https://images.unsplash.com/photo-1605472878388-32446ae9a869?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTR8fGNhZmZlfGVufDB8fDB8fHww&auto=format&fit=crop&w=700&q=60",
                "https://images.unsplash.com/photo-1620673667171-64fe48bbd061?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MjZ8fGNhZmZlfGVufDB8fDB8fHww&auto=format&fit=crop&w=700&q=60",
                "https://images.unsplash.com/photo-1616866860951-417035eda234?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MzN8fGNhZmZlfGVufDB8fDB8fHww&auto=format&fit=crop&w=700&q=60",
                "https://images.unsplash.com/photo-1622900177953-b100ed831a73?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mzd8fGNhZmZlfGVufDB8fDB8fHww&auto=format&fit=crop&w=700&q=60",
            ),
            cuisineType = listOf(CuisineType.Dessert),
            like = 12,
            author = userResourceStore.users[1]
        ),

        ArticleResource(
            id = 4,
            title = R.string.article_title5,
            body = R.string.article_body5,
            attachment = listOf(
                "https://images.unsplash.com/photo-1595579541006-88cc69810d69?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTV8fHNlYWZvb2QlMjBkaXNofGVufDB8fDB8fHww&auto=format&fit=crop&w=700&q=60",
                "https://images.unsplash.com/photo-1569623803819-2db1d5cf8f16?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8c2VhZm9vZCUyMHJlc3RhdXJhbnR8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=700&q=60",
                "https://images.unsplash.com/photo-1594489237444-e68a0ad88c9f?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NHx8c2VhZm9vZCUyMGRpc2h8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=700&q=60",
                "https://images.unsplash.com/photo-1513271224036-f526ad664968?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8M3x8c2VhZm9vZCUyMHJlc3RhdXJhbnR8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=700&q=60",
            ),
            cuisineType = listOf(CuisineType.Western, CuisineType.SeaFood),
            like = 3,
            author = userResourceStore.users[2]
        ),

        ArticleResource(
            id = 5,
            title = R.string.article_title6,
            body = R.string.article_body6,
            attachment = listOf(
                "https://images.unsplash.com/photo-1632558610168-8377309e34c7?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NTZ8fGtvcmVhbiUyMHJlc3RhdXJhbnR8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=700&q=60",
                "https://images.unsplash.com/photo-1590301157890-4810ed352733?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8a29yZWFuJTIwZm9vZHxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=700&q=60",
                "https://images.unsplash.com/photo-1548150914-c9f19106dbf6?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTF8fGtvcmVhbiUyMGZvb2R8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=700&q=60",
                "https://images.unsplash.com/photo-1575932444877-5106bee2a599?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTd8fGtvcmVhbiUyMGZvb2R8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=700&q=60",
            ),
            cuisineType = listOf(CuisineType.Korean, CuisineType.Meat, CuisineType.SeaFood),
            like = 10,
            author = userResourceStore.users[6]
        ),

        ArticleResource(
            id = 6,
            title = R.string.article_title7,
            body = R.string.article_body7,
            attachment = listOf(
                "https://images.unsplash.com/photo-1534256958597-7fe685cbd745?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8c2FzaGltaXxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=700&q=60",
                "https://images.unsplash.com/photo-1595456982104-14cc660c4d22?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MjR8fHNhc2hpbWl8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=700&q=60",
                "https://images.unsplash.com/photo-1635452065566-9c89471bb86c?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MjF8fHNhc2hpbWl8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=700&q=60",
                "https://plus.unsplash.com/premium_photo-1664474412110-9605152d1477?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MjV8fHNhc2hpbWl8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=700&q=60",
            ),
            cuisineType = listOf(CuisineType.Japanese, CuisineType.SeaFood),
            like = 15,
            author = userResourceStore.users[4]
        ),

        ArticleResource(
            id = 7,
            title = R.string.article_title8,
            body = R.string.article_body8,
            attachment = listOf(
                "https://images.unsplash.com/photo-1567533708067-239a2371890b?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTJ8fGtvcmVhJTIwZm9vZHxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=700&q=60",
                "https://images.unsplash.com/photo-1548115194-20ba2364c21a?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTR8fGtvcmVhJTIwY3Vpc2luZXxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=700&q=60",
                "https://images.unsplash.com/photo-1545984929-f28d9e323a00?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NHx8a29yZWElMjBmb29kfGVufDB8fDB8fHww&auto=format&fit=crop&w=700&q=60",
                "https://images.unsplash.com/photo-1562749606-0a9eb5a8a0f3?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTV8fGtvcmVhJTIwZm9vZHxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=700&q=60",
            ),
            cuisineType = listOf(CuisineType.Korean, CuisineType.Meat),
            like = 27,
            author = userResourceStore.users[2]
        ),

        ArticleResource(
            id = 8,
            title = R.string.article_title9,
            body = R.string.article_body9,
            attachment = listOf(
                "https://images.unsplash.com/photo-1607447358430-3803cdb7af77?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MzV8fGNhZmZlfGVufDB8fDB8fHww&auto=format&fit=crop&w=700&q=60",
                "https://images.unsplash.com/photo-1557772611-722dabe20327?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NDR8fGNhZmZlfGVufDB8fDB8fHww&auto=format&fit=crop&w=700&q=60",
                "https://images.unsplash.com/photo-1614707267537-b85aaf00c4b7?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MzJ8fGRlc3NlcnR8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=700&q=60",
                "https://images.unsplash.com/photo-1600103560389-a4af170d0180?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NTZ8fGNhZmZlfGVufDB8fDB8fHww&auto=format&fit=crop&w=700&q=60",
            ),
            cuisineType = listOf(CuisineType.Dessert),
            like = 32,
            author = userResourceStore.users[3]
        ),

        ArticleResource(
            id = 9,
            title = R.string.article_title10,
            body = R.string.article_body10,
            attachment = listOf(
                "https://images.unsplash.com/photo-1544601284-7fe39c93d4d4?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8Y2hpbmElMjBjdWlzaW5lfGVufDB8fDB8fHww&auto=format&fit=crop&w=700&q=60",
                "https://images.unsplash.com/photo-1614387107641-8fd3c1081a58?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTF8fGNoaW5hJTIwY3Vpc2luZXxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=700&q=60",
                "https://images.unsplash.com/photo-1470114755716-3e1124c6c3bd?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTh8fGNoaW5hJTIwY3Vpc2luZXxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=700&q=60",
                "https://images.unsplash.com/photo-1600676626316-4d44818a4ffe?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mzl8fGNoaW5hJTIwY3Vpc2luZXxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=700&q=60",
            ),
            cuisineType = listOf(CuisineType.Chinese, CuisineType.Meat),
            like = 0,
            author = userResourceStore.users[0]
        ),
    )
}