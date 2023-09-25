package lesson7

fun main() {
    print("Введите длину генерируемого пароля: ")
    val passwordNumber = readln().toInt()
    var passwordGeneration = ""

    for (i in 0..passwordNumber) {
        var a = (1..KOL_SIMV).random().toInt()
        var passwordGenerationTransite = when (a) {
            1 -> (0..9).random().toString()
            2 -> ('a'..'z').random().toString()
            3 -> ('A'..'Z').random().toString()
            else -> "ошибка"
        }

        passwordGeneration = passwordGeneration + passwordGenerationTransite
    }
    println("ваш пароль $passwordGeneration")
}

const val KOL_SIMV = 3
