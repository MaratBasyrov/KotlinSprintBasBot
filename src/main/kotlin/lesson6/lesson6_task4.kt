package lesson6

fun main() {
    val numberGeneration = (1..9).random()
    var numberAttempts = 5

    print("Угадайте число от 1 до 9 : ")

    while (numberAttempts > 0) {
        var enterNumber = readln().toInt()
        numberAttempts--
        if (enterNumber == numberGeneration) {
            println("Это была великолепная игра!")
            break
        } else if (numberAttempts > 0) {
            print("$numberGeneration Осталось $numberAttempts потыток, попробуйте еще : ")
        } else println("игра окончена")
    }

}