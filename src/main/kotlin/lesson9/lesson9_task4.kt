package lesson9

fun main() {
    println("Запишите 5 ингредиентов через запятую: ")
    val ingredients = readln()
    val listGeneration = ingredients.split(",")
    val listSort = listGeneration.sorted()
    println(listSort)
}