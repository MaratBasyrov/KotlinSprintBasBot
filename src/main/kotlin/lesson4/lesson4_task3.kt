package lesson4

fun main() {

    val sunnyDay: Boolean = true
    val openTent: Boolean = true
    val humidity: Int = 20
    val season: String = "зима"

    val analysisBob = (sunnyDay == true) && (openTent == true) && (humidity == 20) && (season !== "зима")

    print("Благоприятные ли условия сейчас для роста бобовых? $analysisBob")
}
