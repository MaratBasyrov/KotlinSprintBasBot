package lesson18

fun main() {
    val orderOne = Order("43553")
    orderOne.printItem("Телевизор")
    orderOne.printItem(listOf("Холодильник", "Утюг"))
}

class Order(
    val numberOrder: String,
    ) {

    fun printItem(item: String) {
        println("Заказан товар: $item")
    }

    fun printItem(item: List<String>) {
        println("Заказаны следующие товары: ${item.joinToString { it.toString() }}")
    }
}
