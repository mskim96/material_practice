package jp.co.momogo.datasource.store

import jp.co.momogo.R
import jp.co.momogo.datasource.model.CuisineResource
import jp.co.momogo.model.CuisineType
import javax.inject.Inject

/**
 * [CuisineResourceStore] for fake FoodResource data.
 */
class CuisineResourceStore @Inject constructor() {
    val cuisines = listOf(
        CuisineResource(
            id = 0,
            name = "Sake dong",
            description = R.string.lorem_description,
            cuisineType = listOf(CuisineType.Japanese, CuisineType.SeaFood),
            imageUrl = "https://images.unsplash.com/photo-1595456982104-14cc660c4d22?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MjR8fHNhc2hpbWl8ZW58MHx8MHx8&auto=format&fit=crop&w=800&q=60",
            price = 1100
        ),
        CuisineResource(
            id = 1,
            name = "Tuna Sushi",
            description = R.string.lorem_description,
            cuisineType = listOf(CuisineType.Japanese, CuisineType.SeaFood),
            imageUrl = "https://images.unsplash.com/photo-1635452273191-f08ce9934102?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTF8fHNhc2hpbWl8ZW58MHx8MHx8&auto=format&fit=crop&w=800&q=60",
            price = 2000
        ),
        CuisineResource(
            id = 2,
            name = "Sardine Sushi",
            description = R.string.lorem_description,
            cuisineType = listOf(CuisineType.Japanese, CuisineType.SeaFood),
            imageUrl = "https://images.unsplash.com/photo-1635451778386-e5778e66f61e?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MjZ8fHNhc2hpbWl8ZW58MHx8MHx8&auto=format&fit=crop&w=800&q=60",
            price = 2500
        ),
        CuisineResource(
            id = 3,
            name = "Ramen",
            description = R.string.lorem_description,
            cuisineType = listOf(CuisineType.Japanese, CuisineType.Noodle),
            imageUrl = "https://images.unsplash.com/photo-1623341214825-9f4f963727da?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8M3x8cmFtZW58ZW58MHx8MHx8&auto=format&fit=crop&w=800&q=60",
            price = 1200
        ),
        CuisineResource(
            id = 4,
            name = "Pork cutlet",
            description = R.string.lorem_description,
            cuisineType = listOf(CuisineType.Japanese, CuisineType.Meat),
            imageUrl = "https://images.unsplash.com/photo-1679279726946-a158b8bcaa23?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8N3x8a2F0c3V8ZW58MHx8MHx8&auto=format&fit=crop&w=800&q=60",
            price = 1500
        ),
        CuisineResource(
            id = 5,
            name = "Japanese noodle",
            description = R.string.lorem_description,
            cuisineType = listOf(CuisineType.Japanese, CuisineType.Noodle),
            imageUrl = "https://images.unsplash.com/photo-1519984388953-d2406bc725e1?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8c29iYXxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=800&q=60",
            price = 900
        ),
        CuisineResource(
            id = 6,
            name = "Meat in pot",
            description = R.string.lorem_description,
            cuisineType = listOf(CuisineType.Korean, CuisineType.Meat),
            imageUrl = "https://images.unsplash.com/photo-1645530656505-1b8a4057889b?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MjZ8fGtvcmVhbiUyMG1lYWx8ZW58MHx8MHx8&auto=format&fit=crop&w=800&q=60",
            price = 1100
        ),
        CuisineResource(
            id = 7,
            name = "Mix rice",
            description = R.string.lorem_description,
            cuisineType = listOf(CuisineType.Korean),
            imageUrl = "https://images.unsplash.com/photo-1639321905636-c1c0e71fb467?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8NDd8fGtvcmVhbiUyMG1lYWx8ZW58MHx8MHx8&auto=format&fit=crop&w=800&q=60",
            price = 1000
        ),
        CuisineResource(
            id = 8,
            name = "Spicy noodle",
            description = R.string.lorem_description,
            cuisineType = listOf(CuisineType.Korean, CuisineType.Noodle),
            imageUrl = "https://images.unsplash.com/photo-1616627052149-22c4f8a6316e?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MjF8fGtvcmVhbiUyMG1lYWx8ZW58MHx8MHx8&auto=format&fit=crop&w=800&q=60",
            price = 700
        ),
        CuisineResource(
            id = 9,
            name = "Korean steam rice",
            description = R.string.lorem_description,
            cuisineType = listOf(CuisineType.Korean, CuisineType.Meat),
            imageUrl = "https://images.unsplash.com/photo-1645530654581-dd24d807b2fc?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mjd8fGtvcmVhbiUyMG1lYWx8ZW58MHx8MHx8&auto=format&fit=crop&w=800&q=60",
            price = 1000
        ),
        CuisineResource(
            id = 10,
            name = "Hamburger",
            description = R.string.lorem_description,
            cuisineType = listOf(CuisineType.Western, CuisineType.Meat),
            imageUrl = "https://images.unsplash.com/photo-1615917124838-1af8a2aaae09?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTJ8fG1lYWx8ZW58MHx8MHx8&auto=format&fit=crop&w=800&q=60",
            price = 800
        ),
        CuisineResource(
            id = 11,
            name = "Meat dish",
            description = R.string.lorem_description,
            cuisineType = listOf(CuisineType.Western, CuisineType.Meat),
            imageUrl = "https://images.unsplash.com/photo-1504674900247-0877df9cc836?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8bWVhbHxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=800&q=60",
            price = 2000
        ),
        CuisineResource(
            id = 12,
            name = "Grilled duck",
            description = R.string.lorem_description,
            cuisineType = listOf(CuisineType.Chinese, CuisineType.Meat),
            imageUrl = "https://images.unsplash.com/photo-1614277786110-1a64e457c4c3?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8NTl8fGNoaW5hJTIwbWVhbHxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=800&q=60",
            price = 2200
        ),
        CuisineResource(
            id = 13,
            name = "Fried dumpling",
            description = R.string.lorem_description,
            cuisineType = listOf(CuisineType.Chinese),
            imageUrl = "https://plus.unsplash.com/premium_photo-1674601031561-4e042aa3242e?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MzF8fGNoaW5hJTIwbWVhbHxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=800&q=60",
            price = 1350
        ),
        CuisineResource(
            id = 14,
            name = "Chinese meat noodle",
            description = R.string.lorem_description,
            cuisineType = listOf(CuisineType.Chinese, CuisineType.Noodle),
            imageUrl = "https://images.unsplash.com/photo-1555126634-323283e090fa?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTB8fHJhbWVufGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=800&q=60",
            price = 960
        ),
        CuisineResource(
            id = 15,
            name = "Meat sandwich",
            description = R.string.lorem_description,
            cuisineType = listOf(CuisineType.Western, CuisineType.Meat),
            imageUrl = "https://images.unsplash.com/photo-1670710029403-607db8eeec83?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8OXx8a2F0c3V8ZW58MHx8MHx8&auto=format&fit=crop&w=800&q=60",
            price = 1100
        ),
        CuisineResource(
            id = 16,
            name = "Meat skewers",
            description = R.string.lorem_description,
            cuisineType = listOf(CuisineType.Western, CuisineType.Meat),
            imageUrl = "https://images.unsplash.com/photo-1594266063697-304befca9629?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8OHx8c2tld2Vyc3xlbnwwfHwwfHw%3D&auto=format&fit=crop&w=800&q=60",
            price = 400
        ),
        CuisineResource(
            id = 17,
            name = "Honeycomb",
            description = R.string.lorem_description,
            cuisineType = listOf(CuisineType.Dessert),
            imageUrl = "https://images.unsplash.com/photo-1563805042-7684c019e1cb?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8NHx8ZGVzc2VydHxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=800&q=60",
            price = 1300
        ),
        CuisineResource(
            id = 18,
            name = "Nougat",
            description = R.string.lorem_description,
            cuisineType = listOf(CuisineType.Dessert),
            imageUrl = "https://images.unsplash.com/photo-1606313564200-e75d5e30476c?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTZ8fGRlc3NlcnR8ZW58MHx8MHx8&auto=format&fit=crop&w=800&q=60",
            price = 1120
        ),
        CuisineResource(
            id = 19,
            name = "Froyo",
            description = R.string.lorem_description,
            cuisineType = listOf(CuisineType.Dessert),
            imageUrl = "https://images.unsplash.com/photo-1620980776848-84ac10194945?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MjZ8fGRlc3NlcnR8ZW58MHx8MHx8&auto=format&fit=crop&w=800&q=60",
            price = 2210
        ),
        CuisineResource(
            id = 20,
            name = "Eclair",
            description = R.string.lorem_description,
            cuisineType = listOf(CuisineType.Dessert),
            imageUrl = "https://images.unsplash.com/photo-1593424718424-cf4d83f3def1?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MjN8fGRlc3NlcnR8ZW58MHx8MHx8&auto=format&fit=crop&w=800&q=60",
            price = 1780
        ),
        CuisineResource(
            id = 21,
            name = "Japanese curry",
            description = R.string.lorem_description,
            cuisineType = listOf(CuisineType.Japanese),
            imageUrl = "https://images.unsplash.com/photo-1631292784640-2b24be784d5d?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTd8fGN1cnJ5fGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=800&q=60",
            price = 980
        ),
        CuisineResource(
            id = 22,
            name = "Salmon with curry",
            description = R.string.lorem_description,
            cuisineType = listOf(CuisineType.Western),
            imageUrl = "https://images.unsplash.com/photo-1574484284002-952d92456975?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Nnx8Y3Vycnl8ZW58MHx8MHx8&auto=format&fit=crop&w=800&q=60",
            price = 1270
        ),
        CuisineResource(
            id = 23,
            name = "Yogurt",
            description = R.string.lorem_description,
            cuisineType = listOf(CuisineType.Dessert),
            imageUrl = "https://images.unsplash.com/photo-1501959915551-4e8d30928317?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTd8fG1lYWx8ZW58MHx8MHx8&auto=format&fit=crop&w=800&q=60",
            price = 610
        ),
        CuisineResource(
            id = 24,
            name = "Chinese fried noodle",
            description = R.string.lorem_description,
            cuisineType = listOf(CuisineType.Chinese, CuisineType.Noodle),
            imageUrl = "https://images.unsplash.com/photo-1612929633738-8fe44f7ec841?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8NXx8bm9vZGxlfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=800&q=60",
            price = 830
        ),
        CuisineResource(
            id = 25,
            name = "Chinese noodle",
            description = R.string.lorem_description,
            cuisineType = listOf(CuisineType.Chinese, CuisineType.Noodle),
            imageUrl = "https://images.unsplash.com/photo-1591814468924-caf88d1232e1?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8NXx8cmFtZW58ZW58MHx8MHx8&auto=format&fit=crop&w=800&q=60",
            price = 920
        ),
        CuisineResource(
            id = 26,
            name = "Sashimi",
            description = R.string.lorem_description,
            cuisineType = listOf(CuisineType.Japanese, CuisineType.SeaFood),
            imageUrl = "https://images.unsplash.com/photo-1534256958597-7fe685cbd745?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8c2FzaGltaXxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=800&q=60",
            price = 2200
        ),
        CuisineResource(
            id = 27,
            name = "Tuna dish",
            description = R.string.lorem_description,
            cuisineType = listOf(CuisineType.Western, CuisineType.SeaFood),
            imageUrl = "https://images.unsplash.com/photo-1501595091296-3aa970afb3ff?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MjB8fHNhc2hpbWl8ZW58MHx8MHx8&auto=format&fit=crop&w=800&q=60",
            price = 3150
        ),
        CuisineResource(
            id = 28,
            name = "Salmon dish",
            description = R.string.lorem_description,
            cuisineType = listOf(CuisineType.Western, CuisineType.SeaFood),
            imageUrl = "https://plus.unsplash.com/premium_photo-1675676486598-733979a2218f?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8bWVhbHxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=800&q=60",
            price = 5050
        ),
        CuisineResource(
            id = 29,
            name = "Meat nabe",
            description = R.string.lorem_description,
            cuisineType = listOf(CuisineType.Meat, CuisineType.Korean),
            imageUrl = "https://plus.unsplash.com/premium_photo-1661412855930-2936cf94e57a?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8a29yZWFuJTIwbWVhbHxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=800&q=60",
            price = 4500
        )
    )
}