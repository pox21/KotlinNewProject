package lesson_1

fun main() {

    val yearFlight: Int = 1961

    var launchHour = 9
    var launchMinute = 7

    println("Юрий Гагарин полетел в космос в $yearFlight году");
    println("часы: %02d".format(launchHour))
    println("минуты: %02d".format(launchMinute))

    launchHour = 10;
    launchMinute = 55;
    print("%02d:%02d".format(launchHour, launchMinute))

}