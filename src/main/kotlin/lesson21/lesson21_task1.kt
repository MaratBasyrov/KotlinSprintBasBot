package lesson21

fun main() {
    var testSttring = String()
    testSttring.vowelCount("Hello")
}

fun String.vowelCount(string: String) {
    var numberVowels: Int = 0
    string.forEach {
        when (it) {
            'a', 'e', 'i', 'o', 'u' -> numberVowels++
        }
    }
    println(numberVowels)
}