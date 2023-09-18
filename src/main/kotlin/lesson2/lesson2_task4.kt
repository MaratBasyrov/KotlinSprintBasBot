package lesson2

fun main() {
    val crystalMineral: Float = 7f
    val ironMineral: Float = 11f
    val baff: Float = 20f

    val baffCrystalMineral: Int = (crystalMineral * baff / 100.0f).toInt()
    val baffIronMineral: Int = (ironMineral * baff / 100.0f).toInt()

    println("Бонусная кристалическая руда $baffCrystalMineral")
    println("Бонусная метллическая руда $baffIronMineral")
}