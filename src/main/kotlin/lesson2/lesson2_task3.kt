package lesson2

fun main() {
    var exitHour = 9
    var exitMinute = 39
    var travelMinute = 457

    var travelTimeHour = travelMinute / 60
    var travelTimeMinute = travelMinute % 60

    var arriveHour = exitHour + travelTimeHour
    var arriveMinute = exitMinute + travelTimeMinute

    arriveHour += arriveMinute / 60
    arriveMinute = arriveMinute % 60

    println("Прибытие поезда в $arriveHour : $arriveMinute")

}