package lesson4

fun main() {

    print("Имеюются ли повреждения: ")
    val enterDamage = readln().toBoolean()
    print("Количество экипажа: ")
    val enterCrew = readln().toInt()
    print("Количество ящиков с провизией: ")
    val enterFood = readln().toInt()
    print("Хорошие погодные условия: ")
    val enterWeather: Boolean = readln().toBoolean()

    if ((enterDamage == IS_DAMAGE) && (enterCrew in CREW_MIN..CREW_MAX) && (enterFood >= FOOD) && (enterWeather == IS_WEATHER))
        println("Корабль может отправиться в путешествие")
    if ((enterDamage !== IS_DAMAGE) && (enterCrew in CREW_MIN..CREW_MAX) && (enterFood >= FOOD) && (enterWeather == IS_WEATHER))
        println("Корабль может отправиться в путешествие Альтернативно")
    else println("К сожалению, поездка невозможна")

}

val IS_DAMAGE: Boolean = false
val CREW_MIN: Int = 55
val CREW_MAX: Int = 70
val FOOD: Int = 50
val IS_WEATHER: Boolean = true