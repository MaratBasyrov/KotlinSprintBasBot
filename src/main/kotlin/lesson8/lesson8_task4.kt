package lesson8

fun main() {
    val ingredients = arrayOf("чеснок", "соль", "лук", "вода", "перец")
    for (i in ingredients) {
        print("$i ")
    }
    print("\nКакой ингредиент хотите заменить: ")
    val enterRenameIngredients = readln()
    if (enterRenameIngredients in ingredients) {
        val newIndex = ingredients.indexOf(enterRenameIngredients)
        print("на какой хотите заменть: ")
        val enterNewIngredient = readln()
        ingredients[newIndex] = enterNewIngredient
        print("новый массив : ")
        for (i in ingredients) {
            print("$i ")
        }

    } else println("такого ингредиента нет")
}
