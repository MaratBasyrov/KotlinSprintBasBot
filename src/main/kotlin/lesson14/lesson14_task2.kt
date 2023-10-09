package lesson14

fun main() {
    val seaShipOne: SeaShip = SeaShip("Теплоход", 15, 175)
    val cargoShipOne: CargoShip = CargoShip("Гружу-Вожу", 5, 677)
    val iceShipOne: IceShip = IceShip("Ледокол", 10, 300)
    seaShipOne.infoSea()
    cargoShipOne.infoSea()
    iceShipOne.infoSea()
}

open class SeaShip(
    val name: String,
    val speed: Int,
    val tonnage: Int,
) {
    open fun infoSea() {
        println("Cкорость корабля $name составляет $speed узлов , грузоподъемность $tonnage тонн")
    }
}

class CargoShip(
    name: String,
    speed: Int,
    tonnage: Int,
    val isCargoCrane: Boolean = true,
    val isSpeaker: Boolean = true,
) : SeaShip(name, speed, tonnage) {
    override fun infoSea() {
        println(
            "Cкорость корабля $name составляет $speed узлов , грузоподъемность $tonnage тонн, " +
                    "имеется грузовой кран $isCargoCrane и громкоговоритель $isSpeaker"
        )
    }
}

class IceShip(
    name: String,
    speed: Int,
    tonnage: Int,
    val isIceBreaker: Boolean = true,
    val isCabinHeating: Boolean = true,
) : SeaShip(name, speed, tonnage) {
    override fun infoSea() {
        println(
            "Cкорость корабля $name составляет $speed узлов , грузоподъемность $tonnage тонн, " +
                    "корабль может быть использовать как ледокол $isIceBreaker и имееется обогреватель $isCabinHeating"
        )
    }

    fun iceBreaker() {
        println("Корабль может колоть лед : $isIceBreaker")
    }

}