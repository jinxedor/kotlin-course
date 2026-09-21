package kotlincourse.lessons.lesson04

// Тип данных при котором сама система не знает с чем будет работать, до момента инициализации кода.
val myAny: Any = "random"

// Цельный числовой тип. В примере указано максимальное допустимое, при переполнении - уходит в минус.
    //Может хранить строковое число "***"
val myInt: Int = 2147483647

// Дробный числовой тип малых значений. Не используется для точных вычислений, имеет маленькую точность. Используется для экономии памяти
val myFloat: Float = 1.2f

// Цельный числовой тип больших значений. Занимает больше памяти.
val myLong: Long = 1234567890123456789L

// Цельный числовой тип малых значений. Экономит память.
val myShort: Short = 3220

// Числовой тип для выделения памяти до 127
val myByte: Byte = 1

// Числовой тип для точных вычислений дробных чисел. Занимает больше памяти чем Float
val myDouble: Double = 1.2

// Логический тип "Да/Нет"
val myBoolean: Boolean = true

// Символьный тип. Хранит один символ строго в одиночных кавычках '*'
val myChar: Char = 'c'

// Текстовый тип для строчной записи
val Text: String = "Qwerty123!+" // \n - специальный символ для переноса текста внутри String

// Массив чисел, строк и дробных значений
val ints: Array<Int> = arrayOf(1, 2, 3)
// Список
val strings: List<String> = listOf("one", "two", "three", "four")
// Множество
val doubles: Set<Double> = setOf(32.1, 65.28, 14.5)

// Массив ключей к значениям
val keyToValues: Map<Char, Char> = mapOf(
    'a' to 'a',
    'b' to 'b',
)

// Параметр null у типов данных - отсутствующее значение. Не может быть использовано с типом String
val x: String? = null // Работать не будет

// Пример использования Any. Используется если функции в дальнейшем не нужно будет угадывать тип к которому она приводится
fun anyObject(obj: Any) {
    println(obj)
}

// Специальный тип для объявления зарезервированного отсутствующего объекта в системе.
val unit: Unit = Unit

// Функция при вызове которой произойдет остановка кода с ошибкой. Используется для предупреждения о критической недоработке или уязвимости внутри системы в среде разработки.
fun nothing(): Nothing = throw Exception()

var something: Any = "24"

fun println () {
    something = 24
    something = "24"
    something = 2.4

}

val a: Int = 100
val b: Long = 156L
val c: Float = 12.34f
val d: Double = 123.456
val e: String = "Hello, World!"
val f: Boolean = true
val g: Char = 'a'
val h: Short = 0
val i2: Long = 9999999999L
val j: Float = 25.0f
val k: Double = -123.4
val l: List<Int> = listOf(2, 3, 4)
val m: Char = '?'
val n1: String = "Kotlin"
val o: Set<Double> = setOf(3.14, 45.0)
val p: Boolean = false
val n: String = "D"
val keyToValues1: Map<String, Any> = mapOf("a" to 'a', "b" to true)

