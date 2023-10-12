package lesson15

fun main() {
    val sendToServerTemp: Temperature = Temperature("Похолодало", 15)
    val sendToSererHumidity: Humidity = Humidity("дождь", 90)
    sendToServerTemp.connectServer()
    sendToServerTemp.sendTextServer()

    sendToSererHumidity.connectServer()
    sendToSererHumidity.sendTextServer()
}

interface SendToServer {
    fun sendTextServer()
    fun connectServer()
}

abstract class ConnectServer : SendToServer {
    abstract val textToServer: String

}

class Temperature(
    override val textToServer: String,
    val nowTemperatur: Int,
) : ConnectServer() {
    override fun connectServer() {
        println("связь с сервером установлена")
    }

    override fun sendTextServer() {
        println("Сейчас :$textToServer , температура: $nowTemperatur")
    }
}

class Humidity(
    override val textToServer: String,
    val nowHumidity: Int,
) : ConnectServer() {
    override fun connectServer() {
        println("связь с сервером установлена")
    }

    override fun sendTextServer() {
        println("Сейчас :$textToServer , температура: $nowHumidity")
    }
}