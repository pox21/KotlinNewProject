package lesson_2

import kotlin.math.pow

fun main() {
    val initialDeposit: Double = 70_000.0
    val annualInterestRate: Double = 0.167
    val years: Int = 20

    val finalAmount: Double = initialDeposit * (1 + annualInterestRate).pow(years)
    println(String.format("%.3f", finalAmount))
}