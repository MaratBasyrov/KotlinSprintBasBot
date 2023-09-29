package lesson10

fun main() {
    var startScorePeople: Int = 0
    var startScoreComp: Int = 0

    do {
        val peopleCast = throwDice()
        val compCast = throwDice()

        println("Кость бросает человек: $peopleCast")
        println("Кость бросает компьютер: $compCast")

        val makeRound = makeRoundNext(peopleCast, compCast, startScorePeople, startScoreComp)
        println(makeRound.first)
        startScorePeople = makeRound.second
        startScoreComp = makeRound.third
        println("Cчет человека: $startScorePeople , Счет компьютера: $startScoreComp")
        println("Хотите бросить кости еще раз введите \"Да\" или \"Нет\"")
        val yesOrNo = readln()

    } while (yesOrNo.uppercase() == "ДА")

}

fun throwDice() = (1..6).random()
fun makeRoundNext(peopleCast: Int, compCast: Int, scorePeople: Int, scoreComp: Int): Triple<String, Int, Int> {
    var plusScorePeople: Int = scorePeople
    var plusScoreComp: Int = scoreComp
    when {
        (peopleCast > compCast) -> {
            plusScorePeople++
            return Triple("побеждает человечество!", plusScorePeople, plusScoreComp)
        }

        (peopleCast == compCast) -> {
            return Triple("победила дружба!", plusScorePeople, plusScoreComp)
        }

        else -> {
            plusScoreComp++
            return Triple("Побеждают машины!", plusScorePeople, plusScoreComp)
        }
    }

}