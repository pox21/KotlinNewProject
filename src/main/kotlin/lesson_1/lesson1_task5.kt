package lesson_1
const val MINUTES_IN_HOUR = 60
const val SECONDS_IN_HOUR = MINUTES_IN_HOUR * MINUTES_IN_HOUR
fun main() {
//    Объяви переменную с количеством секунд, которые Гагарин провел в космосе.
//
//    - Переведи в коде количество секунд в целые минуты и целые часы,
//    сохраняя остаток секунд и минут в новые переменные;
//    - Выведи в консоль время, проведенное в космосе в формате [часы:минуты:секунды],
//    например так: 01:30:09;
//    - Значения часов, минут и секунд отображать двумя цифрами.
    val totalSeconds: Int = 6480
    val secondsInHour = MINUTES_IN_HOUR * MINUTES_IN_HOUR
    // Перевод в часы, минуты и секунды
    val hours: Int = totalSeconds / secondsInHour
    val remainingSeconds: Int = totalSeconds % secondsInHour

    val minutes: Int = remainingSeconds / MINUTES_IN_HOUR
    val seconds: Int = remainingSeconds % MINUTES_IN_HOUR

    println(String.format("%02d:%02d:%02d", hours, minutes, seconds))
}