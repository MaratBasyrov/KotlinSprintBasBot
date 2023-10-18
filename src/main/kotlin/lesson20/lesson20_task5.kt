package lesson20


fun main() {
    val sentence =
        listOf<String>("Первая Фраза", "Вторая Фраза", "Третья Фраза", "Четвертая Фраза", "Пятая Фраза").random()
    val robotOne = Robot()
    robotOne.sey(sentence)
    robotOne.setModifier { // не работает
        println(sentence.reversed())
    }
}

        class Robot {
        fun sey(sentence: String) {
            println(sentence)
        }

        fun setModifier(f: () -> Unit) {}

    }