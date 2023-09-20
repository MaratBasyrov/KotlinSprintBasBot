package lesson5

fun main() {
    val correctNumberOne = 45
    val correctNumberTwo = 80

    println("Вы участвуете в лотерее, Вам предстоит угодать 2 числа от 1 до 100")
    print("Введите первое число : ")
    val enterNumberOne = readln().toInt()
    print("Введите второе число : ")
    val enterNumberTwo = readln().toInt()

    when {
        (enterNumberOne == correctNumberOne || enterNumberOne == correctNumberTwo) &&
                (enterNumberTwo == correctNumberOne || enterNumberTwo == correctNumberTwo) -> println("Поздравляем! Вы выиграли главный приз!")

        (enterNumberOne == correctNumberOne || enterNumberOne == correctNumberTwo) ||
                (enterNumberTwo == correctNumberOne || enterNumberTwo == correctNumberTwo) -> println("Вы выиграли утешительный приз!")

        else -> println("Неудача! Крутите барабан!")
    }
}