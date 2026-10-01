package kotlincourse.lessons.lesson08


fun main() {
    getDetails1()
    stringFormating()

}

val simpleString = "A simple string"

val firstName = "Antony"
val lastName = "Nosatenko"
val fullName = firstName + " " + lastName  // Concatenation of strings. Outdated format.

val age = 30
val greeting =
    "Hello! My name is $firstName, and i'm ${age.toString()} years old." // Templates and its usages through $
// ${age.toString()} - By this function we can convert certain variables to String

class Person(val name: String, val age: Int) // Class creation

val person = Person("Алексей", 25) //Calling for class properties
val introduction = "Меня зовут ${person.name}, и мне ${person.age + 4} лет."

//We can implement function within strings

fun getDetails1(): String {
    return "очень интересные детали"
}
val details = "Здесь находятся ${getDetails1()}"

val x = 10
val y = 20
val resultString = "Результат сложения x и y равен ${x + y}"

//String formating:

val originalString = "Kotlin is fun"
val subString = originalString.substring(7)  // Index starts counting from 0, thus "is fun" will be returned
val subString2 = originalString.substring(3, 6) // The upper border is not included "lin" will be returned.
val replacedString = originalString.replace("fun", "awesome")  // "Kotlin is awesome" - a replace function.
val words = originalString.split(" ")  // ["Kotlin", "is", "fun"] - words separation with given symbols. Later this splits can be used to be adressed
val length = "Hello".length  // 5 - word count
val lastWord = "Hello/my/friend".substringAfterLast("/") // Will return the text after last stated symbol
val upper = "hello".uppercase()  // "HELLO" - upper case
val lower = "HELLO".lowercase()  // "hello" - lower case
val trimmed = "  hello  ".trim()  // "hello" - trimming exessive space
val starts = "Kotlin".startsWith("Kot")  // true - prefix input validation
val ends = "Kotlin".endsWith("lin")  // true - suffix input validation
val contains = "Hello".contains("ell")  // true - content input validation
val empty = "".isNullOrEmpty()  // true // empty input or null validation
val blank = "  ".isNullOrBlank()  // true // blank space or null validation
val repeat = "ab".repeat(3)  // "ababab" - printer function
val letter = originalString[5] // 'n' - certain letter from a string
val indexOfChar = "Kotlin".indexOf('t')  //index of a character
val indexOfWord = "Kotlin is the best language".indexOf("best") //index of a fragment starting point
val backReverse = "niltoK".reversed() //reverse print

// Multistring or raw string keeps formating inside it
val multiLineString = """
   Первая строка
   Вторая строка
   Третья строка
""".trimIndent()
val example = """
    gwwd
    wdwddwdw
        wdwd
             wdwdw
        wdqqq
        qweqroqwe      
""".trimIndent() // trimIndent seeks the lesser amount of indents in text and trims the whole message around it


//String formating
fun stringFormating() {
val name = "Алексей"
val city = "Москва"
val age = 32
val friendsCount = 1052
val rating = 4.948
val balance = 2534.75856
val text = """
  Имя: %s
  Город: %s
  Возраст: %d
  Количество друзей: %,d
  Рейтинг пользователя: %.1f
  Баланс счета: $%,.2f
""".trimIndent()
println(text.format(name, city, age, friendsCount, rating, balance))
}
/*
Result:
Имя: Алексей
Город: Москва
Возраст: 32
Количество друзей: 1 052
Рейтинг пользователя: 5,0
Баланс счета: $2 534,76
*/

// Practice

/* fun example1(arg: String) {
    when
    }
}

 */