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

    println("подтвердите, что Вы не бот")
    var attemptNumber = 3
    while (attemptNumber > 0) {
        attemptNumber--
        var numberRandomOne = (1..9).random()
        var numberRandomTwo = (1..9).random()
        print("Cложите число $numberRandomOne и $numberRandomTwo = ")
        var answer = readln().toInt()
        if (answer == numberRandomOne + numberRandomTwo) {
            println("Добро пожаловть!")
            break
        } else if (attemptNumber != 0) {
            println("попробуйте еще")
            continue
        }
        println("Доступ запрещен")
    }

}