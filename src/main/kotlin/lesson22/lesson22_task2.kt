package lesson22

fun main() {
    val bookR = RegularBook("Сказки", "Пушкин")
    val bookD = DataBook("Рассказы", "Толстой")
    println(bookR) // выводит информацию о классе
    println(bookD) // выводит поля как текстовое представление
}

class RegularBook(
    val name: String,
    val author: String,
)

data class DataBook(
    val name: String,
    val author: String,
)