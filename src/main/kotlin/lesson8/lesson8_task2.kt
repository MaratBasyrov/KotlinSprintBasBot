package lesson8

fun main() {
    val ingredients = arrayOf("чеснок", "соль", "лук", "вода", "перец")
    print("Ввдите ингредиент который хотите проверить: ")
    val enterIngredients = readln().toString()

    for (i in ingredients) {
        if (enterIngredients == i) {
            println("Ингредиент $enterIngredients в рецепте есть")
            return
        }

    }
    println("Такого ингредиента в рецепте нет")
}