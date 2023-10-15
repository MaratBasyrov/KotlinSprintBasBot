package lesson18

fun main() {
    val circleOne = Circle()
    circleOne.draw(45, 6)
    circleOne.draw(34.0f,67.0f)
}

open class Screen() {

    open fun draw(xFloat: Float, yFloat: Float) {
        println("Нарисовал $xFloat Float  и $yFloat Float")
    }

    open fun draw(xInt: Int, yInt: Int) {
        println("Нарисовал $xInt Int  и $yInt Int")
    }
}

class Circle() : Screen() {
    override fun draw(xFloat: Float, yFloat: Float) {
        super.draw(xFloat, yFloat)
    }
    override fun draw(xInt: Int, yInt: Int) {
        super.draw(xInt, yInt)
    }
}

class Square() : Screen() {
    override fun draw(xFloat: Float, yFloat: Float) {
        super.draw(xFloat, yFloat)
    }
    override fun draw(xInt: Int, yInt: Int) {
        super.draw(xInt, yInt)
    }
}

class Point() : Screen() {
    override fun draw(xFloat: Float, yFloat: Float) {
        super.draw(xFloat, yFloat)
    }
    override fun draw(xInt: Int, yInt: Int) {
        super.draw(xInt, yInt)
    }
}
