package lesson9

fun main() {
    println("Запишите 5 ингредиентов через запятую: ")
    val ingredients = readln().split(",").sorted()
    println(ingredients)
}