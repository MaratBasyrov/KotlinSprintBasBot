package lesson17

fun main() {
    val packegeOne = Package("9045033")
    println(packegeOne.location)
    packegeOne.location = "Пункт 1"
    packegeOne.location = "Пункт 2"
}

class Package(
    private val number: String
) {
    private val numberID = number
    var location: String = "№$numberID в пункте отправки"
        set(value) {
            field = value
            counter++
            println("№$numberID Новый пункт назначения: $value (количество перемещений $counter)")
        }
    var counter: Int = 0
}