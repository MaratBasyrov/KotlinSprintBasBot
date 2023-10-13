package lesson17

fun main() {
    val f = Ship()
    f.name = "Беда"
}

class Ship() {
    var name = "Победа"
        set(value) {
            field = value
            println("Переименовать корабль нельзя")
        }
    val speed = 12
    val port = "Новороссийск"
}