package lesson10

fun main() {

    var userLogin: String
    var generationCodeSms: String
    var correctedEnterSms: String

    do {
        print("придумайте логин: ")
        val enterLogin = readln()
        userLogin = enterLogin
        chekingLogin(enterLogin)
        if (!chekingLogin(enterLogin)) print("длина логина менее 4х символов, ")
    } while (!chekingLogin(enterLogin))


    val generationPassword = generatingPasword()
    print("Хорошо! Вам сгенерирован пароль: $generationPassword")

    println("\nВойдите в систему введя Логин и Пароль через пробел: ")
    var enterLoginAndPassword = readln()

    var correctedCheckLoginAndPassword = checkLoginAndPassword(enterLoginAndPassword, userLogin, generationPassword)
    while (!correctedCheckLoginAndPassword) {
        println("Ошибка! Введите корректные Логин и Пароль через пробел: ")
        enterLoginAndPassword = readln()
        correctedCheckLoginAndPassword = checkLoginAndPassword(enterLoginAndPassword, userLogin, generationPassword)
    }

    generationCodeSms = (1000..9999).random().toString()
    println("Вам отпарленкод в СМС: $generationCodeSms")
    print("Введите код для авторизации: ")
    correctedEnterSms = readln()
    while (!checkEnterSms(correctedEnterSms, generationCodeSms)) {
        generationCodeSms = (1000..9999).random().toString()
        println("Попробуйте снова ввести код из СМС, сгенерирован новый: $generationCodeSms")
        correctedEnterSms = readln()
    }
    println("Авторизация прошла успешно!")
}

const val MIN_LEGHT_LOGIN = 4
const val MIN_LEGHT_PASWORD = 4

fun chekingLogin(login: String): Boolean {
    return when {
        login.length < MIN_LEGHT_LOGIN -> false
        else -> true
    }
}

fun generatingPasword(): String {
    val paswordSymbol = ('A'..'Z') + ('0'..'9') + ('a'..'z').toList()
    val newGenerationPasword = paswordSymbol.shuffled().take(MIN_LEGHT_PASWORD).joinToString("")
    return newGenerationPasword
}

fun checkLoginAndPassword(enterSystem: String, newLoginTrue: String, generationPassword: String): Boolean {
    val shareLogAndPas: Pair<String, String> = Pair(enterSystem.substringBefore(" "), enterSystem.substringAfter(" "))
    return (shareLogAndPas.first == newLoginTrue && shareLogAndPas.second == generationPassword)

}

fun checkEnterSms(enterSms: String, codeSms: String): Boolean = (enterSms == codeSms)