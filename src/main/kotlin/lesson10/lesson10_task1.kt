package lesson10

fun main() {
    val peopleCast = throwDice()
    val compCast = throwDice()
    println("Костьбросает человек: $peopleCast")
    println("Кость бросает компьютер: $compCast")
    when {
        (peopleCast > compCast) -> println("побеждает человечество")
        (peopleCast == compCast) -> println("победила дружба")
        else -> println("Побеждают машины")
    }

}

fun throwDice() = (1..6).random()
