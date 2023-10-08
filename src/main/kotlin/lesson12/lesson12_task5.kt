package lesson12

import kotlin.random.Random


fun main() {
    var randomWeather = List<Weather>(
        10,
        { Weather((-50..50).random().toInt(), (-50..50).random(), Random.nextBoolean(), (500..1000).random()) })
    var averageTempDay: Int = 0
    var averageTempNigth: Int = 0
    var numberRainDay: Int = 0
    var averageAtmPressure: Int = 0




    randomWeather.forEach {
        averageTempDay += it.tempDay
    }
    println("Средняя температура днем  ${averageTempDay / 10}")


    randomWeather.forEach {
        averageTempNigth += it.tempNigth
    }
    println("Средняя температура ночью  ${averageTempNigth / 10}")


    randomWeather.forEach {
        if (it.isRain) {
            numberRainDay++
        }
    }
    println("Количество дождливых дней  $numberRainDay")


    randomWeather.forEach {
        averageAtmPressure += it.atmPressure
    }
    println("Средняя температура ночью  ${averageAtmPressure / 10}")
}


class Weather(val tempDay: Int, val tempNigth: Int, val isRain: Boolean, val atmPressure: Int) {

}