package lesson4

fun main() {
    val trainingDay = 2

    val divisible = trainingDay % 2

    val exerciseHand: Boolean = (divisible !== 0)
    val exercisePress: Boolean = (divisible !== 0)

    val exerciseLeg: Boolean = (divisible == 0)
    val exerciseBack: Boolean = (divisible == 0)

    println(
        """
        Упражнения для рук: $exerciseHand
        Упражнения для ног: $exerciseLeg
        Упражнения для спины: $exerciseBack
        Упражнения для пресса: $exercisePress
    """.trimIndent()
    )
}
