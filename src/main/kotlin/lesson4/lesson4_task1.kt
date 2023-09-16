package lesson4

fun main(){

    var tudayBooking = 13
    var tomorrowBooking = 9

    var reservationTuday: Boolean = tudayBooking < NUMBER_OF_TABLES
    var reservationTomorrow: Boolean = tomorrowBooking < NUMBER_OF_TABLES

    println("Доступность столиков на сегодня $reservationTuday")
    println("Доступность столиков на завтра $reservationTomorrow")
}

const val NUMBER_OF_TABLES = 13