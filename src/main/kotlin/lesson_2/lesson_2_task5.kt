package lesson_2

fun main() {
    val initialDeposit: Double = 70_000.0
    val annualInterestRate: Double = 0.167
    val years: Int = 20

    var multiplier: Double = 1.0
    for (i in 1..years) {
        multiplier *= (1 + annualInterestRate)
    }
    val finalAmount: Double = initialDeposit * multiplier

    println(String.format("%.3f", finalAmount))
}