package lesson21

import java.io.File

fun main() {
    var fileOne = File("text.txt")
    fileOne.createNewFile()
    fileOne.writeText("fdfff")
    fileOne.writingToAfile("11111")
    fileOne.writingToAfile("22222")
    println(fileOne.readText())
}

fun File.writingToAfile(text: String) {
    val memory = this.readText()
    this.writeText("${text.lowercase()}" + "$memory")

}