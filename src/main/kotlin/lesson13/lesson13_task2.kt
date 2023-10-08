package lesson13

fun main() {
    val g: TelephoneDir = TelephoneDir("Санек", 89995645330, null)
    g.informationContact()

}

class TelephoneDir(
    val name: String,
    val numberTel: Long,
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