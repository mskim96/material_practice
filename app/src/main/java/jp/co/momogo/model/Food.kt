package jp.co.momogo.model

/**
 * Food data class.
 */
data class Food(
    val id: Int,
    val name: String,
    val imageUrl: String,
    val price: Int = 0,
)

val seaFoods = listOf(
    Food(
        id = 0,
        name = "kaisen0",
        imageUrl = "https://images.unsplash.com/photo-1579398937948-598009379315?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Nnx8JUU1JTg4JUJBJUU4JUJBJUFCfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=800&q=60"
    ),
    Food(
        id = 1,
        name = "kaisen1",
        imageUrl = "https://images.unsplash.com/photo-1635452273191-f08ce9934102?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTF8fCVFNSU4OCVCQSVFOCVCQSVBQnxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=800&q=60"
    ),
    Food(
        id = 2,
        name = "kaisen2",
        imageUrl = "https://images.unsplash.com/photo-1501595091296-3aa970afb3ff?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1740&q=80"
    ),
    Food(
        id = 3,
        name = "kaisen3",
        imageUrl = "https://images.unsplash.com/photo-1603894483438-97b51d226e70?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=870&q=80"
    ),
    Food(
        id = 4,
        name = "kaisen4",
        imageUrl = "https://images.unsplash.com/photo-1565967531713-45739e0cad63?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1740&q=80"
    ),
    Food(
        id = 5,
        name = "kaisen5",
        imageUrl = "https://images.unsplash.com/photo-1632823604727-2988c91e7966?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1740&q=80"
    ),
    Food(
        id = 6,
        name = "kaisen6",
        imageUrl = "https://images.unsplash.com/photo-1578843526990-da0509d5ecc6?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=882&q=80"
    ),
    Food(
        id = 7,
        name = "kaisen7",
        imageUrl = "https://images.unsplash.com/photo-1648146299553-fea4ac9f0dec?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1740&q=80"
    ),
    Food(
        id = 8,
        name = "kaisen8",
        imageUrl = "https://images.unsplash.com/photo-1666599207724-920500fc26ca?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1740&q=80"
    ),
    Food(
        id = 9,
        name = "kaisen9",
        imageUrl = "https://images.unsplash.com/photo-1677758779483-aba6b34e5dfd?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1740&q=80"
    ),
    Food(
        id = 10,
        name = "kaisen10",
        imageUrl = "https://images.unsplash.com/photo-1677073610542-a16f43ca8165?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=774&q=80"
    ),
    Food(
        id = 11,
        name = "kaisen11",
        imageUrl = "https://images.unsplash.com/photo-1648146299690-6ecece7e5c12?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=774&q=80"
    ),
    Food(
        id = 12,
        name = "kaisen12",
        imageUrl = "https://images.unsplash.com/photo-1678049379716-dcdf375eda2f?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1740&q=80"
    ),
    Food(
        id = 13,
        name = "kaisen13",
        imageUrl = "https://images.unsplash.com/photo-1512408097741-e28a5d0be02e?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1740&q=80"
    ),
    Food(
        id = 14,
        name = "kaisen14",
        imageUrl = "https://images.unsplash.com/photo-1566950616521-335084348663?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=774&q=80"
    ),
)