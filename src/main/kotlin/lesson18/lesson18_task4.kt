package lesson18

fun main() {
    val cubOne = Cub(45)
    val rectangleOne = Rectangle(23,45,76)
    cubOne.squareCalculate()
    rectangleOne.squareCalculate()
}

abstract class Package(
    val sideOne: Int,
    val sideTwo: Int,
    val sideThree: Int,
    val name: String,
) {
    fun squareCalculate() {
        println("$name. Площадь = ${sideOne * sideTwo}")
    }
}

class Cub(
    sideOne: Int,
    sideTwo: Int = sideOne,
    sideThree: Int = sideOne,
    name: String = "Куб",
) : Package(sideOne, sideTwo, sideThree, name)


class Rectangle(
    sideOne: Int,
    sideTwo: Int,
    sideThree: Int,
    name: String = "Прямоугольник",
) : Package(sideOne, sideTwo, sideThree, name)