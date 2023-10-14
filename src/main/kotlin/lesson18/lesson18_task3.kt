package lesson18

fun main() {
    val FoxOne = Fox("Лиса")
    FoxOne.modeEat()
    val dogOne = Dog("Собака")
    dogOne.modeEat()
    val catOne = Cat("Кошка")
    catOne.modeEat()
}

abstract class Tamagotchi(
    val name: String,
) {
    abstract val startsEating: String
    fun modeGame() {
        println("$name - играет")
    }

    fun modeSleep() {
        println("$name - спит")
    }

    fun modeEat() {
        println("$name - кушает $startsEating")
    }
}

class Fox(
    name: String,
    ) : Tamagotchi(name) {
    override val startsEating: String = "Ягоды"

}

class Dog(
    name: String,
    ) : Tamagotchi(name) {

    override val startsEating: String = "Кости"

}

class Cat(
    name: String,
    ) : Tamagotchi(name) {
    override val startsEating: String = "Рыбу"
}
