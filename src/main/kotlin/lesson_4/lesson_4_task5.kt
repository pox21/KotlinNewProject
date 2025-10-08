package lesson_4

fun main() {
    print("Есть ли повреждения корпуса (true/false): ")
    val hasDamage = readln().toBoolean()

    print("Введите количество членов экипажа: ")
    val crewCount = readln().toInt()

    print("Введите количество ящиков с провизией: ")
    val foodBoxes = readln().toInt()

    print("Погода благоприятная? (true/false): ")
    val isWeatherGood = readln().toBoolean()

    val canSail = (
        (!hasDamage && crewCount in 55..70 && foodBoxes > 50 && (isWeatherGood || !isWeatherGood))
        ) || (
        (hasDamage && crewCount == 70 && isWeatherGood && foodBoxes >= 50)
    )

    println("Может ли корабль отправиться в плавание: $canSail")
}
