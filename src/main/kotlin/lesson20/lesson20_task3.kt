package lesson20

fun main() {
    val playerOne = Player();
}

class Player() {
    val keyDoor: Boolean = true
    init{ if (this.keyDoor) println("Дверь открыта") else println("Дверь закрыта") }
}