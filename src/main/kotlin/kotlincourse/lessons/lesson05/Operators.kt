package kotlincourse.lessons.lesson05

// Простые математические операторы
val sum = 10 + 5 // 15
val diff = 10 - 5 // 5
val product = 10 * 5 // 50
val quotient = 10 / 5 // 2
val remainder = 10 % 5 // 0 - Остаток от целочисленного деления
val remainder2 = 10 % 6 // 4
val remainder3 = 10 % 4// 2


// Операторы сравнения
val isEqual: Boolean = (5 == 5) // true
val isNotEqual = (5 != 5) // false
val isGreater = (5 > 5) // true
val isLesser = (5 < 5) // false
val isGreaterOrEqual = (5 >= 5) // true
val isLessOrEqual = (5 <= 3) // false

// Логическое объединение
// true && true == true
// true && false == false
// false && false == false
// true || true == true
// true || false == true
// false || false == false
val andResult = (5 > 3) && (5 > 4) // true
val orResult = (5 > 3) || (5 > 4) // true
val notResult = !(5 > 3) // false

// Оператор присваивания
fun main() {
    var number = 5
    number += 3 // number теперь равен 8
    // равнозначное выражение: number = number + 3
    println(number++) // Инкремент, увеличивает значение после каждого использования переменной
    val incNumber = number++ // 9 - Пост-инкремент,  применяется после вывода переменной
    println(incNumber)
    println(--number) // Пост-декремент, применяется до вывода переменной
    println(--number)
    // Оператор приоритетов
    val priorities = (false || true) && !false

    // Оператор Элвиса. Fallback для null значений
    val name: String? = null
    val result = name ?: "Unknown" // "Unknown", так как name = null
}
val userVolume = 20

fun printVolume(userVolume: Int?) {
    val defaultVolume = 30
    println(userVolume ?: defaultVolume)
}