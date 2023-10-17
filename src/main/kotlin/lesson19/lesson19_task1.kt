package lesson19

fun main() {

    println("Вы можете добавить в игру следующих рыб:")
    for (i in Fish.values()) {
        println("${i.name} - ${i.translation}")

    }
}

enum class Fish(val translation: String) {
    GUPPY("Гуппи"),
    ANGELFISH("Скалярия"),
    GOLDFISH("Золотая рыбка"),
    SIAMESE_FIGHTING_FISH("Петушок"),
}