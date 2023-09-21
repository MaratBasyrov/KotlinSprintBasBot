package lesson6

fun main() {

    print("Введите количество секунд : ")
    var numberSeconds = readln().toInt()

    while (numberSeconds > 0) {
        println("осталось ${numberSeconds--} секунд")
        Thread.sleep(1000)
    }

    println("Время вышло")

}