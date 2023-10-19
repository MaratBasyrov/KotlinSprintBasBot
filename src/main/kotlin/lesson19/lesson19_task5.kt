package lesson19

fun main() {
    val listHumans: MutableList<Human> = mutableListOf()
    println(
        """Введите данные на 5ых людей в формате 
ИМЯ:
пол (муж/жен):
---------""".trimIndent()
    )

    while (listHumans.size < 5) {
        print("Введите имя: ")
        val enterName = readln()
        print("Введите пол: ")
        val enterGender = when {
            readln().uppercase() == Gender.MALE.translete -> Gender.MALE
            readln().uppercase() == Gender.FEMALE.translete -> Gender.FEMALE
            else -> continue
        }
        val classHuman = Human(enterName, enterGender)
        listHumans += mutableListOf(classHuman)

    }
    println("Результат: ")
    listHumans.forEach() {
        println("${it.name} - ${it.gender}")
    }
}

enum class Gender(val translete: String) {
    MALE("МУЖ"),
    FEMALE("ЖЕН"),
}

class Human(
    val name: String,
    val gender: Gender,
)