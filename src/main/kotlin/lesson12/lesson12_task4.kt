package lesson12


fun main() {
    var today: Weather = Weather("+45", "+30", "754 м.р.с")
    var tomorrow: Weather = Weather("+25", "+10", "651 м.р.с")
    var afterTomorrow: Weather = Weather("+15", "+5", "541 м.р.с")

}

class Weather(val tempDay: String, val tempNigth: String, val atmPressure: String) {
    val isRain: Boolean = false

    init {
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