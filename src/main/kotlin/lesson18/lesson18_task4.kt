package lesson18

fun main() {
    val cubOne = Cub(45)
    val rectangleOne = Rectangle(23, 45, 76)
    cubOne.calculateSquare()
    rectangleOne.calculateSquare()
}

abstract class Package(
    val sideOne: Int,
    val sideTwo: Int,
    val sideThree: Int,
    val name: String,
) {
    abstract fun calculateSquare()
}

class Cub(
    sideOne: Int,
    sideTwo: Int = sideOne,
    sideThree: Int = sideOne,
    name: String = "Куб",
) : Package(sideOne, sideTwo, sideThree, name) {
    override fun calculateSquare() {
        println("$name. Площадь поверхности = ${sideOne * sideOne * 6}")
    }
}


class Rectangle(
    sideOne: Int,
    sideTwo: Int,
    sideThree: Int,
    name: String = "Прямоугольник",
) : Package(sideOne, sideTwo, sideThree, name) {
    override fun calculateSquare() {
        println("$name. Площадь поверхности = ${(sideOne * sideTwo + sideTwo * sideThree + sideOne * sideThree) * 2}")
    }
}