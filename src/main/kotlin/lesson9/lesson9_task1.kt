package lesson9

fun main() {
    val newIngredients = listOf("перец", "соль", "мука", "вода")
    println("\nВ рецепте есть следующие ингредиенты: $newIngredients")
    newIngredients.forEach {
        println("$it")
    }
}