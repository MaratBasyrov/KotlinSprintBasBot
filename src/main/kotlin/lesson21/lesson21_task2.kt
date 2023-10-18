package lesson21

fun main() {
    val d = mutableListOf(2, 4, 6, 7, 3, 0, 1)
    d.evenNumbersSum()
}

fun List<Int>.evenNumbersSum() {
    var sumNumber = 0
    this.forEach() {
        if (it % 2 == 0) sumNumber += it
    }
    println(sumNumber)

}