package lesson15

fun main() {
    val seagullOne: Seagull = Seagull("Чайка", "крылья", false)
    val duckOne: Duck = Duck("Утка", "крылья", true)
    val crucianСarpOne: СrucianСarp = СrucianСarp("Карась", "плавники", true)
    seagullOne.movementFly()
    duckOne.movementFly()
    crucianСarpOne.movementFloat()

}

interface FlyingCreatures {
    fun movementFly()
}

interface FloatingCreatures {
    fun movementFloat()

}

abstract class Creatures : FlyingCreatures, FloatingCreatures {
    abstract val name: String
    abstract val meansOfTransportation: String
    abstract val isEdible: Boolean
    override fun movementFly() {}
    override fun movementFloat() {}
}

class Seagull(
    override val name: String,
    override val meansOfTransportation: String,
    override val isEdible: Boolean,
) : Creatures() {
    override fun movementFly() {
        println("$name летает с помощью $meansOfTransportation и возможно съедобна $isEdible")
    }
}

class Duck(
    override val name: String,
    override val meansOfTransportation: String,
    override val isEdible: Boolean,
) : Creatures() {
    override fun movementFly() {
        println("$name летает с помощью $meansOfTransportation и возможно съедобна $isEdible")
    }

}


class СrucianСarp(
    override val name: String,
    override val meansOfTransportation: String,
    override val isEdible: Boolean,
) : Creatures() {
    override fun movementFloat() {
        println("$name плавает с помощью $meansOfTransportation и возможно съедобна $isEdible")
    }
}