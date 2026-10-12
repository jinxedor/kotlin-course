package kotlincourse.lessons.lesson11


fun sayHello() {
    println("Hello world!")
}

fun greetUser(name: String) {
    println("Hello $name!")
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun printSum(a: Int, b: Int) {
    print("sum of $a and $b is ${a + b}")
}

// You can execute functions through values or functions for flexible value setting
val multiply = 3 * 4
fun multiply(a: Int, b: Int): Int = a * b //alternative without {}

//public function is available from anywhere, while private function is limited to the file where it's created
private fun calculateDiscount(price: Double): Double {
    return price * 0.1
}

fun finalPrice(price: Double): Double {
    val discount = calculateDiscount(price)
    return price - discount
}

//return stops the function and finalize the result if the conditions are met
fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

fun findValue(numbers: List<Int>, target: Int) {
    for (number in numbers) {
        if (number == target) {
            println("Value found: $number")
            return
        }
    }
    println("Value not found")
}

fun main() {
    sayHello()
    greetUser("Antony")
    println(sum(34, 67))
    println(printSum(43, 76))
    println(multiply(11, 12))
    println(multiply)
    println(calculateDiscount(12.11))
    println(finalPrice(15.21))
    println(isNullOrEmpty(""))
}

// PRACTICE

//Определите функцию doSomething, которая не принимает аргументов и не возвращает значения.
fun doSomething() {

}

//Определите функцию getUserName, которая не принимает аргументов и возвращает строку (String).
fun getUserName(): String {
    return "12"
}

//Определите функцию printGreeting, которая принимает строковый аргумент greeting и не возвращает значения.
fun printGreeting(greeting: String) {

}

//Определите функцию calculateArea, которая принимает два аргумента типа Double и возвращает значение типа Double.
fun calculateArea(x: Double, y: Double): Double {
    return x * y
}

//Определите функцию findMax, которая принимает два целых числа и возвращает целое число (Int).
fun findMax(a: Int, b: Int): Int {
    return if (a > b) a else b
}

//Определите функцию isNullOrEmpty, которая принимает строку (String?) и возвращает логическое значение (Boolean).
fun isNullOrEmpty(a: String?): Boolean {
    return a == null || a.isEmpty()
}

//Определите функцию logError, которая принимает строковый аргумент message и не возвращает значения.
fun logError(message: String) {
    println(message)
}

//Определите функцию getFullName, которая принимает два строковых аргумента (firstName и lastName) и возвращает строку (String).
fun getFullName(name: String, surname: String): String {
    return "$name $surname"
}
//Определите функцию calculateDiscount, которая принимает аргумент price типа Double и возвращает значение типа Double.
//Определите функцию isValid, которая принимает аргумент input типа String? и возвращает логическое значение (Boolean).
//Задание на возврат значения
//Напишите функцию greet, которая принимает строковый параметр name и возвращает приветственное сообщение в виде строки.
//Напишите функцию calculateSum, которая принимает два целых числа в качестве параметров и возвращает их сумму с использованием оператора return.
//Создайте функцию getMax, которая принимает два числа и возвращает большее из них, используя return.
//Напишите функцию calculateTotalCost, которая принимает словарь товаров и их цены, а затем возвращает итоговую стоимость.

//Задание на прерывание функции
//Реализуйте функцию printPositiveNumbers, которая принимает список чисел и выводит только положительные числа. Если встречается отрицательное число, функция должна прекратить выполнение с помощью return без возврата значения.
fun printPositiveNumbers(numbers: List<Int>) {
    for (i in numbers) {
        if (i >= 0) println(i)
        else return
    }
}

//Напишите функцию replaceString, которая принимает список строк и искомую строку. Функция должна перебрать список и заменить первое вхождение искомой строки на её версию в верхнем регистре, после чего завершить выполнение с помощью return без возврата значения.
fun replaceString(s: MutableList<String>, myString: String) {
    for (i in s.indices) {
        if (s[i] == myString) {
            s[i] = myString.uppercase()
            return
        }
    }
}

//Создайте функцию findFirstEvenNumber, которая принимает список целых чисел. Функция должна выводить каждый номер. При нахождении первого чётного числа она должна вывести сообщение "Чётное число найдено" и завершить выполнение с помощью return без возврата значения.
fun findFirstEvenNumber(numbers: List<Int>) {
    for (i in numbers) {
        println(i)
        if (numbers[i] % 2 == 0) {
            println("<-Четное число найдено!")
            return
        }
    }
}