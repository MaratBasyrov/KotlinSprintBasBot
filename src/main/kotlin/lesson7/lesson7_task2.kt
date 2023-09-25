package lesson7

fun main() {

    do {
        val numberSms = (1000..9999).random()
        println("Ваш код для входа: $numberSms")
        print("Введите код из СМС: ")
        val enterSms = readln().toInt()
    } while (enterSms != numberSms)
    println("вход выполнен")
}