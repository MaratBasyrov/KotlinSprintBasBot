package lesson10

fun main() {
    print("задайте длину генерируемого пароля : ")
    val numberPas = readln().toInt()
    println(generatingPassword(numberPas))
}

fun generatingPassword(number: Int): String {
    val listSymbol =
        listOf('!', '\"', '#', '\$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/', ' ') + ('1'..'9').toList()
    val newPassword = listSymbol.shuffled().take(number)
    return newPassword.joinToString("")
}