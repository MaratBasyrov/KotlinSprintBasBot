package lesson8

fun main() {
    var views = intArrayOf(45, 76, 34, 90, 39, 12, 55)
    var viewsSum = 0
    for (i in views) {
        viewsSum += i
    }
    println("Колличество просмотров за неделю $viewsSum")
}