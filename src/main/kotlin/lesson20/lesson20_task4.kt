package lesson20

fun main() {
    val listString = mutableListOf("Первый", "Второй", "Третий", "Четвертый")
    val listFun = listString.map { it -> { println("Нажат элемент $it") } }

    listFun.forEach() {
        if (listFun.indexOf(it) % 2 == 0) it()
    }
}
