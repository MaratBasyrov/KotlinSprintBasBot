package lesson18

fun main() {
    val four = DiceFour()
    four.rollDice()

    val six = DiceSix()
    six.rollDice()

    val eight = DiceEight()
    eight.rollDice()
}

open class Dice(
    val edge: Int
) {
    fun rollDice() {
        println("кость $edge граней, выпало число ${(1..edge).random()}")
    }

}

class DiceFour(
    edge: Int = 4,
) : Dice(edge)

class DiceSix(
    edge: Int = 6,
) : Dice(edge)

class DiceEight(
    edge: Int = 8,
) : Dice(edge)