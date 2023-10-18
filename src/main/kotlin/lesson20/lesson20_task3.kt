package lesson20

fun main() {
    val playerOne = Player();
    { if (playerOne.keyDoor) println("Дверь открыта") }()
}

class Player() {
    val keyDoor: Boolean = true
}