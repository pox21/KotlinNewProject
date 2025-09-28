package lesson_2

fun main() {
//    Задача на среднее арифметическое.
//    В классе с углубленным изучением английского языка учится 4 человека.
//    У них следующие баллы по профильному предмету 3, 4, 3, 5.
//    Пишем часть школьного софта, который посчита1ет средний балл по английскому для этого класса.
//
//    – Написать выражение, которое высчитывает средний балл;
//    – Распечатать результат в консоль;
//    – В консоли должно быть выведено дробное число с 2 знаками после запятой.

    // Баллы учеников
    val scoreFirstStudent: Int = 3
    val scoreSecondStudent: Int = 4
    val scoreThirdStudent: Int = 3
    val scoreFourthStudent: Int = 5

    val averageScore: Double = (scoreFirstStudent + scoreSecondStudent + scoreThirdStudent + scoreFourthStudent) / 4.0

    println(averageScore)

}