package lesson17

fun main() {
    val folder = HiddenFolder()
    println(folder.name)
    println(folder.numberFile)
}

class HiddenFolder() {
    var name: String = "Фотографии"
        get() {
            return if (isSecret) "скрытая папка"
            else field
        }
    val numberFile: Int = 45
        get() {
            return if (isSecret) 0
            else field
        }
    val isSecret: Boolean = true

}