package lesson8

fun main() {
    val ingredients = arrayOf("чеснок", "соль", "лук", "вода", "перец")
    print("Введите ингредиент который хотите проверить: ")
    val enterIngredients = readln()

    if (enterIngredients in ingredients) {
        println("Ингредиент $enterIngredients в рецепте есть")
    } else println("Такого ингредиента в рецепте нет")
}