package lesson17

fun main() {
    val shipOne = Ship()
    shipOne.name = "Беда"
}

class Ship() {
    var name = "Победа"
        set(value) {
            println("Переименовать корабль нельзя")
        }
    val speed = 12
    val port = "Новороссийск"
}