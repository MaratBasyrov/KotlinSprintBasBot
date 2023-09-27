package lesson7

fun main() {
    val passwordCharOne = ('a'..'z').random().toString()
    val passwordNumberOne = (0..9).random().toString()
    val passwordCharTwo = ('a'..'z').random().toString()
    val passwordNumberTwo = (0..9).random().toString()
    val passwordCharThree = ('a'..'z').random().toString()
    val passwordNumberThree = (0..9).random().toString()
    println("$passwordCharOne$passwordNumberOne$passwordCharTwo$passwordNumberTwo$passwordCharThree$passwordNumberThree")
}