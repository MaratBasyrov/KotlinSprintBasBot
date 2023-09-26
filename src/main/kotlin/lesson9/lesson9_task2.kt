package lesson9

fun main() {
    val listIngredient = mutableListOf("соль", "перец", "вода")
    listIngredient.forEach {
        println(it)
    }

    println(
        """
    В рецепте есть базовые ингредиенты: $listIngredient
    Желате добавить еще ?
    """.trimIndent()
    )
    when (val answer = readln()) {
        "да" -> print("какой ингредиент хотите добавить :")
        else -> return
    }
    val newIgredient = readln()
    listIngredient.add(newIgredient)
    println("Теперь в рецепте есть следующие ингредиенты: $listIngredient")

}