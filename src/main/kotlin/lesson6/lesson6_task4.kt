package lesson6

fun main() {
    val numberGeneration = (1..9).random()
    var numberAttempts = 5

    print("Угадайте число от 1 до 9 : ")
    var enterNumber = readln().toInt()

    if (enterNumber == numberGeneration) {
        println("Это была великолепная игра!")

    } else {
        --numberAttempts
        while (numberAttempts > 0) {
            print("$numberGeneration осталось $numberAttempts попыток, попробуйте еще раз: ")
            enterNumber = readln().toInt()
            if (enterNumber == numberGeneration) {
                println("это победа")
                break
            }
            numberAttempts--
            if (numberAttempts == 0)
                println("Проиграли, было загадано $numberGeneration")
        }

    }
    println("Игра окончена")
}
