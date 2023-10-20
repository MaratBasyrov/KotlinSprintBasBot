package lesson22

fun main() {
    val bookOneR = RegularBook("Сказка", "Пушкин")
    val bookTwoR = RegularBook("Сказка", "Пушкин")
    val bookOneD = DataBook("Рассказ", "Толстой")
    val bookTwoD = DataBook("Рассказ", "Толстой")

    println(bookOneR == bookTwoR)
    println(bookOneD == bookTwoD)
}

class RegularBook(
    val name: String,
    val author: String,
)

data class DataBook(
    val name: String,
    val author: String,
)
