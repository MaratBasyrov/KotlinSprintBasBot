package lesson10

fun main() {
    print("придумайте логин: ")
    val enterLogin = readln()
    print("придумайте пароль: ")
    val enterPasword = readln()
    chekingPasword(enterLogin, enterPasword)
}

fun chekingPasword(login: String, pasword: String) {
    return when {
        login.length < 4 -> println("логин менее 4х символов")
        pasword.length < 4 -> println("пароль менее 4х сиволов")
        else -> println("все хорошо")
    }
}