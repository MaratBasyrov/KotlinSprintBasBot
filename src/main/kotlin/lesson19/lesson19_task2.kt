package lesson19


fun main() {
    val order = Product("Штаны", 566543, Category.CLOTHES)
    order.infoProduct()
    categoryValue(order)
}

fun categoryValue(g: Product) {
    when (g.category) {
        Category.CLOTHES -> print("Одежда")
        Category.OFFICE_SUPPLIES -> print("Концелярские принадлежности")
        Category.DIFFERENT -> print("Разное")
        else -> print("новая категория")
    }
}

enum class Category {
    CLOTHES,
    OFFICE_SUPPLIES,
    DIFFERENT,
}

class Product(
    val name: String,
    val id: Int,
    val category: Category,
) {
    fun infoProduct() {
        print("$name ID$id категория: ")
    }
}