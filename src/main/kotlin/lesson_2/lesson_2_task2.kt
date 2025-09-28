package lesson_2
// константы цветов
import ANSI_CYAN
import ANSI_GREEN
import ANSI_RESET
import ANSI_YELLOW

fun main() {
//    В компании работало 50 человек с зарплатой по 30000 рублей.
//    Затем в компанию устроилось 30 стажеров,
//    которым назначили зарплату в 20000 рублей каждому.
//    Пишем часть гипотетического софта для бухгалтерии, который будет считать:
//
//    – Расходы на выплату зарплаты постоянных сотрудников;
//    – Общие расходы по ЗП после прихода стажеров;
//    – Среднюю ЗП одного сотрудника после устройства стажеров.
//
//    Каждый пункт посчитать и сохранить в переменную с соответствующим названием.
//    Все значения необходимо вывести в виде целых чисел.

//      Сотрудник
    val employeesCount: Int = 50
    val employeeSalary: Int = 30000
//      Стажеры
    val internsCount: Int = 30
    val internSalary: Int = 20000
//      Зарплата постоянных сотрудников
    val employeesExpenses: Int = employeesCount * employeeSalary
//      общая зарплата всех сотрудников
    val totalExpenses: Int = employeesExpenses + (internsCount * internSalary)
//      общее количества всех сотрудников и средний оклад одного сотрудника в месяц
    val totalEmployees: Int = employeesCount + internsCount
    val averageSalary: Int = totalExpenses / totalEmployees

    // Вывод
    println("Общая зарплата всех постояннных постоянных($employeesCount человек) $ANSI_YELLOW$employeesExpenses₽/в мес$ANSI_RESET")
    println("Общая зарплата всех сотрудников вместе со стажерами ($totalEmployees человек) $ANSI_CYAN$totalExpenses₽/в мес$ANSI_RESET")
    println("Средний оклад всех сотрудников $ANSI_GREEN$averageSalary₽/в мес$ANSI_RESET")

}