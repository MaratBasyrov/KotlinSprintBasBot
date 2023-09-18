package lesson4

fun main() {

    val damage: Boolean = false
    val crewMin: Int = 55
    val crewMax: Int = 70
    val food: Int = 50
    val weather: Boolean = true

    print("Имеюются ли повреждения: ")
    val enterDamage = readln().toBoolean()
    print("Количество экипажа: ")
    val enterCrew = readln().toInt()
    print("Количество ящиков с провизией: ")
    val enterFood = readln().toInt()
    print("Хорошие погодные условия: ")
    val enterWeather: Boolean = readln().toBoolean()

    if ((enterDamage == damage) && (enterCrew in crewMin..crewMax) && (enterFood >= food) && (enterWeather == weather))
        println("Корабль может отправиться в путешествие")
    if ((enterDamage !== damage) && (enterCrew in crewMin..crewMax) && (enterFood >= food) && (enterWeather == weather))
        println("Корабль может отправиться в путешествие Альтернативно")
    else println("К сожалению, поездка невозможна")

}