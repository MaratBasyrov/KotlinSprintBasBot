package lesson8

fun main() {

    print("Введите количество ингредиентов: ")
    val numbersIgredients = readln().toInt()
    var mass = Array<String>(numbersIgredients) { "" }

    for (i in 0 until numbersIgredients) {
        print("введите ${i + 1} ингредиент :")
        var a = readln().toString()
        mass.set(i, a)

    }
    print("новый рецепт : ")
    for (i in mass) {
        print("$i ")
    }
}