package lesson_3

fun main() {
    val moveData: String = "D2-D4;0"
    val parts = moveData.split("-", ";") // разделители: "-" и ";"

    val fromSquare = parts[0]
    val toSquare = parts[1]
    val moveNumber = parts[2]

    println("From: $fromSquare")
    println("To: $toSquare")
    println("Move number: $moveNumber")
}