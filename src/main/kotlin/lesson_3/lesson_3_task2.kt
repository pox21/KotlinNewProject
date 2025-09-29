package lesson_3

fun main() {
    var lastName: String = "Андреева"
    val firstName: String = "Татьяна"
    val middleName: String = "Сергеевна"
    var age: Int = 20
    println("$lastName $firstName $middleName, $age")

    lastName = "Сидорова"
    age = 22
    println("$lastName $firstName $middleName, $age")
}