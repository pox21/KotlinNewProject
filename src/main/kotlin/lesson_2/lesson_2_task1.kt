package lesson_2
const val STUDENTS_COUNT = 4
fun main() {
    val scoreFirstStudent: Int = 3
    val scoreSecondStudent: Int = 4
    val scoreThirdStudent: Int = 3
    val scoreFourthStudent: Int = 5

    val averageScore: Double = (scoreFirstStudent + scoreSecondStudent + scoreThirdStudent + scoreFourthStudent).toDouble() / STUDENTS_COUNT
    println(averageScore)
}