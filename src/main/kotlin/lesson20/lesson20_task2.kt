package lesson20

fun main() {
    var playerOne = Player("Игрок", 50)
    playerOne.toHeal()
    println(playerOne.health)
}

class Player(
    val name: String,
    var health: Int,
) {
    var healthMax: Int = 100;
    fun toHeal() {
        health = healthMax
    }
}