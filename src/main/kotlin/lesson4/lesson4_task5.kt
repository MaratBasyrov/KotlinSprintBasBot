package lesson4

fun main() {

    print("Имеюются ли повреждения: ")
    val isEnterDamage = readln().toBoolean()
    print("Количество экипажа: ")
    val enterCrew = readln().toInt()
    print("Количество ящиков с провизией: ")
    val enterFood = readln().toInt()
    print("Хорошие погодные условия: ")
    val isEnterWeather: Boolean = readln().toBoolean()

    if ((isEnterDamage == IS_DAMAGE) && (enterCrew in CREW_MIN..CREW_MAX) && (enterFood >= FOOD) && (isEnterWeather == IS_WEATHER))
        println("Корабль может отправиться в путешествие")
    else
        if ((isEnterDamage !== IS_DAMAGE) && (enterCrew in CREW_MIN..CREW_MAX) && (enterFood >= FOOD) && (isEnterWeather == IS_WEATHER))
            println("Корабль может отправиться в путешествие Альтернативно")
        else println("К сожалению, поездка невозможна")

}

const val IS_DAMAGE: Boolean = false
const val CREW_MIN: Int = 55
const val CREW_MAX: Int = 70
const val FOOD: Int = 50
const val IS_WEATHER: Boolean = true