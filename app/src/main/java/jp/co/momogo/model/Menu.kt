package jp.co.momogo.model

/**
 * Menu external model.
 */
data class Menu(
    val id: Int,
    val name: String,
    val description: String = "",
    val imageUrl: Image,
    val price: Int = 0,
)

val seaMenus = listOf(
    Menu(
        id = 0,
        name = "kaisen0",
        imageUrl = Image("https://images.unsplash.com/photo-1579398937948-598009379315?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Nnx8JUU1JTg4JUJBJUU4JUJBJUFCfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=800&q=60")
    ),
    Menu(
        id = 1,
        name = "kaisen1",
        imageUrl = Image("https://images.unsplash.com/photo-1635452273191-f08ce9934102?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTF8fCVFNSU4OCVCQSVFOCVCQSVBQnxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=800&q=60")
    ),
    Menu(
        id = 2,
        name = "kaisen2",
        imageUrl = Image("https://images.unsplash.com/photo-1501595091296-3aa970afb3ff?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1740&q=80")
    ),
    Menu(
        id = 3,
        name = "kaisen3",
        imageUrl = Image("https://images.unsplash.com/photo-1603894483438-97b51d226e70?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=870&q=80")
    ),
    Menu(
        id = 4,
        name = "kaisen4",
        imageUrl = Image("https://images.unsplash.com/photo-1565967531713-45739e0cad63?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1740&q=80")
    ),
    Menu(
        id = 5,
        name = "kaisen5",
        imageUrl = Image("https://images.unsplash.com/photo-1632823604727-2988c91e7966?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1740&q=80")
    ),
    Menu(
        id = 6,
        name = "kaisen6",
        imageUrl = Image("https://images.unsplash.com/photo-1578843526990-da0509d5ecc6?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=882&q=80")
    ),
    Menu(
        id = 7,
        name = "kaisen7",
        imageUrl = Image("https://images.unsplash.com/photo-1648146299553-fea4ac9f0dec?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1740&q=80")
    ),
    Menu(
        id = 8,
        name = "kaisen8",
        imageUrl = Image("https://images.unsplash.com/photo-1666599207724-920500fc26ca?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1740&q=80")
    )
)