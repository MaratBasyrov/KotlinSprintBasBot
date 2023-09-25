package lesson8

fun main() {
    var ingredients = arrayOf("чеснок", "соль", "лук", "вода", "перец")
    for (i in ingredients) {
        print("$i ")
    }
    print("\nКакой ингредиент хотите заменить: ")
    var enterRenameIngredients = readln().toString()
    if (enterRenameIngredients in ingredients) {
        var index1 = ingredients.indexOf(enterRenameIngredients)
        print("на какой хотите заменть: ")
        val enterNewIngredient = readln().toString()
        ingredients.set(index1, enterNewIngredient)
        print("новый массив : ")
        for (i in ingredients) {
            print("$i ")
        }

    } else println("такого ингредиента нет")
}
