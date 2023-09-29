package lesson10

fun main() {
    print("придумайте логин: ")
    val enterLogin = readln()
    print("придумайте пароль: ")
    val enterPasword = readln()
    chekingPasword(enterLogin, enterPasword)
}
const val MIN_LEGHT_PASWORD = 4
fun chekingPasword(login: String, pasword: String) {
    return when {
        login.length < MIN_LEGHT_PASWORD -> println("логин менее 4х символов")
        pasword.length < MIN_LEGHT_PASWORD -> println("пароль менее 4х сиволов")
        else -> println("все хорошо")
    }
}