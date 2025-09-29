package lesson_2

const val MINUTES_IN_HOUR: Int = 60

fun main() {
    val departureHour: Int = 9
    val departureMinute: Int = 39
    println("Время выезда: %02d:%02d".format(departureHour, departureMinute))

    val travelTimeTotalMinutes: Int = 457
    val travelTimeHours: Int = travelTimeTotalMinutes / MINUTES_IN_HOUR
    val travelTimeMinutes: Int = travelTimeTotalMinutes % MINUTES_IN_HOUR

    val arrivalHour: Int = departureHour + (travelTimeHours + (departureMinute + travelTimeMinutes) / MINUTES_IN_HOUR)
    val arrivalMinute: Int = (departureMinute + travelTimeMinutes) % MINUTES_IN_HOUR
    println("Время в пути %02d:%02d".format(travelTimeHours, travelTimeMinutes))
    println("Время прибытия %02d:%02d".format(arrivalHour, arrivalMinute))
}