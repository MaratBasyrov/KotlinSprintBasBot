package lesson7

fun main() {
    print("Введите лимит : ")
    val limitNumber = readln().toInt()
    for (i in 0..limitNumber)
        while (i % 2 == 0) {
            println(i)
            break
        }
}