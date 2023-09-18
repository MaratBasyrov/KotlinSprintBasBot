package lesson4

fun main() {

    val isSunnyForBob = true
    val isOpenTentForBob = true
    val humidityForBob = 20
    val seasonForBob = "зима"

    val analysisBob =
        (IS_SUNNY_DAY == isSunnyForBob) && (IS_OPEN_TENT == isOpenTentForBob) && (HUMIDITY_PERCENT == humidityForBob) && (SEASON_YAER !== "зима")

    print("Благоприятные ли условия сейчас для роста бобовых? $analysisBob")
}

const val IS_SUNNY_DAY: Boolean = true
const val IS_OPEN_TENT: Boolean = true
const val HUMIDITY_PERCENT: Int = 20
const val SEASON_YAER: String = "зима"