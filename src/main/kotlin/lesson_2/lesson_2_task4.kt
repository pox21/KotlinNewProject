package lesson_2

fun main() {
    val crystalOre: Int = 7
    val ironOre: Int = 11
    val buffPercent: Double = 0.2

    val bonusCrystalOre: Int = (crystalOre * buffPercent).toInt()
    val bonusIronOre: Int = (ironOre * buffPercent).toInt()

    println("Бонус кристаллической руды: $bonusCrystalOre")
    println("Бонус за железную руду: $bonusIronOre")
}