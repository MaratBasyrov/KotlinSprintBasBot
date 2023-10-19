package lesson22

fun main() {
val alphaCentauri = GalacticGuide("Alpha Centauri", "звездная система", "20-10-2023", 565454)
    println(alphaCentauri.placeDescription)
}

data class GalacticGuide(
    val placeName: String,
    val placeDescription: String,
    val dataTime: String,
    val placeDistance: Int
)

