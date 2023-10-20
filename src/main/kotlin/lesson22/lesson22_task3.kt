package lesson22

fun main() {
    val book = DataBook("Сказки", "Пушкин", 56)
    val (name, author, number) = book
    println(name)
    println(author)
    println(number)

}

data class DataBook(
    val name: String,
    val author: String,
    val numberPages: Int
)