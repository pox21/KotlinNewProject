package lesson_4

fun main() {
    val totalTables: Int = 13
    val bookedToday: Int = 13
    val bookedTomorrow: Int = 9

    val isAvailableToday = bookedToday < totalTables
    val isAvailableTomorrow = bookedTomorrow < totalTables

    println("Доступность столиков на сегодня: $isAvailableToday\nДоступность столиков на завтра: $isAvailableTomorrow")
}
