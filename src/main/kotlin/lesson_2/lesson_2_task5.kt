package lesson_2

import kotlin.math.pow
const val HUNDRED_PERCENT: Double = 100.0;

fun main() {
    val initialDeposit: Int = 70000
    val annualInterestRate: Double = 16.7
    val years: Int = 20

    val finalAmount: Double =
        initialDeposit * (1 + annualInterestRate / HUNDRED_PERCENT).pow(years)
    println(String.format("%.3f", finalAmount))
}