package lesson7

import kotlin.concurrent.thread

fun main() {
    print("Введите лимит для таймера в сек : ")
    val limitSeconds = readln().toInt()
    for (i in limitSeconds downTo 0) {
        println(i)
        Thread.sleep(1000)
    }
    println("Время вышло")
}