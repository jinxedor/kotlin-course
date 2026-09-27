package kotlincourse.lessons.lesson08

val simpleString = "A simple string"

val firstName = "Antony"
val lastName = "Nosatenko"
val fullName = firstName + " " + lastName  // Concatenation of strings. Outdated format.

val age = 30
val greeting = "Hello! My name is $firstName, and i'm ${age.toString()} years old." // Templates and its usages through $
// ${age.toString()} - By this function we can convert certain variables to String

class Person(val name: String, val age: Int) // Class creation

val person = Person("Алексей", 25) //Calling for class properties
val introduction = "Меня зовут ${person.name}, и мне ${person.age + 4} лет."

//fun getDetails(): String {
//    return "очень интересные детали"
//}
//val details = "Здесь находятся ${getDetails()}" //we can implement function within strings

//String formating:

val originalString = "Kotlin is fun"
val subString = originalString.substring(7)  // Index starts counting from 0, thus "is fun" will be underlined
val subString2 = originalString.substring(3, 6) // The upper border is not included "lin" will be underlined.
val replacedString = originalString.replace("fun", "awesome")  // "Kotlin is awesome" - a replace function.
val words = originalString.split(" ")  // ["Kotlin", "is", "fun"] - words separation with given symbols.
val length = "Hello".length  // 5 - word count
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
val indexOfChar = "Kotlin".indexOf('t')  //
val indexOfWord = "Kotlin is the best language".indexOf("best")
val backReverse = "niltoK".reversed()