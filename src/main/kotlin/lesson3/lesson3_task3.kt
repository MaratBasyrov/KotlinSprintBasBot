package lesson3

fun main() {
    var number: Int
    number = 9
    var multiply = """
        $number * 1 = ${number * 1}
        $number * 2 = ${number * 2}
        $number * 3 = ${number * 3}
        $number * 4 = ${number * 4}
        $number * 5 = ${number * 5}
        $number * 6 = ${number * 6}
        $number * 7 = ${number * 7}
        $number * 8 = ${number * 8}
        $number * 9 = ${number * 9}
    """.trimIndent()

    println(multiply)
}