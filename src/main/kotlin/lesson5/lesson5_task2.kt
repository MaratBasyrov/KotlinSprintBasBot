package lesson5

fun main() {

    print("Введи год Вашего рождения : ")
    val dataBirth = readln().toInt()

    val yearNow = 2023
    val ageNow = yearNow - dataBirth

    if (ageNow >= AGE_MIN)
        println("Показать экран со скрытым контентом")
    else
        println("нет")

}

const val AGE_MIN = 18