package lesson18

fun main() {
    val FoxOne = Fox("Лиса")
    FoxOne.startEat()
    val dogOne = Dog("Собака")
    dogOne.startEat()
    val catOne = Cat("Кошка")
    catOne.startEat()
}

abstract class Tamagotchi(
    val name: String,
) {
    abstract val defaultFood: String
    fun startGame() {
        println("$name - играет")
    }

    fun strtSleep() {
        println("$name - спит")
    }

    fun startEat() {
        println("$name - кушает $defaultFood")
    }
}

class Fox(
    name: String,
) : Tamagotchi(name) {
    override val defaultFood: String = "Ягоды"

}

class Dog(
    name: String,
) : Tamagotchi(name) {

    override val defaultFood: String = "Кости"

}

class Cat(
    name: String,
) : Tamagotchi(name) {
    override val defaultFood: String = "Рыбу"
}
