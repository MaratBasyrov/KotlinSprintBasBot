package lesson7

fun main() {
    print("Введите лимит : ")
    val limitNumber = readln().toInt()
    for (i in 0..limitNumber step 2) {
        println(i)
    }
}