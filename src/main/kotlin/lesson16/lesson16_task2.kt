package lesson16

import kotlin.math.pow


fun main() {
    val circleOne = Circle(45.0)
    circleOne.square()
    circleOne.lenghtCircle()

}

class Circle(
    private val radius: Double
) {
    protected val pi = 3.14
    fun square() {
        println(" Площадь ровна ${pi * radius.pow(2)}")
    }

    fun lenghtCircle() {
        println(" Длина окружности ровна ${2 * pi * radius}")
    }
}