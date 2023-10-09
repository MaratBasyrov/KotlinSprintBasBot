package lesson13

fun main() {

    var listContact: List<TelephoneContact> = mutableListOf()


    do {
        val enterContact = newContact()
        if (enterContact != null) {
             listContact += enterContact
        } else println("Контакт не добавлен, т.к. нет номера")

        println("Если хотите добавить новую запись, введите \"да\"")

    } while (readln().uppercase() == "ДА")

   outputInformationContact(listContact)


}

fun newContact(): TelephoneContact? {
    println("введите данные контакта:")
    print("Имя: ")
    var nameNew = readlnOrNull()
    if (nameNew.equals("", true)) {
        nameNew = null
    }
    print("Телефон: ")
    var numberTelNew = readlnOrNull()
    if (numberTelNew.equals("", true)) {
        numberTelNew = null
    }
    print("Компания: ")
    var companyNew = readlnOrNull()
    if (companyNew.equals("", true)) {
        companyNew = null
    } else companyNew

    return if (numberTelNew != null) {
        TelephoneContact(nameNew, numberTelNew, companyNew)
    } else null
}

fun outputInformationContact(listClass: List<TelephoneContact>) {
    listClass.forEach {
        println(
            "Имя ${it.name ?: "[не указано]"}, Телефон ${it.numberTel}, Компания ${it.company ?: "[не указано]"}"
        )
    }
}

class TelephoneContact(
    val name: String?,
    val numberTel: String?,
    val company: String?,
)