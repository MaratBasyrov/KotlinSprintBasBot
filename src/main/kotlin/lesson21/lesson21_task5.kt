package lesson21

fun main() {
    var skill = mutableMapOf<String, Int>("Бег" to 20, "Ловкость" to 13, "Выносливость" to 34, "Лень" to 34)
    skill.maxCategory()
}

fun Map<String, Int>.maxCategory() {
    val maxValue = this.maxBy { it.value }
    println(maxValue)
}


