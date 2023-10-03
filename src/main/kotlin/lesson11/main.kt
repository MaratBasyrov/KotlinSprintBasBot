package lesson11

fun main() {
    val userOne: UserData = UserData(
        id = 1,
        userLogin = "Vova",
        userPassword = "45rw4",
        userEmail = "vovka@mail.ru",
    )

    val userTwo: UserData = UserData(
        id = 2,
        userLogin = "Kolya",
        userPassword = "yh654",
        userEmail = "kolyan@mail.ru",
    )
    println(
        "Данные %d пользователя: логин \'%s\', пароль \'%s\', e-mail \'%s\'".format(
            userOne.id, userOne.userLogin, userOne.userPassword, userOne.userEmail
        )
    )

    println(
        "Данные %d пользователя: логин \'%s\', пароль \'%s\', e-mail \'%s\'".format(
            userTwo.id, userTwo.userLogin, userTwo.userPassword, userTwo.userEmail
        )
    )
}

class UserData(
    val id: Int,
    val userLogin: String,
    val userPassword: String,
    val userEmail: String,
)