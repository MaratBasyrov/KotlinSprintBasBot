package lesson5

fun main() {
    val correctNumberOne: Int = (1..100).random()
    val correctNumberTwo: Int = (1..100).random()


    println("Вы участвуете в лотерее, Вам предстоит угодать 2 числа от 1 до 100")
    print("Введите первое число : ")
    val enterNumberOne = readln().toInt()
    print("Введите второе число : ")
    val enterNumberTwo = readln().toInt()

    when {
        (enterNumberOne == correctNumberOne || enterNumberOne == correctNumberTwo) &&
                (enterNumberTwo == correctNumberOne || enterNumberTwo == correctNumberTwo) ->
                println("Поздравляем! Вы выиграли главный приз!")

        (enterNumberOne == correctNumberOne || enterNumberOne == correctNumberTwo) ||
                (enterNumberTwo == correctNumberOne || enterNumberTwo == correctNumberTwo) ->
                 println(
                     """
                     Вы выиграли утешительный приз!
                     выигрышные числа $correctNumberOne и $correctNumberTwo
                     """.trimIndent()
                 )

        else -> println(
                """
                Неудача! Крутите барабан!
                выигрышные числа $correctNumberOne и $correctNumberTwo
                """.trimIndent()
                )

    }
}