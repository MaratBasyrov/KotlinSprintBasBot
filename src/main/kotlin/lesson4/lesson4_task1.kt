package lesson4

fun main() {

    val tudayBooking = 13
    val tomorrowBooking = 9

    val reservationTuday = tudayBooking < NUMBER_OF_TABLES
    val reservationTomorrow = tomorrowBooking < NUMBER_OF_TABLES

    println("Доступность столиков на сегодня $reservationTuday")
    println("Доступность столиков на завтра $reservationTomorrow")
}

const val NUMBER_OF_TABLES = 13