package lesson19

fun main() {
    val f = Spaceship()
    f.lending()

}

class Spaceship() {
    fun takeOff() {
        TODO("Нужна дополнительная логика")
    }

    fun lending() {
        throw NotImplementedError("ошибка")
    }

    fun shoot() {

    }
}