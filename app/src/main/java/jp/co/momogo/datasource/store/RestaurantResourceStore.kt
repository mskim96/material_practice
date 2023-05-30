package jp.co.momogo.datasource.store

import jp.co.momogo.R
import jp.co.momogo.datasource.model.RestaurantResource
import jp.co.momogo.model.CuisineType
import javax.inject.Inject

/**
 * [RestaurantResourceStore] for fake restaurant resource data.
 */
class RestaurantResourceStore @Inject constructor(
    menuResourceStore: MenuResourceStore,
    reviewResourceStore: ReviewResourceStore
) {
    val restaurants = listOf(
        RestaurantResource(
            id = 0,
            name = "Yasuda",
            description = R.string.lorem_description,
            location = "5-24-2 Sendagaya, Shibuya-ku, Tokyo, Shinjuku Takashimaya 14F",
            distance = 2.5,
            category = listOf(CuisineType.Japanese, CuisineType.SeaFood),
            rating = 5.0,
            restaurantImages = listOf(
                "https://images.unsplash.com/photo-1608060146923-7b8ab13e22bb?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8OXx8amFwYW4lMjByZXN0YXVyYW50fGVufDB8fDB8fHww&auto=format&fit=crop&w=700&q=60",
                "https://images.unsplash.com/photo-1476055439777-977cdf3a5699?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8M3x8amFwYW4lMjByZXN0YXVyYW50fGVufDB8fDB8fHww&auto=format&fit=crop&w=700&q=60",
                "https://images.unsplash.com/photo-1621871908119-295c8ce5cee4?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Nnx8amFwYW4lMjByZXN0YXVyYW50fGVufDB8fDB8fHww&auto=format&fit=crop&w=700&q=60",
                "https://images.unsplash.com/photo-1617870314635-fc819547ec11?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTF8fGphcGFuJTIwcmVzdGF1cmFudHxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=700&q=60"
            ),
            menus = menuResourceStore.menus[0],
            review = listOf(
                reviewResourceStore.reviews[0],
                reviewResourceStore.reviews[1],
                reviewResourceStore.reviews[2],
            )
        ),

        RestaurantResource(
            id = 1,
            name = "Tenko",
            description = R.string.lorem_description,
            location = "3-15-4 Shibuya, Shibuya-ku, Tokyo",
            distance = 3.1,
            category = listOf(CuisineType.Japanese, CuisineType.SeaFood, CuisineType.Meat),
            rating = 3.5,
            restaurantImages = listOf(
                "https://images.unsplash.com/photo-1534247555660-d4af46712d27?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTR8fGphcGFuJTIwcmVzdGF1cmFudHxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=700&q=60",
                "https://images.unsplash.com/photo-1513021115044-2a2843b05665?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTd8fGphcGFuJTIwcmVzdGF1cmFudHxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=700&q=60",
                "https://images.unsplash.com/photo-1571866735550-7b1ae3bdb144?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTZ8fGphcGFuJTIwcmVzdGF1cmFudHxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=700&q=60",
                "https://images.unsplash.com/photo-1576863514292-542ef379c13b?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MjF8fGphcGFuJTIwcmVzdGF1cmFudHxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=700&q=60"
            ),
            menus = menuResourceStore.menus[1],
            review = listOf()
        ),

        RestaurantResource(
            id = 2,
            name = "Yabu",
            description = R.string.lorem_description,
            location = "3-10 Udagawacho, Shibuya-ku, Tokyo, Shibuya Football Tower B1F",
            distance = 1.1,
            category = listOf(CuisineType.Japanese, CuisineType.Noodle),
            rating = 5.0,
            restaurantImages = listOf(
                "https://images.unsplash.com/photo-1504416285472-eccf03dd31eb?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mjl8fGphcGFuJTIwcmVzdGF1cmFudHxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=700&q=60",
                "https://images.unsplash.com/photo-1614640522775-71bebddd21f9?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MzB8fGphcGFuJTIwcmVzdGF1cmFudHxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=700&q=60",
                "https://images.unsplash.com/photo-1616394774736-6e47809d8d23?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MzR8fGphcGFuJTIwcmVzdGF1cmFudHxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=700&q=60",
                "https://images.unsplash.com/photo-1492998680170-81f8863d8d2d?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MzV8fGphcGFuJTIwcmVzdGF1cmFudHxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=700&q=60",
            ),
            menus = menuResourceStore.menus[2],
            review = listOf(
                reviewResourceStore.reviews[4],
                reviewResourceStore.reviews[3],
                reviewResourceStore.reviews[1],
            )
        ),

        RestaurantResource(
            id = 3,
            name = "Maisen",
            description = R.string.lorem_description,
            location = "3-9-10 Shibuya, Shibuya-ku, Tokyo, KDC Building B1F",
            distance = 0.6,
            category = listOf(
                CuisineType.Japanese,
                CuisineType.Meat,
                CuisineType.Noodle,
                CuisineType.SeaFood
            ),
            rating = 5.0,
            restaurantImages = listOf(
                "https://images.unsplash.com/photo-1501560379-05951a742668?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NDF8fGphcGFuJTIwcmVzdGF1cmFudHxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=700&q=60",
                "https://images.unsplash.com/photo-1603497953639-2e798e2f9177?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MzJ8fGphcGFuJTIwcmVzdGF1cmFudHxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=700&q=60",
                "https://images.unsplash.com/photo-1536399085891-73eded2f9ef7?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MzZ8fGphcGFuJTIwcmVzdGF1cmFudHxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=700&q=60",
                "https://images.unsplash.com/photo-1533540499377-cf2dec26c3d7?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NDR8fGphcGFuJTIwcmVzdGF1cmFudHxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=700&q=60"
            ),
            menus = menuResourceStore.menus[3],
            review = listOf(
                reviewResourceStore.reviews[0],
                reviewResourceStore.reviews[1],
            )
        ),

        RestaurantResource(
            id = 4,
            name = "La Trattoria",
            description = R.string.lorem_description,
            location = "4-26-11 Sendagaya, Shibuya-ku, Tokyo, Yoyogi TH&C Building 2F",
            distance = 5.1,
            category = listOf(CuisineType.Western, CuisineType.Meat, CuisineType.SeaFood),
            rating = 5.0,
            restaurantImages = listOf(
                "https://images.unsplash.com/photo-1555396273-367ea4eb4db5?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NXx8cmVzdGF1cmFudHxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=700&q=60",
                "https://images.unsplash.com/photo-1414235077428-338989a2e8c0?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8M3x8cmVzdGF1cmFudHxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=700&q=60",
                "https://images.unsplash.com/photo-1537047902294-62a40c20a6ae?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NHx8cmVzdGF1cmFudHxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=700&q=60",
                "https://images.unsplash.com/photo-1551218808-94e220e084d2?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Nnx8cmVzdGF1cmFudHxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=700&q=60"
            ),
            menus = menuResourceStore.menus[4],
            review = listOf(
                reviewResourceStore.reviews[4],
                reviewResourceStore.reviews[2],
            )
        ),

        RestaurantResource(
            id = 5,
            name = "The Blue Plate",
            description = R.string.lorem_description,
            location = "3-15-13 Minami-Aoyama, Minato-ku, Tokyo, Aoyama Green Hills 1F",
            distance = 3.2,
            category = listOf(CuisineType.Western, CuisineType.Meat, CuisineType.SeaFood),
            rating = 5.0,
            restaurantImages = listOf(
                "https://images.unsplash.com/photo-1578474846511-04ba529f0b88?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTB8fHJlc3RhdXJhbnR8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=700&q=60",
                "https://images.unsplash.com/photo-1559329007-40df8a9345d8?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTJ8fHJlc3RhdXJhbnR8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=700&q=60",
                "https://images.unsplash.com/photo-1590846406792-0adc7f938f1d?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8OXx8cmVzdGF1cmFudHxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=700&q=60",
                "https://images.unsplash.com/photo-1550966871-3ed3cdb5ed0c?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTR8fHJlc3RhdXJhbnR8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=700&q=60"
            ),
            menus = menuResourceStore.menus[5],
            review = listOf()
        ),

        RestaurantResource(
            id = 6,
            name = "El Tapeo",
            description = R.string.lorem_description,
            location = "3-2 Kagurazaka, Shinjuku-ku, Tokyo, Kagurazaka Echigoya Building 4F",
            distance = 3.7,
            category = listOf(CuisineType.Western, CuisineType.Meat),
            rating = 5.0,
            restaurantImages = listOf(
                "https://images.unsplash.com/photo-1533777857889-4be7c70b33f7?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTZ8fHJlc3RhdXJhbnR8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=700&q=60",
                "https://images.unsplash.com/photo-1514933651103-005eec06c04b?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTh8fHJlc3RhdXJhbnR8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=700&q=60",
                "https://images.unsplash.com/photo-1502301103665-0b95cc738daf?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MjB8fHJlc3RhdXJhbnR8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=700&q=60",
                "https://images.unsplash.com/photo-1551632436-cbf8dd35adfa?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MjF8fHJlc3RhdXJhbnR8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=700&q=60"
            ),
            menus = menuResourceStore.menus[6],
            review = listOf(
                reviewResourceStore.reviews[3],
                reviewResourceStore.reviews[2],
            )
        ),

        RestaurantResource(
            id = 7,
            name = "Bulgogi House",
            description = R.string.lorem_description,
            location = "4-2-11 Tsukiji, Chuo-ku, Tokyo, Shimbashi Enbujo Annex 1F",
            category = listOf(CuisineType.Korean, CuisineType.Meat, CuisineType.Noodle),
            rating = 5.0,
            distance = 5.5,
            restaurantImages = listOf(
                "https://images.unsplash.com/photo-1661177866127-6b0c0d9e42e9?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTJ8fGtvcmVhJTIwcmVzdGF1cmFudHxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=700&q=60",
                "https://images.unsplash.com/photo-1603852451899-912e60faf48a?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTd8fGtvcmVhJTIwcmVzdGF1cmFudHxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=700&q=60",
                "https://images.unsplash.com/photo-1682943938580-350de0676406?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MjJ8fGtvcmVhJTIwcmVzdGF1cmFudHxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=700&q=60",
                "https://images.unsplash.com/photo-1651375562166-c3ec0b25c16c?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTl8fGtvcmVhJTIwcmVzdGF1cmFudHxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=700&q=60"
            ),
            menus = menuResourceStore.menus[7],
            review = listOf()
        ),

        RestaurantResource(
            id = 8,
            name = "Jjigae Village",
            description = R.string.lorem_description,
            location = "3-2-11 Minami-Shinohara-cho, Edogawa-ku, Tokyo",
            distance = 1.1,
            category = listOf(CuisineType.Korean, CuisineType.Noodle, CuisineType.Meat),
            rating = 5.0,
            restaurantImages = listOf(
                "https://images.unsplash.com/photo-1549221428-495f00892696?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NDR8fGtvcmVhJTIwcmVzdGF1cmFudHxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=700&q=60",
                "https://images.unsplash.com/photo-1671975412006-f0c68d9c7006?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mzh8fGtvcmVhJTIwcmVzdGF1cmFudHxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=700&q=60",
                "https://images.unsplash.com/photo-1644744359470-8b0636a2e5ae?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MzB8fGtvcmVhJTIwcmVzdGF1cmFudHxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=700&q=60",
                "https://images.unsplash.com/photo-1544504672-9a21c5246785?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MzR8fGtvcmVhJTIwcmVzdGF1cmFudHxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=700&q=60",
            ),
            menus = menuResourceStore.menus[8],
            review = listOf(
                reviewResourceStore.reviews[0],
                reviewResourceStore.reviews[3],
            )
        ),

        RestaurantResource(
            id = 9,
            name = "Oriental Garden",
            description = R.string.lorem_description,
            location = "2-23-13 Dogenzaka, Shibuya-ku, Tokyo, Shibuya Delita Tower 5F",
            distance = 2.1,
            category = listOf(
                CuisineType.Chinese,
                CuisineType.Noodle,
                CuisineType.SeaFood,
                CuisineType.Meat
            ),
            rating = 5.0,
            restaurantImages = listOf(
                "https://images.unsplash.com/photo-1562583277-1cadb00e98ec?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8Y2hpbmElMjByZXN0YXVyYW50fGVufDB8fDB8fHww&auto=format&fit=crop&w=700&q=60",
                "https://images.unsplash.com/photo-1507211222203-4d522e372607?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8M3x8Y2hpbmElMjByZXN0YXVyYW50fGVufDB8fDB8fHww&auto=format&fit=crop&w=700&q=60",
                "https://images.unsplash.com/photo-1563245372-f21724e3856d?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTB8fGNoaW5hJTIwcmVzdGF1cmFudHxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=700&q=60",
                "https://images.unsplash.com/photo-1611345157614-26d3bdd10c93?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTF8fGNoaW5hJTIwcmVzdGF1cmFudHxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=700&q=60"
            ),
            menus = menuResourceStore.menus[9],
            review = listOf()
        ),

        RestaurantResource(
            id = 10,
            name = "Red Lotus Chinese Cuisine",
            description = R.string.lorem_description,
            location = "4-6-16 Ginza, Chuo-ku, Tokyo, Ginza Mitsukoshi B2F",
            category = listOf(CuisineType.Chinese, CuisineType.Meat),
            distance = 3.2,
            rating = 5.0,
            restaurantImages = listOf(
                "https://images.unsplash.com/photo-1530569112985-108dc2578ec2?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTJ8fGNoaW5hJTIwcmVzdGF1cmFudHxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=700&q=60",
                "https://images.unsplash.com/photo-1604923554882-252a242da1d0?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTV8fGNoaW5hJTIwcmVzdGF1cmFudHxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=700&q=60",
                "https://images.unsplash.com/photo-1515051393741-e1589723ef8e?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MjJ8fGNoaW5hJTIwcmVzdGF1cmFudHxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=700&q=60",
                "https://images.unsplash.com/photo-1619626477638-8f06f5d99e6e?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MjF8fGNoaW5hJTIwcmVzdGF1cmFudHxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=700&q=60"
            ),
            menus = menuResourceStore.menus[10],
            review = listOf(
                reviewResourceStore.reviews[0],
                reviewResourceStore.reviews[4],
            )
        ),

        RestaurantResource(
            id = 11,
            name = "bucks",
            description = R.string.lorem_description,
            location = "Ebisu Garden Place, 1-8-1 Ebisu Nishi, Shibuya-ku, Tokyo",
            distance = 2.7,
            category = listOf(CuisineType.Dessert),
            rating = 5.0,
            restaurantImages = listOf(
                "https://images.unsplash.com/photo-1545418314-7ce0b9b53901?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NHx8Y2FmZmV8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=700&q=60",
                "https://images.unsplash.com/photo-1604184811623-129a299b1322?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8OXx8Y2FmZmV8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=700&q=60",
                "https://images.unsplash.com/photo-1535688391459-479d308104f8?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8N3x8Y2FmZmV8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=700&q=60",
                "https://images.unsplash.com/photo-1605472878388-32446ae9a869?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTR8fGNhZmZlfGVufDB8fDB8fHww&auto=format&fit=crop&w=700&q=60"
            ),
            menus = menuResourceStore.menus[11],
            review = listOf(
                reviewResourceStore.reviews[0],
                reviewResourceStore.reviews[1],
                reviewResourceStore.reviews[2],
                reviewResourceStore.reviews[3],
            )
        ),

        RestaurantResource(
            id = 12,
            name = "The Coffee Bean & Tea Leaf",
            description = R.string.lorem_description,
            location = "B2F Lumine Est Shinjuku, 6-5-1 Nishi-Shinjuku, Shinjuku-ku, Tokyo",
            distance = 1.3,
            category = listOf(CuisineType.Dessert),
            rating = 5.0,
            restaurantImages = listOf(
                "https://images.unsplash.com/photo-1572205821737-01dfdaf0b012?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTd8fGNhZmZlfGVufDB8fDB8fHww&auto=format&fit=crop&w=700&q=60",
                "https://images.unsplash.com/photo-1559673048-35a51341f8d0?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MjV8fGNhZmZlfGVufDB8fDB8fHww&auto=format&fit=crop&w=700&q=60",
                "https://images.unsplash.com/photo-1567309967324-77809fc82d2a?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MzJ8fGNhZmZlfGVufDB8fDB8fHww&auto=format&fit=crop&w=700&q=60",
                "https://images.unsplash.com/photo-1569966459694-faf2bf4af6c6?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mjh8fGNhZmZlfGVufDB8fDB8fHww&auto=format&fit=crop&w=700&q=60"
            ),
            menus = menuResourceStore.menus[12],
            review = listOf()
        ),

        RestaurantResource(
            id = 13,
            name = "Costa Coffee",
            description = R.string.lorem_description,
            location = "8F Shibuya Hikarie, 1-18-21 Jinnan, Shibuya-ku, Tokyo",
            distance = 0.3,
            category = listOf(CuisineType.Dessert),
            rating = 5.0,
            restaurantImages = listOf(
                "https://images.unsplash.com/photo-1559673049-3f337dbfd97a?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MzR8fGNhZmZlfGVufDB8fDB8fHww&auto=format&fit=crop&w=700&q=60",
                "https://images.unsplash.com/photo-1545341124-2cd4e3f548cc?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mzl8fGNhZmZlfGVufDB8fDB8fHww&auto=format&fit=crop&w=700&q=60",
                "https://images.unsplash.com/photo-1607447358430-3803cdb7af77?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MzV8fGNhZmZlfGVufDB8fDB8fHww&auto=format&fit=crop&w=700&q=60",
                "https://images.unsplash.com/photo-1567309967324-77809fc82d2a?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MzJ8fGNhZmZlfGVufDB8fDB8fHww&auto=format&fit=crop&w=700&q=60"
            ),
            menus = menuResourceStore.menus[13],
            review = listOf(
                reviewResourceStore.reviews[1],
                reviewResourceStore.reviews[2],
            )
        ),
    )
}