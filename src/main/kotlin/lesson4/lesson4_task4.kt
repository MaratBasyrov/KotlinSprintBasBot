package lesson4

fun main() {
    val trainingDay = 5

    val exerciseHand = 1
    val exercisePress = 1

    val exerciseLeg = 2
    val exerciseBack = 2

    println(
        """
        Упражнения для рук: ${trainingDay / exerciseHand == trainingDay}
        Упражнения для ног: ${trainingDay / exerciseLeg == trainingDay}
        Упражнения для спины: ${trainingDay / exerciseBack == trainingDay}
        Упражнения для пресса: ${trainingDay / exercisePress == trainingDay}
    """.trimIndent()
    )
}
