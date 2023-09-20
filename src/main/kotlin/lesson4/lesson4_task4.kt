package lesson4

fun main() {
    val trainingDay = 1

    val divisible = trainingDay % 2 == 0

    val exerciseHand: Boolean = !divisible
    val exercisePress: Boolean = !divisible

    val exerciseLeg: Boolean = divisible
    val exerciseBack: Boolean = divisible

    println(
        """
        Упражнения для рук: $exerciseHand
        Упражнения для ног: $exerciseLeg
        Упражнения для спины: $exerciseBack
        Упражнения для пресса: $exercisePress
    """.trimIndent()
    )
}
