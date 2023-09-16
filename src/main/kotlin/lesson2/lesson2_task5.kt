package lesson2

import kotlin.math.pow

fun main() {
    var clientSum: Double = 70000.0
    var year: Double = 20.0
    var percent: Double = 16.7
    percent = (1 + percent / 100)
    var a: Double = percent.pow(year)
    var gain: Double = clientSum * a
    //var b = gain.toFloat()

    println(" Ваш доход за $year лет равен ${"%.3f".format(gain)}")
}