package lesson6

fun main() {
    print("Создайте логин : ")
    val clientLogin: String = readln()
    print("Создайте пароль : ")
    val clientPassword: String = readln()

    print("Введите логин : ")
    var enterLogin: String = readln()
    print("Введите пароль : ")
    var enterPassword: String = readln()

    while ((enterLogin != clientLogin) || (enterPassword != clientPassword)) {
        println("Данные не совпадают, попробуйте еще раз ")
        print("Введите логин : ")
        enterLogin = readln()
        print("Введите пароль : ")
        enterPassword = readln()
    }
    println("Авторизация прошла успешно")

}