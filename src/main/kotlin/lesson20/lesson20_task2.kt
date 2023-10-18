package lesson20

fun main() {
    val playerOne = Player("Игрок", 50)
    playerOne.health = { playerOne.healthMax }()
    println(playerOne.health)
}

class Player(
    val name: String,
    var health: Int,
) {
    var healthMax: Int = 100
}