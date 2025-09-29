package lesson_2
const val HUNDRED_PERCENT: Double = 100.0

fun main() {
    val crystalOre: Int = 7
    val ironOre: Int = 11
    val buffPercent: Int = 20

    val bonusCrystalOre: Int = (crystalOre * buffPercent / HUNDRED_PERCENT).toInt()
    val bonusIronOre: Int = (ironOre * buffPercent / HUNDRED_PERCENT).toInt()

    println("Бонус кристаллической руды: $bonusCrystalOre")
    println("Бонус за железную руду: $bonusIronOre")
}