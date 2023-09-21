package lesson6

import kotlin.concurrent.thread

fun main() {
    print("Введите количество секунд : ")
    var numberSeconds = readln().toInt()
    val numberStart = numberSeconds

    do {
        println("Таймер ${numberSeconds--} секунд")
        Thread.sleep(1000)

    } while (numberSeconds > 0)

    println("Прошло $numberStart секунды")

}
