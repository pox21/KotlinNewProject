package lesson_2

import ANSI_CYAN
import ANSI_GREEN
import ANSI_RESET
import ANSI_YELLOW

fun main() {
    val employeesCount: Int = 50
    val employeeSalary: Int = 30000
    val internsCount: Int = 30
    val internSalary: Int = 20000

    val employeesExpenses: Int = employeesCount * employeeSalary
    val totalExpenses: Int = employeesExpenses + (internsCount * internSalary)
    val totalEmployees: Int = employeesCount + internsCount
    val averageSalary: Int = totalExpenses / totalEmployees

    println("Общая зарплата всех постояннных постоянных($employeesCount человек) $ANSI_YELLOW$employeesExpenses₽/в мес$ANSI_RESET")
    println("Общая зарплата всех сотрудников вместе со стажерами ($totalEmployees человек) $ANSI_CYAN$totalExpenses₽/в мес$ANSI_RESET")
    println("Средний оклад всех сотрудников $ANSI_GREEN$averageSalary₽/в мес$ANSI_RESET")
}