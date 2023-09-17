package lesson4

fun main() {
    val gravityMin = 35
    val gravityMax = 100
    val volumeGravityMax = 100

    val cargoGravityOne = 20
    val cargoVilumeOne = 80

    val cargoGravityTwo = 50
    val cargoVilumeTwo = 100

    println("Груз с весом $cargoGravityOne кг и объемом $cargoVilumeOne л соответствует категории 'Average': ${(cargoGravityOne > gravityMin) && (cargoGravityOne < gravityMax) && (cargoVilumeOne <= volumeGravityMax)}")
    println("Груз с весом $cargoGravityTwo кг и объемом $cargoVilumeTwo л соответствует категории 'Average': ${(cargoGravityTwo > gravityMin) && (cargoGravityTwo < gravityMax) && (cargoVilumeTwo <= volumeGravityMax)}")
}

