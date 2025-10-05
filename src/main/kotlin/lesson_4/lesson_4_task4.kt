package lesson_4

fun main() {
    val trainingDay = 5

    val isArmsAndAbsDay = trainingDay % 2 != 0
    val isLegsAndBackDay = !isArmsAndAbsDay

    println(
        "Упражнения для рук:       $isArmsAndAbsDay\n" +
        "Упражнения для ног:       $isLegsAndBackDay\n" +
        "Упражнения для спины:     $isLegsAndBackDay\n" +
        "Упражнения для пресса:    $isArmsAndAbsDay"
    )
}
