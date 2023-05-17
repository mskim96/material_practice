package jp.co.momogo.model

/**
 * Banner data class.
 */
data class Banner(
    val id: Int,
    val title: String,
    val subTitle: String,
    val imageUrl: String,
    val restaurantId: Int
)

val banners = listOf(
    Banner(
        id = 0,
        title = "ゆずの小町",
        subTitle = "柚子の香り、味、色味が華やかな手料理",
        imageUrl = "https://images.unsplash.com/photo-1608060313204-295e532517df?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTF8fGl6YWtheWF8ZW58MHx8MHx8&auto=format&fit=crop&w=800&q=60",
        restaurantId = 0
    ),

    Banner(
        id = 1,
        title = "ふじてん",
        subTitle = "長い伝統の天ぷら",
        imageUrl = "https://images.unsplash.com/photo-1480796927426-f609979314bd?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8NHx8c2hpYnV5YSUyMHJlc3RhdXJhbnR8ZW58MHx8MHx8&auto=format&fit=crop&w=800&q=60",
        restaurantId = 1
    ),

    Banner(
        id = 2,
        title = "渋谷横丁",
        subTitle = "80年代のレトロな雰囲気",
        imageUrl = "https://images.unsplash.com/photo-1667061504636-f92112e7bc9b?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTd8fHNoaWJ1eWElMjByZXN0YXVyYW50fGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=800&q=60",
        restaurantId = 2
    ),

    Banner(
        id = 3,
        title = "コーンバレー",
        subTitle = "豊富な洋酒と伝統の肉料理",
        imageUrl = "https://images.unsplash.com/photo-1517638851339-a711cfcf3279?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8NTh8fHNoaWJ1eWElMjByZXN0YXVyYW50fGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=800&q=60",
        restaurantId = 3
    ),

    Banner(
        id = 4,
        title = "avan",
        subTitle = "落ち着いた店内とグルテンフリー料理",
        imageUrl = "https://images.unsplash.com/photo-1569096651661-820d0de8b4ab?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8NjZ8fHNoaWJ1eWElMjByZXN0YXVyYW50fGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=800&q=60",
        restaurantId = 4
    ),

    Banner(
        id = 5,
        title = "biodinamico",
        subTitle = "薪焼き本格イタリアンと自社ワイン",
        imageUrl = "https://images.unsplash.com/photo-1471253794676-0f039a6aae9d?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTkzfHxzaGlidXlhJTIwcmVzdGF1cmFudHxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=800&q=60",
        restaurantId = 5
    ),

    Banner(
        id = 6,
        title = "カフェ ブリュ",
        subTitle = "ランチ・カフェ・ワインまで楽しめる",
        imageUrl = "https://images.unsplash.com/photo-1555396273-367ea4eb4db5?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTkyfHxzaGlidXlhJTIwcmVzdGF1cmFudHxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=800&q=60",
        restaurantId = 6
    )
)