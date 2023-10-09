package lesson14

fun main() {

    val planetOne: Planets = Planets(
        "Планета №4567", true, true, true, false, 2, mutableListOf(
            Satellits("sputnik #1", true, true, true, true),
            Satellits("sputnik #2", true, true, true, true)

        )
    )

    planetOne.printInfoPlanets()
}

open class CelestialBodies(
    val name: String,
    val isLife: Boolean,
    val isAtmosphere: Boolean,
    val isWater: Boolean,
    val isLanding: Boolean,

    )

class Planets(
    name: String,
    isLife: Boolean,
    isAtmosphere: Boolean,
    isWater: Boolean,
    isLanding: Boolean,
    val numberSatellite: Int,
    val nameSatellite: MutableList<Satellits>,
) : CelestialBodies(name, isLife, isAtmosphere, isWater, isLanding) {
    fun printInfoPlanets() {
        var a: String = ""
        nameSatellite.forEach {
            a += " \'${it.name}\' "
        }
        println("Имя планеты: \'$name\'  имеет $numberSatellite спутника ($a)")
    }
}

class Satellits(
    name: String,
    isLife: Boolean,
    isAtmosphere: Boolean,
    isWater: Boolean,
    isLanding: Boolean,
) : CelestialBodies(name, isLife, isAtmosphere, isWater, isLanding)