package lesson_1
const val MINUTES_IN_HOUR = 60
const val SECONDS_IN_HOUR = MINUTES_IN_HOUR * MINUTES_IN_HOUR
fun main() {

    val totalSeconds: Int = 6480
    val secondsInHour = MINUTES_IN_HOUR * MINUTES_IN_HOUR

    val hours: Int = totalSeconds / secondsInHour
    val remainingSeconds: Int = totalSeconds % secondsInHour

    val minutes: Int = remainingSeconds / MINUTES_IN_HOUR
    val seconds: Int = remainingSeconds % MINUTES_IN_HOUR

    println(String.format("%02d:%02d:%02d", hours, minutes, seconds))
}