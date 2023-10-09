package lesson13

fun main(){
    try {

        val number: Long
        val strNumber = readLine().toString()
        number = strNumber.toLong()
    } catch (exception: NumberFormatException){
        println("Номер может содержать только цифры")
    }


}
