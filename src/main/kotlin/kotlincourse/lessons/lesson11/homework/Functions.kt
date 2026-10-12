package kotlincourse.lessons.lesson11.homework

import kotlin.collections.listOf

//Задачи на сигнатуру метода
fun main() {
    one()
    two(12, 22)
    three("Albania")
    four(listOf(1, 2, 3, 7, 11, 28, 941))
    five("Romania")
    six()
    seven(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9))
    eight(12)
    nine()
    ten("", 12)
    multiplyByTwo(222)
    println(isEven(13))
    printNumbersUntil(5)
    findFirstNegative(listOf(1, 2, 3, 4, 5, 6, -7, 8, 9))
    findFirstNegative2(listOf(1, 2, 3, 4, 5, 6, 8, 9))
    processList(listOf("a", "b", "c"))

}


//Напишите сигнатуру метода в которую входит модификатор доступа, название функции, список аргументов с типами и возвращаемое значение.
// В теле метода можешь сделать возврат объекта нужного типа если это требуется для устранения ошибок.

//Не принимает аргументов и не возвращает значения.
fun one(): Unit {

}

//Принимает два целых числа и возвращает их сумму.
fun two(a: Int, b: Int): Int = a + b

//Принимает строку и ничего не возвращает.
fun three(a: String) {

}

//Принимает список целых чисел и возвращает среднее значение типа Double.
fun four(a: List<Int>): Double = a.average()

//Принимает nullable строку и возвращает её длину в виде nullable целого числа и доступна только в текущем файле.
private fun five(a: String?): Int? = a?.length

//Не принимает аргументов и возвращает nullable вещественное число.
fun six(): Float? {
    return null
}

//Принимает nullable список целых чисел, не возвращает значения и доступна только в текущем файле.
private fun seven(a: List<Int?>) {

}

//Принимает целое число и возвращает nullable строку.
fun eight(a: Int): String? {
    return null
}

//Не принимает аргументов и возвращает список nullable строк.
fun nine(): List<String>? {
    return null
}

//Принимает nullable строку и nullable целое число и возвращает nullable булево значение.
fun ten(a: String?, b: Int?): Boolean? {
    return true
}

//Задачи на написание кода

//Напишите валидную сигнатуру метода а так же рабочий код для задач.

//Напишите функцию multiplyByTwo, которая принимает целое число и возвращает его, умноженное на 2.
fun multiplyByTwo(a: Int): Int = a * 2

//Создайте функцию isEven, которая принимает целое число и возвращает true, если число чётное, и false в противном случае.
fun isEven(a: Int): Boolean =
    (a % 2) == 0 //The condition set here is the default for "true" response, no need to pile up "if/else"-s

//Напишите функцию printNumbersUntil, которая принимает целое число n и выводит на экран числа от 1 до n.
// Если число n меньше 1, функция должна прекратить выполнение с помощью return без вывода сообщений.
fun printNumbersUntil(n: Int) {
    for (i in 1..n) {
        println("$i")
        if (i < 1) {
            return
        }
    }
}

//Создайте функцию findFirstNegative, которая принимает список целых чисел и возвращает первое отрицательное число в списке.
// Если отрицательных чисел нет, функция должна вернуть null.
fun findFirstNegative(n: List<Int>): Int? {
    for (i in n) {
        if (i < 0) {
            return i
        }

    }
    return null
}
// Alternative solution
fun findFirstNegative2(n: List<Int>): Int? = n.find { it < 0 } //.find - seeks the exact value corresponding with the conditions given


//Напишите функцию processList, которая принимает список строк. Функция должна проходить по списку и выводить каждую строку. Если встречается null значение, функция должна прекратить выполнение с помощью return без возврата значения.
fun processList(list: List<String?>) {
    for (string in list) {
        // If string isn't null -> we take it. If it's null — execute return
        val validString = string ?: return
        println(validString)
    }
}