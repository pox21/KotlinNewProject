package lesson_3

fun main() {
    var from: String = "E2"
    var to: String = "E4"
    var moveNumber: Int = 1

    var moveMessage: String = "$from-$to;$moveNumber"
    println(moveMessage)

    from = "D2"
    to = "D3"
    moveNumber = 2

    moveMessage = "$from-$to;$moveNumber"
    println(moveMessage)
}