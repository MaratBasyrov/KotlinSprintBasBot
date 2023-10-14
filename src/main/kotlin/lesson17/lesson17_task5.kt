package lesson17

fun main() {
    val jon = User("Jon", "094535")
    jon.passwordUser = "565"
    println(jon.passwordUser)
    jon.loginUser = "Миша"
}

class User(
    private val login: String,
    private var password: String
) {
    var loginUser = login
        set(value) {
            field = value
            println("Вы успешно изменили логин на $value")
        }
    var passwordUser = password
        get() = "Ваш пароль " + "*".repeat((field.length))
        set(value) = println("Вы не можете изменить пароль")
}