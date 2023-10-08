package lesson13

fun main() {
    var listContackt: List<TelephoneContact>?
    val contacktMasha: TelephoneContact = TelephoneContact("Маша", null, "Газмпром")
    val contacktAnna: TelephoneContact = TelephoneContact("Анна", 89567867652, "Роснефть")
    val contacktEkat: TelephoneContact = TelephoneContact("Катя", 89984554322, null)
    listContackt = listOf(contacktMasha, contacktAnna, contacktEkat)
    informationContact(listContackt)
}

fun informationContact(a: List<TelephoneContact>) {
    a.forEach {
        println(
            "Имя ${it.name ?: "[не указано]"}, Телефон ${it.numberTel ?: "[не указано]"}, Компания ${it.company ?: "[не указано]"}"
        )
    }
}

class TelephoneContact(
    val name: String?,
    val numberTel: Long?,
    val company: String?,
) {

}