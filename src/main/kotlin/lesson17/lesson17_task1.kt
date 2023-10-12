package lesson17

fun main() {
    val quiz = Quiz()
    println(quiz.question)
    println(quiz.answer)

}

class Quiz {
    var question: String = "Вопрос №1"
        set(value) {
            field = value
        }


    var answer: String = "Ответ №1"
        get() = field
        set(value) {
            field = value
        }
}