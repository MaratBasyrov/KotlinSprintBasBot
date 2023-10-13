package lesson16

fun main() {
    val userOne = User("FIO", "456789")
    userOne.checkPasword("56432")

}

class User(
    val login: String,
    protected val password: String,
) {
    fun checkPasword(corrected: String) {
        if (corrected == password) {
            println("Пароль совпал")
        } else println("Пароль не прошел проверку")
    }
}