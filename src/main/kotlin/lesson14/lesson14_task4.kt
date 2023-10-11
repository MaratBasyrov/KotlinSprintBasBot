package lesson14

fun main() {

    val planetOne: Planet = Planet(
        "Планета №4567", true, true, true, false, mutableListOf(
            Satellit("sputnik #1", true, true, true, true),
            Satellit("sputnik #2", true, true, true, true)

        )
    )

    planetOne.printInfoPlanets()
}

open class CelestialBodi(
    val name: String,
    val hasLife: Boolean,
    val hasAtmosphere: Boolean,
    val hasWater: Boolean,
    val hasLanding: Boolean,

    )

class Planet(
    name: String,
    hasLife: Boolean,
    hasAtmosphere: Boolean,
    hasWater: Boolean,
    hasLanding: Boolean,
    val satellitesList: MutableList<Satellit>,
) : CelestialBodi(name, hasLife, hasAtmosphere, hasWater, hasLanding) {
    fun printInfoPlanets() {
        var nameSatellitsFoInfo = satellitesList.joinToString { it -> it.name }
        println("Имя планеты: \'$name\'  имеет ${satellitesList.size} спутника ($nameSatellitsFoInfo)")
    }
}

class Satellit(
    name: String,
    hasLife: Boolean,
    hasAtmosphere: Boolean,
    hasWater: Boolean,
    hasLanding: Boolean,
) : CelestialBodi(name, hasLife, hasAtmosphere, hasWater, hasLanding)