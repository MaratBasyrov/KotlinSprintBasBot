package lesson5

fun main() {
    print(
        """
        Проверка на бота
        напиште ответ: $numberBotOne + $numberBotTwo = 
    """.trimIndent()
    )
    val answerClient = readln().toInt()
    val answerCorrected = (numberBotOne + numberBotTwo)
    if (answerClient == answerCorrected)
        println("Добро пожаловать!")
    else
        println("доступ запрещен!")

}

const val numberBotOne = 6
const val numberBotTwo = 8