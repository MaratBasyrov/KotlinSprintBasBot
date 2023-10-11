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
) : SeaShip(name, speed, tonnage) {
    override fun infoSea() {
        println("Cкорость корабля $name составляет $speed узлов , грузоподъемность $tonnage тонн")
    }
}

class IceShip(
    name: String,
    speed: Int,
    tonnage: Int,
    val isIceBreaker: Boolean = true
) : SeaShip(name, speed, tonnage) {
    override fun infoSea() {
        println("Cкорость корабля $name составляет $speed узлов , грузоподъемность $tonnage тонн")
    }


}