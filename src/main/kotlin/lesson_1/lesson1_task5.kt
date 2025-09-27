package lesson_1

fun main() {
//    Объяви переменную с количеством секунд, которые Гагарин провел в космосе.
//
//    - Переведи в коде количество секунд в целые минуты и целые часы,
//    сохраняя остаток секунд и минут в новые переменные;
//    - Выведи в консоль время, проведенное в космосе в формате [часы:минуты:секунды],
//    например так: 01:30:09;
//    - Значения часов, минут и секунд отображать двумя цифрами.
    val totalSeconds: Int = 6480

    // Перевод в часы, минуты и секунды
    val hours: Int = totalSeconds / 3600
    val remainingSeconds: Int = totalSeconds % 3600

    val minutes: Int = remainingSeconds / 60
    val seconds: Int = remainingSeconds % 60

    println(String.format("%02d:%02d:%02d", hours, minutes, seconds))
}