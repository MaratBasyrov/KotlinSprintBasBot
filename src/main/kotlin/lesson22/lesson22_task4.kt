package lesson22

fun main() {
    val dataStart = MainScreenState("отсутствие данных")
    val dataLoad = dataStart.copy("загрузка данных", true)
    val dataFinish = dataLoad.copy("наличие загруженных данных", false)
    println(dataStart)
    println(dataLoad)
    println(dataFinish)
}

data class MainScreenState(
    var data: String,
    var isLoading: Boolean = false,
)