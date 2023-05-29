package jp.co.momogo.datasource.store

import jp.co.momogo.R
import jp.co.momogo.datasource.model.CuisineResource
import jp.co.momogo.datasource.model.MenuResource
import jp.co.momogo.model.CuisineType
import javax.inject.Inject

/**
 * [MenuResourceStore] for fake restaurant's MenuResource data.
 */
class MenuResourceStore @Inject constructor() {

    val menus = listOf(
        MenuResource(
            menuList = listOf(
                CuisineResource(
                    id = 50,
                    name = "Sushi roll",
                    description = R.string.lorem_description,
                    cuisineType = listOf(CuisineType.Japanese),
                    imageUrl = "https://images.unsplash.com/photo-1579584425555-c3ce17fd4351?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8OXx8amFwYW5lcyUyMHN1c2hpfGVufDB8fDB8fHww&auto=format&fit=crop&w=700&q=60",
                    price = 1500,
                ),
                CuisineResource(
                    id = 51,
                    name = "Sushi set",
                    description = R.string.lorem_description,
                    cuisineType = listOf(CuisineType.Japanese),
                    imageUrl = "https://images.unsplash.com/photo-1514190051997-0f6f39ca5cde?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MzN8fGphcGFuZXMlMjBzdXNoaXxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=700&q=60",
                    price = 2000,
                ),
                CuisineResource(
                    id = 52,
                    name = "Shrimp sushi",
                    description = R.string.lorem_description,
                    cuisineType = listOf(CuisineType.Japanese),
                    imageUrl = "https://images.unsplash.com/photo-1628676825882-32c387815bdd?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NDZ8fGphcGFuZXMlMjBzdXNoaXxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=700&q=60",
                    price = 500,
                ),
                CuisineResource(
                    id = 53,
                    name = "Salmon plate",
                    description = R.string.lorem_description,
                    cuisineType = listOf(CuisineType.Japanese),
                    imageUrl = "https://images.unsplash.com/photo-1595456982104-14cc660c4d22?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MjN8fGphcGFuZXMlMjBzYXNoaW1pfGVufDB8fDB8fHww&auto=format&fit=crop&w=700&q=60",
                    price = 2500,
                ),
                CuisineResource(
                    id = 54,
                    name = "Sashimi",
                    description = R.string.lorem_description,
                    cuisineType = listOf(CuisineType.Japanese),
                    imageUrl = "https://images.unsplash.com/photo-1534256958597-7fe685cbd745?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MzJ8fGphcGFuZXMlMjBzYXNoaW1pfGVufDB8fDB8fHww&auto=format&fit=crop&w=700&q=60",
                    price = 4000,
                ),
            )
        ),
        MenuResource(
            menuList = listOf(
                CuisineResource(
                    id = 50,
                    name = "Tendon",
                    description = R.string.lorem_description,
                    cuisineType = listOf(CuisineType.Japanese),
                    imageUrl = "https://images.unsplash.com/photo-1593357849627-cbbc9fda6b05?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTJ8fGphcGFuJTIwZm9vZHxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=700&q=60",
                    price = 900,
                ),
                CuisineResource(
                    id = 51,
                    name = "Fork cutlet",
                    description = R.string.lorem_description,
                    cuisineType = listOf(CuisineType.Japanese),
                    imageUrl = "https://images.unsplash.com/photo-1496112774951-bf41010eed5e?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTR8fGphcGFuJTIwZm9vZHxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=700&q=60",
                    price = 1000,
                ),
                CuisineResource(
                    id = 52,
                    name = "Yakitori",
                    description = R.string.lorem_description,
                    cuisineType = listOf(CuisineType.Japanese),
                    imageUrl = "https://images.unsplash.com/photo-1573806439793-82aa612294b2?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MjN8fGphcGFuJTIwZm9vZHxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=700&q=60",
                    price = 800,
                ),
                CuisineResource(
                    id = 53,
                    name = "Soba set",
                    description = R.string.lorem_description,
                    cuisineType = listOf(CuisineType.Japanese),
                    imageUrl = "https://images.unsplash.com/photo-1571478601279-7268c1f57439?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NTR8fGphcGFuJTIwZm9vZHxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=700&q=60",
                    price = 1200,
                ),
                CuisineResource(
                    id = 54,
                    name = "Beef Katsu",
                    description = R.string.lorem_description,
                    cuisineType = listOf(CuisineType.Japanese),
                    imageUrl = "https://images.unsplash.com/photo-1555786456-6d20fe029977?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NjB8fGphcGFuJTIwZm9vZHxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=700&q=60",
                    price = 1500,
                ),
            )
        ),
        MenuResource(
            menuList = listOf(
                CuisineResource(
                    id = 50,
                    name = "Shoyu ramen",
                    description = R.string.lorem_description,
                    cuisineType = listOf(CuisineType.Japanese),
                    imageUrl = "https://images.unsplash.com/photo-1625420044033-256d145f1648?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MzF8fFJhbWVufGVufDB8fDB8fHww&auto=format&fit=crop&w=800&q=60",
                    price = 1000,
                ),
                CuisineResource(
                    id = 51,
                    name = "Shio ramen",
                    description = R.string.lorem_description,
                    cuisineType = listOf(CuisineType.Japanese),
                    imageUrl = "https://images.unsplash.com/photo-1568096889942-6eedde686635?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTl8fGphcGFuJTIwcmFtZW58ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=700&q=60",
                    price = 1000,
                ),
                CuisineResource(
                    id = 52,
                    name = "Donkotsu ramen",
                    description = R.string.lorem_description,
                    cuisineType = listOf(CuisineType.Japanese),
                    imageUrl = "https://images.unsplash.com/photo-1680593180878-e0cd1e99486e?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MXx8amFwYW4lMjByYW1lbnxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=700&q=60",
                    price = 1200,
                ),
                CuisineResource(
                    id = 53,
                    name = "Miso ramen",
                    description = R.string.lorem_description,
                    cuisineType = listOf(CuisineType.Japanese),
                    imageUrl = "https://images.unsplash.com/photo-1614563637806-1d0e645e0940?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MzF8fGphcGFuJTIwcmFtZW58ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=700&q=60",
                    price = 1000,
                ),
                CuisineResource(
                    id = 54,
                    name = "Tantanmen",
                    description = R.string.lorem_description,
                    cuisineType = listOf(CuisineType.Japanese),
                    imageUrl = "https://images.unsplash.com/photo-1625189657893-f8fd7b45a901?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NDB8fGphcGFuJTIwcmFtZW58ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=700&q=60",
                    price = 1200,
                ),
            )
        ),
        MenuResource(
            menuList = listOf(
                CuisineResource(
                    id = 50,
                    name = "Teishoku",
                    description = R.string.lorem_description,
                    cuisineType = listOf(CuisineType.Japanese),
                    imageUrl = "https://images.unsplash.com/photo-1516684808441-d7ca9141e63c?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8amFwYW4lMjBtZWFsfGVufDB8fDB8fHww&auto=format&fit=crop&w=700&q=60",
                    price = 1200,
                ),
                CuisineResource(
                    id = 51,
                    name = "Sukiyaki",
                    description = R.string.lorem_description,
                    cuisineType = listOf(CuisineType.Japanese),
                    imageUrl = "https://plus.unsplash.com/premium_photo-1661412657617-d6eab13c563e?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8N3x8amFwYW4lMjBtZWFsfGVufDB8fDB8fHww&auto=format&fit=crop&w=700&q=60",
                    price = 2000,
                ),
                CuisineResource(
                    id = 52,
                    name = "Nabe",
                    description = R.string.lorem_description,
                    cuisineType = listOf(CuisineType.Japanese),
                    imageUrl = "https://images.unsplash.com/photo-1543975978-4fa3ae01cad5?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8M3x8amFwYW4lMjBtZWFsfGVufDB8fDB8fHww&auto=format&fit=crop&w=700&q=60",
                    price = 2000,
                ),
                CuisineResource(
                    id = 53,
                    name = "Soba Teishoku",
                    description = R.string.lorem_description,
                    cuisineType = listOf(CuisineType.Japanese),
                    imageUrl = "https://images.unsplash.com/photo-1627451844493-9aefcfef9909?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTB8fGphcGFuJTIwbWVhbHxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=700&q=60",
                    price = 1100,
                ),
                CuisineResource(
                    id = 54,
                    name = "Japan pot",
                    description = R.string.lorem_description,
                    cuisineType = listOf(CuisineType.Japanese),
                    imageUrl = "https://images.unsplash.com/photo-1672459601936-8e6a42116e1e?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NzF8fGphcGFuJTIwbWVhbHxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=700&q=60",
                    price = 2000,
                ),
            )
        ),
        MenuResource(
            menuList = listOf(
                CuisineResource(
                    id = 50,
                    name = "Salmon steak",
                    description = R.string.lorem_description,
                    cuisineType = listOf(CuisineType.Western),
                    imageUrl = "https://images.unsplash.com/photo-1519708227418-c8fd9a32b7a2?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8TWVhbHxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=700&q=60",
                    price = 2500,
                ),
                CuisineResource(
                    id = 51,
                    name = "Grilled chicken",
                    description = R.string.lorem_description,
                    cuisineType = listOf(CuisineType.Western),
                    imageUrl = "https://images.unsplash.com/photo-1564436872-f6d81182df12?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NXx8TWVhbHxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=700&q=60",
                    price = 3000,
                ),
                CuisineResource(
                    id = 52,
                    name = "Salmon curry",
                    description = R.string.lorem_description,
                    cuisineType = listOf(CuisineType.Western),
                    imageUrl = "https://images.unsplash.com/photo-1574484284002-952d92456975?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTB8fE1lYWx8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=700&q=60",
                    price = 2480,
                ),
                CuisineResource(
                    id = 53,
                    name = "Salad bowl",
                    description = R.string.lorem_description,
                    cuisineType = listOf(CuisineType.Western),
                    imageUrl = "https://images.unsplash.com/photo-1592417817098-8fd3d9eb14a5?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTJ8fE1lYWx8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=700&q=60",
                    price = 1080,
                ),
                CuisineResource(
                    id = 54,
                    name = "Chiken plate",
                    description = R.string.lorem_description,
                    cuisineType = listOf(CuisineType.Western),
                    imageUrl = "https://images.unsplash.com/photo-1572424117831-005b5e9b3ae4?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTF8fE1lYWx8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=700&q=60",
                    price = 1500,
                ),
            )
        ),
        MenuResource(
            menuList = listOf(
                CuisineResource(
                    id = 50,
                    name = "Chicken Alfredo",
                    description = R.string.lorem_description,
                    cuisineType = listOf(CuisineType.Western),
                    imageUrl = "https://images.unsplash.com/photo-1611599537845-1c7aca0091c0?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MjB8fE1lYWx8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=700&q=60",
                    price = 3500,
                ),
                CuisineResource(
                    id = 51,
                    name = "Fish and chips",
                    description = R.string.lorem_description,
                    cuisineType = listOf(CuisineType.Western),
                    imageUrl = "https://images.unsplash.com/photo-1485962398705-ef6a13c41e8f?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8OXx8RmlzaCUyMGFuZCUyMGNoaXBzJTIwcGxhdGV8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=700&q=60",
                    price = 3000,
                ),
                CuisineResource(
                    id = 52,
                    name = "Roast chicken",
                    description = R.string.lorem_description,
                    cuisineType = listOf(CuisineType.Western),
                    imageUrl = "https://images.unsplash.com/photo-1606258868842-79eb9eff76af?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MjZ8fE1lYWx8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=700&q=60",
                    price = 2000,
                ),
                CuisineResource(
                    id = 53,
                    name = "BBQ ribs",
                    description = R.string.lorem_description,
                    cuisineType = listOf(CuisineType.Western),
                    imageUrl = "https://images.unsplash.com/photo-1560024818-2c6d122cfbe2?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8OXx8QkJRJTIwcmlic3xlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=700&q=60",
                    price = 5000,
                ),
                CuisineResource(
                    id = 54,
                    name = "Caesar wrap",
                    description = R.string.lorem_description,
                    cuisineType = listOf(CuisineType.Western),
                    imageUrl = "https://images.unsplash.com/photo-1587116861219-230ac19df971?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MjR8fE1lYWx8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=700&q=60",
                    price = 2700,
                ),
            )
        ),
        MenuResource(
            menuList = listOf(
                CuisineResource(
                    id = 50,
                    name = "Corn plate",
                    description = R.string.lorem_description,
                    cuisineType = listOf(CuisineType.Western),
                    imageUrl = "https://plus.unsplash.com/premium_photo-1679746244431-70f2ba1087e1?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8N3x8RmlzaCUyMGFuZCUyMGNoaXBzJTIwcGxhdGV8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=800&q=60",
                    price = 1200,
                ),
                CuisineResource(
                    id = 51,
                    name = "little bowl",
                    description = R.string.lorem_description,
                    cuisineType = listOf(CuisineType.Western),
                    imageUrl = "https://images.unsplash.com/photo-1484980972926-edee96e0960d?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8bWVhbCUyMHBsYXRlfGVufDB8fDB8fHww&auto=format&fit=crop&w=800&q=60",
                    price = 2000,
                ),
                CuisineResource(
                    id = 52,
                    name = "Tomato pizza",
                    description = R.string.lorem_description,
                    cuisineType = listOf(CuisineType.Western),
                    imageUrl = "https://images.unsplash.com/photo-1518133683791-0b9de5a055f0?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTJ8fG1lYWwlMjBwbGF0ZXxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=800&q=60",
                    price = 1500,
                ),
                CuisineResource(
                    id = 53,
                    name = "taco",
                    description = R.string.lorem_description,
                    cuisineType = listOf(CuisineType.Western),
                    imageUrl = "https://images.unsplash.com/photo-1514843319620-4f042827c481?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1470&q=80",
                    price = 1700,
                ),
                CuisineResource(
                    id = 54,
                    name = "Munich",
                    description = R.string.lorem_description,
                    cuisineType = listOf(CuisineType.Western),
                    imageUrl = "https://images.unsplash.com/photo-1517244683847-7456b63c5969?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8OHx8bWVhbCUyMHBsYXRlfGVufDB8fDB8fHww&auto=format&fit=crop&w=800&q=60",
                    price = 2000,
                ),
            )
        ),
        MenuResource(
            menuList = listOf(
                CuisineResource(
                    id = 55,
                    name = "chicken",
                    description = R.string.lorem_description,
                    cuisineType = listOf(CuisineType.Korean),
                    imageUrl = "https://plus.unsplash.com/premium_photo-1675864532835-6e47099cca6f?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MXx8S29yZWFuJTIwY3Vpc2luZXxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=800&q=60",
                    price = 3000,
                ),
                CuisineResource(
                    id = 56,
                    name = "Korean bbq",
                    description = R.string.lorem_description,
                    cuisineType = listOf(CuisineType.Korean),
                    imageUrl = "https://images.unsplash.com/photo-1677029969065-c9f4003a9ad5?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NHx8S29yZWFuJTIwY3Vpc2luZXxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=800&q=60",
                    price = 3200,
                ),
                CuisineResource(
                    id = 57,
                    name = "Korean noodle",
                    description = R.string.lorem_description,
                    cuisineType = listOf(CuisineType.Korean),
                    imageUrl = "https://images.unsplash.com/photo-1583032015879-e5022cb87c3b?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8S29yZWFuJTIwY3Vpc2luZXxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=800&q=60",
                    price = 2400,
                ),
                CuisineResource(
                    id = 58,
                    name = "Bulgogi",
                    description = R.string.lorem_description,
                    cuisineType = listOf(CuisineType.Korean),
                    imageUrl = "https://images.unsplash.com/photo-1564836235910-c3055ca0f912?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTF8fEtvcmVhbiUyMGN1aXNpbmV8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=800&q=60",
                    price = 0,
                ),
                CuisineResource(
                    id = 59,
                    name = "Bibimbap",
                    description = R.string.lorem_description,
                    cuisineType = listOf(CuisineType.Korean),
                    imageUrl = "https://images.unsplash.com/photo-1498654896293-37aacf113fd9?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MzF8fEtvcmVhbiUyMGN1aXNpbmV8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=800&q=60",
                    price = 0,
                ),
            )
        ),
        MenuResource(
            menuList = listOf(
                CuisineResource(
                    id = 60,
                    name = "Spicy soup",
                    description = R.string.lorem_description,
                    cuisineType = listOf(CuisineType.Korean),
                    imageUrl = "https://images.unsplash.com/photo-1534939561126-855b8675edd7?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NXx8S29yZWElMjBzb3VwfGVufDB8fDB8fHww&auto=format&fit=crop&w=800&q=60",
                    price = 1600,
                ),
                CuisineResource(
                    id = 61,
                    name = "Fish soup",
                    description = R.string.lorem_description,
                    cuisineType = listOf(CuisineType.Korean),
                    imageUrl = "https://images.unsplash.com/photo-1511910849309-0dffb8785146?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8OHx8S29yZWElMjBzb3VwfGVufDB8fDB8fHww&auto=format&fit=crop&w=800&q=60",
                    price = 2000,
                ),
                CuisineResource(
                    id = 62,
                    name = "Sujebi",
                    description = R.string.lorem_description,
                    cuisineType = listOf(CuisineType.Korean),
                    imageUrl = "https://images.unsplash.com/photo-1540138411301-84af810a9a44?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8N3x8S29yZWElMjBzb3VwfGVufDB8fDB8fHww&auto=format&fit=crop&w=800&q=60",
                    price = 1300,
                ),
                CuisineResource(
                    id = 63,
                    name = "Spicy seaFoodResource soup",
                    description = R.string.lorem_description,
                    cuisineType = listOf(CuisineType.Korean),
                    imageUrl = "https://images.unsplash.com/photo-1651397573566-7399c9a43efa?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTF8fEtvcmVhJTIwc291cHxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=800&q=60",
                    price = 2500,
                ),
                CuisineResource(
                    id = 64,
                    name = "meat bowl",
                    description = R.string.lorem_description,
                    cuisineType = listOf(CuisineType.Korean),
                    imageUrl = "https://images.unsplash.com/photo-1618351708186-5ba8a9da1933?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8OHx8a2ltY2hpfGVufDB8fDB8fHww&auto=format&fit=crop&w=800&q=60",
                    price = 1700,
                ),
            )
        ),
        MenuResource(
            menuList = listOf(
                CuisineResource(
                    id = 65,
                    name = "Fork pot",
                    description = R.string.lorem_description,
                    cuisineType = listOf(CuisineType.Chinese),
                    imageUrl = "https://images.unsplash.com/photo-1603093324608-fa64519a3519?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NXx8Y2hpbmVzZSUyMGN1aXNpbmV8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=800&q=60",
                    price = 800,
                ),
                CuisineResource(
                    id = 66,
                    name = "Chinese set",
                    description = R.string.lorem_description,
                    cuisineType = listOf(CuisineType.Chinese),
                    imageUrl = "https://images.unsplash.com/photo-1624174838145-c052490eb1d8?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Nnx8Y2hpbmVzZSUyMGN1aXNpbmV8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=800&q=60",
                    price = 1300,
                ),
                CuisineResource(
                    id = 67,
                    name = "meat ball",
                    description = R.string.lorem_description,
                    cuisineType = listOf(CuisineType.Chinese),
                    imageUrl = "https://images.unsplash.com/photo-1572141619956-3af324e62ddc?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTB8fGNoaW5lc2UlMjBjdWlzaW5lfGVufDB8fDB8fHww&auto=format&fit=crop&w=800&q=60",
                    price = 900,
                ),
                CuisineResource(
                    id = 68,
                    name = "Chinese tea",
                    description = R.string.lorem_description,
                    cuisineType = listOf(CuisineType.Chinese),
                    imageUrl = "https://images.unsplash.com/photo-1577016029703-cc22a7c0c28c?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTZ8fGNoaW5lc2UlMjBjdWlzaW5lfGVufDB8fDB8fHww&auto=format&fit=crop&w=800&q=60",
                    price = 500,
                ),
                CuisineResource(
                    id = 69,
                    name = "Chinese noodle",
                    description = R.string.lorem_description,
                    cuisineType = listOf(CuisineType.Chinese),
                    imageUrl = "https://images.unsplash.com/photo-1570368336224-455084c1fb31?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MjN8fGNoaW5lc2UlMjBjdWlzaW5lfGVufDB8fDB8fHww&auto=format&fit=crop&w=800&q=60",
                    price = 1200,
                ),
            )
        ),
        MenuResource(
            menuList = listOf(
                CuisineResource(
                    id = 70,
                    name = "Stuffed",
                    description = R.string.lorem_description,
                    cuisineType = listOf(CuisineType.Chinese),
                    imageUrl = "https://plus.unsplash.com/premium_photo-1674601031561-4e042aa3242e?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTl8fGNoaW5lc2UlMjBjdWlzaW5lfGVufDB8fDB8fHww&auto=format&fit=crop&w=800&q=60",
                    price = 1300,
                ),
                CuisineResource(
                    id = 71,
                    name = "Meat",
                    description = R.string.lorem_description,
                    cuisineType = listOf(CuisineType.Chinese),
                    imageUrl = "https://images.unsplash.com/photo-1550367363-ea12860cc124?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MjJ8fGNoaW5lc2UlMjBjdWlzaW5lfGVufDB8fDB8fHww&auto=format&fit=crop&w=800&q=60",
                    price = 1200,
                ),
                CuisineResource(
                    id = 72,
                    name = "Dumpling",
                    description = R.string.lorem_description,
                    cuisineType = listOf(CuisineType.Chinese),
                    imageUrl = "https://plus.unsplash.com/premium_photo-1674601033631-79eeffaac6f9?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MjV8fGNoaW5lc2UlMjBjdWlzaW5lfGVufDB8fDB8fHww&auto=format&fit=crop&w=800&q=60",
                    price = 1500,
                ),
                CuisineResource(
                    id = 73,
                    name = "Arroze",
                    description = R.string.lorem_description,
                    cuisineType = listOf(CuisineType.Chinese),
                    imageUrl = "https://images.unsplash.com/photo-1600676626316-4d44818a4ffe?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MzV8fGNoaW5lc2UlMjBjdWlzaW5lfGVufDB8fDB8fHww&auto=format&fit=crop&w=800&q=60",
                    price = 3500,
                ),
                CuisineResource(
                    id = 74,
                    name = "Fish set",
                    description = R.string.lorem_description,
                    cuisineType = listOf(CuisineType.Chinese),
                    imageUrl = "https://images.unsplash.com/photo-1597490101653-8db754021a89?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NTl8fGNoaW5lc2UlMjBjdWlzaW5lfGVufDB8fDB8fHww&auto=format&fit=crop&w=800&q=60",
                    price = 4000,
                ),
            )
        ),
        MenuResource(
            menuList = listOf(
                CuisineResource(
                    id = 75,
                    name = "Coffee & cake set",
                    description = R.string.lorem_description,
                    cuisineType = listOf(CuisineType.Dessert),
                    imageUrl = "https://images.unsplash.com/photo-1613187984497-483b0d1df052?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8Y29mZmVlJTIwYW5kJTIwZGVzc2VydHxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=800&q=60",
                    price = 1200,
                ),
                CuisineResource(
                    id = 76,
                    name = "Strawberry cake",
                    description = R.string.lorem_description,
                    cuisineType = listOf(CuisineType.Dessert),
                    imageUrl = "https://images.unsplash.com/photo-1525203135335-74d272fc8d9c?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NHx8Y29mZmVlJTIwYW5kJTIwZGVzc2VydHxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=800&q=60",
                    price = 800,
                ),
                CuisineResource(
                    id = 77,
                    name = "Chocolate coffee",
                    description = R.string.lorem_description,
                    cuisineType = listOf(CuisineType.Dessert),
                    imageUrl = "https://images.unsplash.com/photo-1481391032119-d89fee407e44?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Nnx8Y29mZmVlJTIwYW5kJTIwZGVzc2VydHxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=800&q=60",
                    price = 700,
                ),
                CuisineResource(
                    id = 78,
                    name = "Costa",
                    description = R.string.lorem_description,
                    cuisineType = listOf(CuisineType.Dessert),
                    imageUrl = "https://images.unsplash.com/photo-1496767849887-3d30e6d3e860?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTd8fGNvZmZlZSUyMGFuZCUyMGRlc3NlcnR8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=800&q=60",
                    price = 1200,
                ),
                CuisineResource(
                    id = 79,
                    name = "Cinamon",
                    description = R.string.lorem_description,
                    cuisineType = listOf(CuisineType.Dessert),
                    imageUrl = "https://plus.unsplash.com/premium_photo-1673282160288-9d5381f471af?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTN8fGNvZmZlZSUyMGFuZCUyMGRlc3NlcnR8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=800&q=60",
                    price = 800,
                ),
            )
        ),
        MenuResource(
            menuList = listOf(
                CuisineResource(
                    id = 80,
                    name = "Geneva",
                    description = R.string.lorem_description,
                    cuisineType = listOf(CuisineType.Dessert),
                    imageUrl = "https://images.unsplash.com/photo-1542326237-94b1c5a538d4?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTZ8fGNvZmZlZSUyMGFuZCUyMGRlc3NlcnR8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=800&q=60",
                    price = 600,
                ),
                CuisineResource(
                    id = 81,
                    name = "Bled",
                    description = R.string.lorem_description,
                    cuisineType = listOf(CuisineType.Dessert),
                    imageUrl = "https://images.unsplash.com/photo-1447195047884-0f014b0d9288?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MjF8fGNvZmZlZSUyMGFuZCUyMGRlc3NlcnR8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=800&q=60",
                    price = 710,
                ),
                CuisineResource(
                    id = 82,
                    name = "Banana yogurt",
                    description = R.string.lorem_description,
                    cuisineType = listOf(CuisineType.Dessert),
                    imageUrl = "https://images.unsplash.com/photo-1587545012292-36051928379b?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MzN8fGNvZmZlZSUyMGFuZCUyMGRlc3NlcnR8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=800&q=60",
                    price = 650,
                ),
                CuisineResource(
                    id = 83,
                    name = "Coffee cake",
                    description = R.string.lorem_description,
                    cuisineType = listOf(CuisineType.Dessert),
                    imageUrl = "https://images.unsplash.com/photo-1650147880857-95b822f65ff9?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NDF8fGNvZmZlZSUyMGFuZCUyMGRlc3NlcnR8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=800&q=60",
                    price = 780,
                ),
                CuisineResource(
                    id = 84,
                    name = "Cka",
                    description = R.string.lorem_description,
                    cuisineType = listOf(CuisineType.Dessert),
                    imageUrl = "https://images.unsplash.com/photo-1615200961449-0d6d5a818f8e?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NDJ8fGNvZmZlZSUyMGFuZCUyMGRlc3NlcnR8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=800&q=60",
                    price = 780,
                ),
            )
        ),
        MenuResource(
            menuList = listOf(
                CuisineResource(
                    id = 85,
                    name = "Stockholem",
                    description = R.string.lorem_description,
                    cuisineType = listOf(CuisineType.Dessert),
                    imageUrl = "https://images.unsplash.com/photo-1582486983320-12feb082b528?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NDV8fGNvZmZlZSUyMGFuZCUyMGRlc3NlcnR8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=800&q=60",
                    price = 800,
                ),
                CuisineResource(
                    id = 86,
                    name = "Green smoothie",
                    description = R.string.lorem_description,
                    cuisineType = listOf(CuisineType.Dessert),
                    imageUrl = "https://plus.unsplash.com/premium_photo-1674162581295-a8ae04c01a3e?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NDl8fGNvZmZlZSUyMGFuZCUyMGRlc3NlcnR8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=800&q=60",
                    price = 700,
                ),
                CuisineResource(
                    id = 87,
                    name = "Pender island",
                    description = R.string.lorem_description,
                    cuisineType = listOf(CuisineType.Dessert),
                    imageUrl = "https://images.unsplash.com/photo-1640126326895-5de9670a1517?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NDR8fGNvZmZlZSUyMGFuZCUyMGRlc3NlcnR8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=800&q=60",
                    price = 1000,
                ),
                CuisineResource(
                    id = 88,
                    name = "Butter cream",
                    description = R.string.lorem_description,
                    cuisineType = listOf(CuisineType.Dessert),
                    imageUrl = "https://images.unsplash.com/photo-1572897305554-9b38c937edba?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NjB8fGNvZmZlZSUyMGFuZCUyMGRlc3NlcnR8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=800&q=60",
                    price = 800,
                ),
                CuisineResource(
                    id = 89,
                    name = "Pudding",
                    description = R.string.lorem_description,
                    cuisineType = listOf(CuisineType.Dessert),
                    imageUrl = "https://images.unsplash.com/photo-1542124948-dc391252a940?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NjV8fGNvZmZlZSUyMGFuZCUyMGRlc3NlcnR8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=800&q=60",
                    price = 500,
                ),
            )
        ),
    )
}