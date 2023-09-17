package lesson3

fun main() {
    val motionStatus = "D2-D4;0"
    val pars = motionStatus.split("-", ";")

    val motionStart = pars[0]
    val motionEnd = pars[1]
    val progress = pars[2]

    println("Начало хода $motionStart, конец хода $motionEnd, номер хода $progress")
}