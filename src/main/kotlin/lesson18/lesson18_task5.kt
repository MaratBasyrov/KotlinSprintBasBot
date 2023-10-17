package lesson18

fun main() {
    val circleOne = Circle("круг")
    val squareOne = Square("прямоугольник")
    val pointOne = Point("точка")
    val shapeOnSсreen = Screen()
    shapeOnSсreen.draw(56, 89, circleOne)
    shapeOnSсreen.draw(34.0f, 45.34f, squareOne)
    shapeOnSсreen.draw(56, 78, pointOne)

}

class Screen() {

    fun draw(xFloat: Float, yFloat: Float, shape: Circle) {
        println("Нарисовал $xFloat Float  и $yFloat Float для ${shape.name}")
    }

    fun draw(xInt: Int, yInt: Int, shape: Circle) {
        println("Нарисовал $xInt Int  и $yInt Int для ${shape.name}")
    }

    fun draw(xFloat: Float, yFloat: Float, shape: Square) {
        println("Нарисовал $xFloat Float  и $yFloat Float для ${shape.name}")
    }

    fun draw(xInt: Int, yInt: Int, shape: Square) {
        println("Нарисовал $xInt Int  и $yInt Int для ${shape.name}")
    }

    fun draw(xFloat: Float, yFloat: Float, shape: Point) {
        println("Нарисовал $xFloat Float  и $yFloat Float для ${shape.name}")
    }

    fun draw(xInt: Int, yInt: Int, shape: Point) {
        println("Нарисовал $xInt Int  и $yInt Int для ${shape.name}")
    }
}

class Circle(val name: String)

class Square(val name: String)

class Point(val name: String)
