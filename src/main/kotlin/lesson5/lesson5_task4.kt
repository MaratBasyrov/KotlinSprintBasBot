package lesson5

fun main() {
    print("Введите логин : ")
    val enterLogin = readln()
    if (enterLogin == CLIENT_LOGIN) {
        print("Введите пароль : ")
        val enterPassword = readln()
        if (enterPassword == CLIENT_PASSWORD)
            print("Добро пожаловать на борт!")
        else print("Пароль не верный")
    } else println("Вам нужно зарегистрироваться")

}

const val CLIENT_LOGIN = "Zaphod"
const val CLIENT_PASSWORD = "PanGalactic"