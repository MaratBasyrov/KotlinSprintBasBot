package lesson11

fun main() {
    val userOne: UserData = UserData(
        id = 1,
        userLogin = "Vova",
        userPassword = "45rw4",
        userEmail = "vovka@mail.ru",
    )

    userOne.outputUser()
    userOne.enterBio()
    userOne.enterNewPassword()
    userOne.enterUserMassage("привет")

}