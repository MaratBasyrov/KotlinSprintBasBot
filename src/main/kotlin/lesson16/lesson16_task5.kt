package lesson16

fun main() {
    val playerOne = Player("Игрок1", 45u, 56u)
    playerOne.healing(45u)
    playerOne.damage(67u)
    playerOne.damage(100u)
    playerOne.healing(67u)

}

class Player(
    val name: String,
    protected var health: UInt,
    protected var power: UInt,

    ) {
    fun healing(medicine: UInt) {
        if (health == 0u) {
            println("лечение невозможно, перезапустите игру")
        } else {
            health += medicine
            println("$name подлечился. здоровье: $health")
        }
    }

    fun damage(hit: UInt) {
        if (health > hit) {
            health -= hit
            println("$name получил урон. здоровье: $health")
        } else death()

    }

    private fun death() {
        health = 0u
        power = 0u
        println("Game Over , урон не совместимый с жизнью (здоровье $health, мощь $power)")

    }
}