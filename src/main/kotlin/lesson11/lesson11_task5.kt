package lesson11

fun main() {

    val allNewUser: Forum = Forum()

    val userAlexandr = allNewUser.createNewUser(1, "Alexandr", "45L6", "alexandr@mail.ru")
    val userVova = allNewUser.createNewUser(2, "Vova", "A5L8", "vova@mail.ru")

    val message1 = allNewUser.createNewMessage(userAlexandr.id, "Привет!")
    val message2 = allNewUser.createNewMessage(userVova.id, "и тебе привет!")

    allNewUser.printThread(listOf(message1, message2))

}

class Forum() {
    fun createNewUser(
        idNew: Int,
        userLoginNew: String,
        userPasswordNew: String,
        userEmailNew: String,
    ): UserData {
        return UserData(id = idNew, userLogin = userLoginNew, userPassword = userPasswordNew, userEmail = userEmailNew)
    }


    fun createNewMessage(authorId: Int, message: String): String {

        return "$authorId написал: $message"

    }

    fun printThread(allMessage: List<String>) {
        allMessage.forEach {
            println(it)
        }
    }

    inner class UserData(
        val id: Int,
        val userLogin: String,
        var userPassword: String,
        val userEmail: String,
        var bio: String = "",
    ) {
        fun outputUser() {
            println(
                "Данные %d пользователя: логин \'%s\', пароль \'%s\', e-mail \'%s\'".format(
                    id, userLogin, userPassword, userEmail
                )
            )
        }

        fun enterBio() {
            println("введите данные в свойсво Bio: ")
            bio = readln()
        }

        fun enterNewPassword() {
            println("Для изменения пароля введите действующий: ")
            if (userPassword == readln()) {
                println("Придумайте новый: ")
                userPassword = readln()
            } else println("ввел неправильный пароль")
        }

        fun enterUserMassage(message: String) {
            println(message)
        }

    }

}
