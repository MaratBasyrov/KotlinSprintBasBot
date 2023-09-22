package lesson6

fun main() {
    val numberGeneration = (1..9).random()
    var numberAttempts = 5

    print("Угадайте число от 1 до 9 : ")
    var enterNumber = readln().toInt()

    if (enterNumber == numberGeneration) {
        println("победа")

    } else {
        --numberAttempts
        while (numberAttempts > 0) {
            print("$numberGeneration попробуйте еще раз: ")
            enterNumber = readln().toInt()
            if (enterNumber == numberGeneration) {
                println("это победа")
                break
            }
            numberAttempts--
        }
        println("проиграли, было загадано $numberGeneration")
    }
    println("Игра окончена")
}
