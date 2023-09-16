package lesson2

fun main() {

    var workers = 50
    var interns = 30
    var walkersLaborCost = 30000
    var internsLaborCost = 20000

    var workersSumCost = workers * walkersLaborCost
    var sumCost = workersSumCost + (interns * internsLaborCost)
    var averageCost = sumCost / (workers + interns)

    println("Расходы на постоянных сотрудников $workersSumCost руб.")
    println("Общие расходы $sumCost руб.")
    println("Средня запрлата $averageCost руб.")

}