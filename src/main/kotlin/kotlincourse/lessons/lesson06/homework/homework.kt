package kotlincourse.lessons.lesson06.homework
// Main function to print values
fun main () {
    printSeason(1)
    printSeason(4)
    printSeason(7)
    printSeason(11)
    printSeason(13)
    dogAge(age = 2)
    dogAge(age = 8)
}
//Задание 1

fun printSeason (month: Int) {
    when (month) {
        1, 2, 12 -> println("Winter")

        3, 4, 5 -> println("Spring")

        6, 7, 8 -> println("Summer")

        9, 10, 11 -> println("Autum")

        else -> println("There is no month")
    }
}

// Задание 2

fun dogAge (age: Int) {
    if (age <= 2) {
        println(age * 10.5)
    }
    else {
        println((age - 2) * 4 + 10.5 * 2)
    }

}

// Задание 3

