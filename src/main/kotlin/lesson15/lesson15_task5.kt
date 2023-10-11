package lesson15

fun main() {
    val carOne: CarPassenger = CarPassenger("BMW", 5)
    val carTwo: CarTruck = CarTruck("ГАЗон", 5, 2)
    carOne.transportationPassengers()
    carTwo.transportationPassengers()
}

interface Transportation {
    fun transportationPassengers() {}
    fun transportationCargo() {}
}

abstract class Car : Transportation {
    abstract val nameCar: String
    abstract val numberPassengers: Int

}

class CarPassenger(
    override val nameCar: String,
    override var numberPassengers: Int,
) : Car() {
    override fun transportationPassengers() {
        when (numberPassengers) {
            in 0..3 -> println("Автомбиль $nameCar превез $numberPassengers пассажиров")
            else -> println("Автомбиль $nameCar  перез только 3-x пассажиров , некоторые  остались на обочине")
        }
    }
}

class CarTruck(
    override val nameCar: String,
    override val numberPassengers: Int,
    val numberTonnage: Int,
) : Car() {


    override fun transportationPassengers() {
        if (numberTonnage in 0..2) {
            when (numberPassengers) {
                in 0..3 -> println("Автомбиль $nameCar перевез $numberPassengers пассажиров и $numberTonnage тонн груза")
                else -> println("Автомбиль $nameCar  перевез только 1 пассажира и $numberTonnage тонн груза , некоторые  остались на обочине")
            }
        } else {
            when (numberPassengers) {
                in 0..3 -> println("Автомбиль $nameCar превез $numberPassengers пассажиров и только 2 тонны груза, некоторый груз остался на обочине")
                else -> println("Автомбиль $nameCar может перез только 1 пассажира и только 2 тонны груза , груз с пассажирами  остались на обочине")
            }
        }


    }
}
