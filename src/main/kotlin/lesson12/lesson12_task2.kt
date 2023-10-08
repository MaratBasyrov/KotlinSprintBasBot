package lesson12

fun main() {
    var today: Weather = Weather("+45", "+30", true, "754 м.р.с")
    var tomorrow: Weather = Weather("+25", "+10", false, "651 м.р.с")
    var afterTomorrow: Weather = Weather("+15", "+5", false, "541 м.р.с")

    today.printWeather()
    tomorrow.printWeather()
    afterTomorrow.printWeather()
}

class Weather(tempDay: String, tempNigth: String, isRain: Boolean, atmPressure: String) {
    var tempDay: String = tempDay
    var tempNigth: String = tempNigth
    var isRain: Boolean = isRain
    var atmPressure: String = atmPressure

    fun printWeather() {
        println(
            "Температура днем %s, температура ночтью %s, дождь %s, атмосферное давление %s".format(
                tempDay,
                tempNigth,
                isRain,
                atmPressure
            )
        )
    }


}