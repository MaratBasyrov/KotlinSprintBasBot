package lesson4

fun main() {

    val cargoGravityOne = 20
    val cargoVilumeOne = 80

    val cargoGravityTwo = 50
    val cargoVilumeTwo = 100

    val checkingOne =
        (cargoGravityOne > GRAVITY_MIN) && (cargoGravityOne < GRAVITY_MAX) && (cargoVilumeOne <= VOLUE_GRAVITY_MAX)
    val checkingTwo =
        (cargoGravityTwo > GRAVITY_MIN) && (cargoGravityTwo < GRAVITY_MAX) && (cargoVilumeTwo <= VOLUE_GRAVITY_MAX)

    println("Груз с весом $cargoGravityOne кг и объемом $cargoVilumeOne л соответствует категории 'Average': $checkingOne")
    println("Груз с весом $cargoGravityTwo кг и объемом $cargoVilumeTwo л соответствует категории 'Average': $checkingTwo")
}

const val GRAVITY_MIN = 35
const val GRAVITY_MAX = 100
const val VOLUE_GRAVITY_MAX = 100
