package lesson15

fun main() {
    var text1: PersonForum = PersonForum("Vasay", true, "спам: Молоко по акции")
    text1.printText()
    var text2: AdminForum = AdminForum("Admin", true, "удалю!")
    text2.printText()
    text2.deleteText(text1)
    text1.printText()

}

abstract class Forum {
    abstract val name: String
    abstract val readText: Boolean
    abstract val printText: String
    abstract fun printText()
}

class PersonForum(
    override val name: String,
    override val readText: Boolean,
    override var printText: String,

    ) : Forum() {
    override fun printText() {
        println("$name написал: \"$printText\"")
    }
}

class AdminForum(
    override val name: String,
    override val readText: Boolean,
    override val printText: String,

    ) : Forum() {
    override fun printText() {
        println("$name написал: \"$printText\"")
    }

    fun deleteText(spam: PersonForum) {
        val deleteSpam = spam
        deleteSpam.printText = "(удалено администратором)"
    }
}