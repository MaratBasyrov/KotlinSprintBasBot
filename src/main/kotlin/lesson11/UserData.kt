package lesson11

class UserData(
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