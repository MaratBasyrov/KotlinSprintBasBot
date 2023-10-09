package lesson13

fun main() {
    val personOne: TelephoneDir = TelephoneDir("Санек", "89995645330", null)
    personOne.informationContact()

}

class TelephoneDir(
    val name: String,
    val numberTel: String,
    val company: String?,
) {
    fun informationContact() {
        println(
            "Имя: $name\n" +
                    "Номер: $numberTel\n" +
                    "Компания: ${company ?: "[не указано]"}"
        )
    }
}