package lesson_3

fun main() {
    val number: Int = 7

    val multiplicationTable: String = (1..9)
        .joinToString("\n") { i -> "$number x $i = ${number * i}" }

    println(multiplicationTable)
}