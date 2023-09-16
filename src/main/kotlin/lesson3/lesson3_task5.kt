package lesson3

fun main(){
    var motionStatus = "D2-D4;0"
    var pars = motionStatus.split("-",";")

    var motionStart = pars[0]
    var motionEnd = pars[1]
    var progress = pars[2]

    println("Начало хода $motionStart, конец хода $motionEnd, номер хода $progress")
}