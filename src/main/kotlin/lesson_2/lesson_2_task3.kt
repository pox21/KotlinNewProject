package lesson_2

fun main() {
//    Сайт с расписанием поездов получает данные с сервера.
//    Сервер посылает время выезда и время в пути, а время прибытия вычисляется из них.
//    Сервер прислал данные, что поезд выехал в 9:39 и будет в пути 457 минут.
//
//    – Создай целочисленные переменные и проинициализируй их этими данными;
//    – Напиши программу, которая обработает данные и подсчитает час и минуту прибытия поезда;
//    – Выведи результат в консоль.

//      Время выезда
    val departureHour: Int = 9
    val departureMinute: Int = 39
    println("Время выезда: %02d:%02d".format(departureHour, departureMinute))
//      Время в пути (общее количество минут, в часы и минуты)
    val travelTimeTotalMinutes: Int = 457
    val travelTimeHours: Int = travelTimeTotalMinutes / 60
    val travelTimeMinutes: Int = travelTimeTotalMinutes % 60
//      Решение 1
//    val arrivalHour: Int = departureHour + (travelTimeHours + (departureMinute + travelTimeMinutes) / 60)
//    val arrivalMinute: Int = (departureMinute + travelTimeMinutes) % 60

    println("Время в пути $travelTimeHours:$travelTimeMinutes")
//    println("Время прибытия $arrivalHour:$arrivalMinute")

//      Решение 2
//      Общее количество минут с начала суток до прибытия
    val totalArrivalMinutes: Int = departureHour * 60 + departureMinute + travelTimeTotalMinutes

//      Часы и минуты прибытия
    val arrivalHour: Int = (totalArrivalMinutes / 60) % 24
    val arrivalMinute: Int = totalArrivalMinutes % 60

//      Вывод
    println("Время прибытия: $arrivalHour:$arrivalMinute")

}