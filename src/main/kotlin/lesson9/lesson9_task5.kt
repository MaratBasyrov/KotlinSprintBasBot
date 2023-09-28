package lesson9

fun main() {
    println("Введи 5 ингредиентов:")
    val listNew = List(5) { readln() }.toMutableSet()
    val sortedList = listNew.sorted()
    val listToStr = sortedList.joinToString(", ")
    val strUpperCase = listToStr.replaceFirstChar { it.uppercase() }
    val strDod = strUpperCase.plus(".")
    println(strDod)
}