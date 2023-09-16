package lesson2

fun main(){
    var crystalMineral: Float = 7f
    var ironMineral: Float = 11f
    var baff: Float = 20f

    var baffCrystalMineral = crystalMineral + (crystalMineral / 100) * baff
    var baffIronMineral = ironMineral + (ironMineral / 100) * baff

    println("кристалической руды с учетом баффа $baffCrystalMineral")
    println("метллической руды с учетом баффа $baffIronMineral")
}