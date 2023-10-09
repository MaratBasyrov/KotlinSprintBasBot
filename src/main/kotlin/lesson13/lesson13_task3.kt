package lesson13

fun main() {

    val contacktMasha: TelephoneContact = TelephoneContact("Маша", 89567860652, "Газмпром")
    val contacktAnna: TelephoneContact = TelephoneContact("Анна", 89567867652, "Роснефть")
    val contacktEkat: TelephoneContact = TelephoneContact("Катя", 89984554322, null)
    val listContackt = listOf(contacktMasha, contacktAnna, contacktEkat)
    informationContact(listContackt)
}

fun informationContact(a: List<TelephoneContact>) {
    a.forEach {
        println(
            "Имя ${it.name}, Телефон ${it.numberTel}, Компания ${it.company ?: "[не указано]"}"
        )
    }
}

class TelephoneContact(
    val name: String,
    val numberTel: Long,
    val company: String?,
)