package lesson9

fun main() {
    println("Введи 5 ингредиентов:")
    val listNew = List(5) { readln() }.toMutableList()
    val deleteDuplicate = listNew.distinct()
    val sortedList = deleteDuplicate.sorted()
    val listToStr = sortedList.joinToString(", ")
    val strUpperCase = listToStr.replaceFirstChar { it.uppercase() }
    val strDod = strUpperCase.plus(".")
    println(strDod)
}