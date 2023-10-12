package lesson16

fun main() {
    val cast = PlayingDice()
    cast.showNumber()

}

class PlayingDice(
    protected val numberCube: Int = (1..6).random()
) {
    fun showNumber() {
        println("Выпало число $numberCube")
    }
}