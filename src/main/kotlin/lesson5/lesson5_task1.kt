package lesson5

fun main() {
    print(
        """
        Проверка на бота
        напиште ответ: $NUMBER_BOT_ONE + $NUMBER_BOT_TWO = 
    """.trimIndent()
    )
    val answerClient = readln().toInt()
    val answerCorrected = (NUMBER_BOT_ONE + NUMBER_BOT_TWO)
    if (answerClient == answerCorrected)
        println("Добро пожаловать!")
    else
        println("доступ запрещен!")

}

const val NUMBER_BOT_ONE = 6
const val NUMBER_BOT_TWO = 8