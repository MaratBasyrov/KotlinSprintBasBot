package lesson8

fun main() {
    val ingredients = arrayOf("чеснок", "соль", "лук", "вода", "перец")
    print("Ввдите ингредиент который хотите проверить: ")
    val enterIngredients = readln().toString()

    val isIngredients = enterIngredients in ingredients
    if (isIngredients == true) {
        println("Ингредиент $enterIngredients в рецепте есть")
    } else println("Такого ингредиента в рецепте не")
}