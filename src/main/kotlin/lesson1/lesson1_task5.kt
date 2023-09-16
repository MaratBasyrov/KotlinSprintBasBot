package lesson1

fun main() {
    val seconds: Int = 6480
    val secondsSurplus = 6480 % 60
    val minute: Int = seconds / 60
    val minuteSurplus = minute % 60
    val hour = minute / 60
    val finalString: String = String.format("0%s : %s : 0%s", hour, minuteSurplus, secondsSurplus)
    println(finalString)
}