package lesson8

fun main() {

    print("Введите количество ингредиентов: ")
    val numbersIgredients = readln().toInt()
    val mass = Array(numbersIgredients) {
        print("введите ${it + 1} ингредиент :")
        readln()
    }
    print("новый рецепт : ")
    for (i in mass) {
        print("$i ")
    }


}