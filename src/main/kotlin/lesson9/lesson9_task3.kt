package lesson9

fun main() {
    val ingredients: Map<String, Int> = mutableMapOf("яиц(шт)" to 2, "молоко(мл)" to 50, "сливочное масло(гр)" to 15)
    print("Какое количество порций планируете приготовить: ")
    val newPortion = readln().toInt()
    val maxIngrediet = ingredients.mapValues { it.value * newPortion }
    maxIngrediet.forEach { println(it) }

}