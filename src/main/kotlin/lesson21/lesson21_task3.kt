package lesson21

fun main() {
    val playerOne = Player("Vasya", 99)
    println(playerOne.isHealthy())
}

fun Player.isHealthy(): Boolean {
    return this.health == this.healthMax
}

class Player(
    val name: String,
    var health: Int,
) {
    var healthMax: Int = 100
}