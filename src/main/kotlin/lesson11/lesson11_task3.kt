package lesson11

fun main() {
    val mapUsa = mapOf<Int, String>(1 to "Jon", 2 to "Make", 3 to "Bob")
    val mapRus = mapOf<Int, String>(1 to "Маша", 2 to "Олег", 3 to "Саша")
    val roomUsa: Rooms = Rooms("Обложка №1", "комната американцев", mapUsa)
    val roomRus: Rooms = Rooms("Обложка №2", "комната россиян", mapRus)

    println(roomRus.onClikAvatar(mapRus[1], 2))
}

class Rooms(
    val cover: String,
    val name: String,
    val participants: Map<Int, String>
) {

    fun onClikAvatar(nikname: String?, status: Int): String {
        return when {
            status == 1 -> "$nikname - разговаривает"
            status == 2 -> "$nikname - микрофон выключен"
            status == 3 -> "$nikname - пользователь заглушен"
            else -> "ошибка"
        }
    }
}

