package jp.co.momogo.model

/**
 * Food category for onBoarding and filters.
 */
data class Category(
    val id: Int,
    val name: String,
    val imageUrl: String
)

/**
 * Sample food category list.
 */
val foodCategories = listOf(
    Category(
        id = 0,
        name = "和食",
        imageUrl = "https://images.unsplash.com/photo-1629684782790-385ed5adb497?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTV8fCVFNiU5NyVBNSVFNiU5QyVBQyVFOSVBMyU5RnxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=800&q=60"
    ),
    Category(
        id = 1,
        name = "洋食",
        imageUrl = "https://cdn.pixabay.com/photo/2022/01/25/14/14/hamburger-6966272_1280.jpg"
    ),
    Category(
        id = 2,
        name = "韓国料理",
        imageUrl = "https://images.pexels.com/photos/12973148/pexels-photo-12973148.jpeg?auto=compress&cs=tinysrgb&w=800"
    ),
    Category(
        id = 3,
        name = "中華",
        imageUrl = "https://cdn.pixabay.com/photo/2016/10/23/09/37/fried-rice-1762493_1280.jpg"
    ),
    Category(
        id = 4,
        name = "ラーメン",
        imageUrl = "https://cdn.pixabay.com/photo/2017/04/04/00/36/ramen-2199962_1280.jpg"
    ),
    Category(
        id = 5,
        name = "寿司 · 海鮮",
        imageUrl = "https://tblg.k-img.com/restaurant/images/Rvw/82179/320x320_square_82179083.jpg"
    ),
    Category(
        id = 6,
        name = "揚げ物",
        imageUrl = "https://images.unsplash.com/photo-1593357849627-cbbc9fda6b05?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8JUU1JUE0JUE5JUUzJTgxJUI3JUUzJTgyJTg5fGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=800&q=60"
    ),
    Category(
        id = 7,
        name = "串焼き",
        imageUrl = "https://images.unsplash.com/photo-1546563730-63db5650a965?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTJ8fCVFNCVCOCVCMiVFNyU4NCVCQyVFMyU4MSU4RHxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=800&q=60"
    ),
    Category(
        id = 8,
        name = "そば · うどん",
        imageUrl = "https://cdn.pixabay.com/photo/2021/07/16/06/32/noodles-6470061_1280.jpg"
    ),
    Category(
        id = 9,
        name = "カレー",
        imageUrl = "https://cdn.pixabay.com/photo/2015/10/01/14/29/curry-967086_1280.jpg"
    ),
    Category(
        id = 10,
        name = "デザート",
        imageUrl = "https://images.pexels.com/photos/2280545/pexels-photo-2280545.jpeg?auto=compress&cs=tinysrgb&w=800"
    ),
)