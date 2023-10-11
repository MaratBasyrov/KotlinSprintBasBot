package lesson15

fun main() {
    val guitar: Instrument = Instrument("Гитара", 45)
    val cabel: Component = Component("Провод", 90)
    guitar.toFind()
}

interface Search {
    fun toFind() {
        println("Идет поиск сопутвующих товаров")
    }
}

abstract class MusicalTools : Search {
    abstract val name: String
    abstract val quantity: Int

}

class Instrument(
    override val name: String,
    override val quantity: Int,
) : MusicalTools() {
    override fun toFind() {
        super.toFind()
    }
}

class Component(
    override val name: String,
    override val quantity: Int,
) : MusicalTools()
