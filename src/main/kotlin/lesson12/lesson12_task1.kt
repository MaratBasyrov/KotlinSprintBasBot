package lesson12

fun main() {
    var today: Weather = Weather("+45", "+30", true, "754 м.р.с")
    var tomorrow: Weather = Weather("+25", "+10", false, "651 м.р.с")

    today.printWeather()
    tomorrow.printWeather()

}

class Weather() {
    var tempDay: String = "+25"
    var tempNigth: String = "+10"
    var isRain: Boolean = false
    var atmPressure: String = "275"

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


    constructor(
        tempDay: String,
        tempNigth: String,
        isRain: Boolean,
        atmPressure: String,

        ) : this() {
        this.tempDay = tempDay
        this.tempNigth = tempNigth
        this.isRain = isRain
        this.atmPressure = atmPressure
    }

}