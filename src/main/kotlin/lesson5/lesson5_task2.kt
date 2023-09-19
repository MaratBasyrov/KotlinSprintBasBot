package lesson5

fun main() {

    print("Введи год Вашего рождения : ")
    val data_birth = readln().toInt()

    val yearNow = 2023
    val ageNow = yearNow - data_birth

    if (ageNow >= AGE_MIN)
        println("Показать экран со скрытым контентом")
    else
        println("нет")

}

const val AGE_MIN = 18