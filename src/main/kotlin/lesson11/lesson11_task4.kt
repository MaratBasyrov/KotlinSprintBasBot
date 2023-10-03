package lesson11

fun main() {
    val contatctOne: Contatct =
        Contatct("89005670101", "88563675643", "mail56@mail.ru", listOf("Катя", "Женя", "Наташа"))
}

class Contatct(
    var numberMobale: String,
    var numberHome: String,
    var eMail: String,
    var dearPerson: List<String>,
) {
    val iconMessage = "написать"
    val iconCall = "вызов"
    val iconVideo = "видео"
    val iconMail = "почта"

    fun commitMessage(numberMobale: String, numberHome: String) {}
    fun commitCall(numberMobale: String, numberHome: String) {}
    fun commitVideo(numberMobale: String, numberHome: String) {}
    fun commitMail(iconMail: String) {}
}
