package lesson14

fun main() {
    val newMessage: ForumMessage = ForumMessage("Vasa", "Всем привет!", "09.10/2023")
    newMessage.printMessage()
    val newComment: CommentForum = CommentForum("Kola", "и тебе", "10.10/2023", newMessage)
    newComment.printMessageComment()
}

open class ForumMessage(
    val author: String,
    val textMessage: String,
    val dataAndTime: String,
) {
    fun printMessage() {
        println("$author, $dataAndTime написал: \'$textMessage\'")
    }
}

class CommentForum(
    _author: String,
    _textMessage: String,
    _dataAndTime: String,
    val commentOn: ForumMessage
) : ForumMessage(_author, _textMessage, _dataAndTime) {
    fun printMessageComment() {

        println("$author, $dataAndTime ответил: \'$textMessage\' на сообщение (${commentOn.author}, ${commentOn.dataAndTime} -${commentOn.textMessage})")

    }
}
