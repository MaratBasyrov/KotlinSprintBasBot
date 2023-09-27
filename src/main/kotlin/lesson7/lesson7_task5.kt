package lesson7

import kotlin.random.Random

fun main() {
    print("Введите длину генерируемого пароля: ")
    var passwordNumber = readln().toInt()
    var passwordGeneration: String = ""
    var listNew = (('0'..'9') + ('a'..'z') + ('A'..'Z')).toList()

    for (i in 0..passwordNumber) {
        passwordGeneration += listNew.random()

    }
    println(passwordGeneration)
}


