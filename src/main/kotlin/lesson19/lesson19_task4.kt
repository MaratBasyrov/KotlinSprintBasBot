package lesson19

fun main() {
    var tankOne = Tank()
    tankOne.loadCartridge(Cartridge.RED)
    tankOne.shot()
    tankOne.loadCartridge(Cartridge.GREEN)
    tankOne.shot()

}

enum class Cartridge(val damage: Int) {
    BLUE(5),
    GREEN(10),
    RED(20)
}

class Tank {
    lateinit var combatCharge: Cartridge
    fun loadCartridge(r: Cartridge) {
        combatCharge = r
    }

    fun shot() {
        println("Выстрел ${combatCharge.name} - назначен урон ${combatCharge.damage}")
    }
}