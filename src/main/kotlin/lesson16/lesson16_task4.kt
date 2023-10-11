package lesson16

fun main() {
    val orderOne = Order(456532, "сборка")
    orderOne.statusOrder()
    changeStatus(orderOne, "готов к выдаче")
    orderOne.statusOrder()
}

fun changeStatus(order: Order, newStatus: String) {
    order.status = newStatus
}

class Order(
    protected val number: Int,
    var status: String,
) {
    fun statusOrder() {
        println("Ваш заказ имеет статус: $status")
    }
}