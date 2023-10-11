package lesson14

import kotlin.math.PI
import kotlin.math.pow
import kotlin.math.sqrt


fun main() {
    val figureCircleOne: Circle = Circle("Круг 1", "красный", 23.0)
    val figureCircleTwo: Circle = Circle("Круг 2", "черный", 15.0)

    val figureRectangleOne: Rectangle = Rectangle("Прямоугольник 1", "зеленый", 56.0, 25.0)
    val figureRectangleTwo: Rectangle = Rectangle("Прямоугольник 2", "красный", 16.0, 5.0)

    val figureTriangleOne: Triangle = Triangle("равнобедренный треугольник 1", "черный", 24.0, 15.0)
    val figureTriangleTwo: Triangle = Triangle("равнобедренный треугольник 2", "зеленый", 14.0, 8.0)

    squareRedFigure(
        listOf(
            figureCircleOne,
            figureCircleTwo,
            figureRectangleOne,
            figureRectangleTwo,
            figureTriangleOne,
            figureTriangleTwo
        )
    )
    perimetrRedFigure(
        listOf(
            figureCircleOne,
            figureCircleTwo,
            figureRectangleOne,
            figureRectangleTwo,
            figureTriangleOne,
            figureTriangleTwo
        )
    )

}

fun squareRedFigure(listFigure: List<Figure>) {
    var summSquareRed: Float = 0.0f
    listFigure.forEach {
        if (it.color.uppercase() == "КРАСНЫЙ") {
            summSquareRed += it.squareFigure().toFloat()
        }

    }
    println("Площадь красных фигур = $summSquareRed")
}

fun perimetrRedFigure(listFigure: List<Figure>) {
    var summPerimetrRed: Float = 0.0f
    listFigure.forEach {
        if (it.color.uppercase() == "КРАСНЫЙ") {
            summPerimetrRed += it.perimeterFigure().toFloat()
        }

    }
    println("Периметр красных фигур = $summPerimetrRed")
}

abstract class Figure(
    val name: String,
    val color: String,
) {
    open fun squareFigure(): Double {
        return 0.0
    }

    open fun perimeterFigure(): Double {
        return 0.0
    }


}

class Circle(
    name: String,
    color: String,
    val radius: Double,
) : Figure(name, color) {

    override fun squareFigure(): Double {
        return PI * (radius.pow(2.0))
        //println("Площадь фигуры \'$name\' = ${PI * (radius.pow(2.0))}")
    }

    override fun perimeterFigure(): Double {
        return 2 * PI * radius
        //println("Периметр фигуры \'$name\' = ${2 * PI * radius}")
    }
}

class Rectangle(
    name: String,
    color: String,
    val height: Double,
    val width: Double,

    ) : Figure(name, color) {
    override fun squareFigure(): Double {
        return height * width
        //println("Площадь фигуры \'$name\' = ${height * width}")
    }

    override fun perimeterFigure(): Double {
        return 2 * (height + width)
        //println("Периметр фигуры \'$name\' = ${2 * (height + width)}")
    }
}

class Triangle(
    name: String,
    color: String,
    val lengthAbC: Double,
    val lengthH: Double,


    ) : Figure(name, color) {
    override fun squareFigure(): Double {
        return (lengthAbC * lengthH) / 2
        //println("Площадь фигуры \'$name\' = ${(lengthAbC * lengthH) / 2}")
    }

    override fun perimeterFigure(): Double {
        return 2.0 * sqrt(3.0) * lengthH
        //println("Периметр фигуры \'$name\' = ${2.0 * sqrt(3.0) * lengthH}")
    }
}