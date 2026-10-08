package kotlincourse.lessons.lesson10


val pair = 1 to "a"

//Empty map:

val emptyMap = mapOf<String, String>()

val capitals = mapOf("Россия" to "Москва", "Франция" to "Париж")
val map = mapOf(1 to "a", 2 to "b", 3 to "c")

fun main() {

// MutableMap allows to redact its values after creation
    val mutableCapitals = mutableMapOf("Россия" to "Москва", "Франция" to "Париж")

    mutableCapitals["Германия"] = "Берлин"
    mutableCapitals.remove("Франция")

// Access to values
    val capitalOfRussia = capitals["Россия"]

// Value iteration

    for ((country, capital) in capitals) {
        println("$country: $capital")
    }

// Conditions
    if ("Россия" in capitals) {
        println("Столица России: ${capitals["Россия"]}")
    }

// Key uniqueness. Keys must be unique and if they're used more than once - their old value association will be rewritten.
    val map = mutableMapOf("a" to 1, "b" to 2)
    map["a"] = 3  // key value "a" is now 3, not 1

// Keys and Null. Keys can be Null but that's an uncommon practice. It can lead to a lot of logic errors if used carelessly.
    val mapWithNullableKey = mutableMapOf<String?, Int>(null to 1)

// Common values. Unlike keys, values can be common. Different keys can be linked to the same value
    val map2 = mutableMapOf("a" to 1, "b" to 1, "c" to 2)

// PRACTICE

//    Создайте пустой неизменяемый словарь, где ключами будут строки, а значениями - целые числа.
    val emptyNotMutable: Map<String, Int> = mapOf()

//    Создайте неизменяемый словарь, где ключами являются целые числа, а значениями - строки, и инициализируйте его несколькими парами.
    val emptyNotMutableEmptyMap: Map<String, Int> = emptyMap()

//    Создайте изменяемый словарь, где ключами и значениями являются строки, и инициализируйте его несколькими парами.
    val numbersAndStrings: Map<Int, String> = mapOf(1 to "one", 2 to "two", 3 to "three")

//    Имея изменяемый словарь, добавьте в него новую пару ключ-значение.
    val mutableMap = mutableMapOf("String1" to "String2")

//    Имея изменяемый словарь, удалите из него элемент по определенному ключу.
    mutableMap.put("key1", "value1")
    // mutableMap[key2] = "value2" // чего
    mutableMap.remove("key1")
    println(mutableMap)
    
// Создайте словарь и используйте цикл для вывода всех его ключей и соответствующих значений.
    for ((key, value) in mutableMap) {
        println("$key: $value")
    }

    //
    fun printValue(NeededKey: String) {
        var isFound: Boolean = false
        for ((key, value) in mutableMap) {
            if (key == NeededKey) {
                println(value)
                isFound = true
                break
            }

        }
        if (!isFound) {
            println("Not found")
        }
    }
}