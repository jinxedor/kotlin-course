package kotlincourse.lessons.lesson06.homework
// Main function to print values
fun main () {
    printSeason(11)
    dogAge(age = 8)
    transport (length = 3)
    bonusPoints(check = 5799)
    docType(doc = ".txt")
    tempConvert(tempVal = 40, tempType = 'f')
    clotheChoice (0)
    movieChoice(viewerAge = 19)

}

//Задание 1

fun printSeason (month: Int) {
    when (month) {
        1, 2, 12 -> println("Winter")

        3, 4, 5 -> println("Spring")

        6, 7, 8 -> println("Summer")

        9, 10, 11 -> println("Autum")

        else -> println("There is no such month")
    }
}

// Задание 2

fun dogAge (age: Int) {
    require(age >= 0) { "Dog's age must be bigger than 0" } // require - функция, при невыполнении которой программа мгновенно останавливается с ошибкой
    if (age <= 2) {
        println(age * 10.5)
    }
    else {
        println((age - 2) * 4 + 10.5 * 2)
    }
}

// Задание 3

fun transport (length: Int) {
    when (length) {
        in 0 until 1 -> println("Walk")
        in 1  until 5 -> println("Bike")
        else -> println("Transport")
    }
}

// Задание 4

fun bonusPoints (check: Int) {
    when (check) {
        in 0 until 1000 -> println((check / 100) * 2)
        else -> println((check / 100) * 3)
    }
}

// Задание 5

fun docType (doc: String) {
    when (doc) {
        ".txt" -> println("Text document")
        ".img" -> println("Image")
        ".xlsx" -> println("Exel")
        else -> println("Unknown")
    }
}

// Задание 6

fun tempConvert (tempVal: Int, tempType: Char) {
    when (tempType) {
        'c' -> println ((tempVal - 32) * 5/9)
        'f' -> println ((tempVal * 9/5) + 32)
        else -> println ("Wrong temperature type")
    }
}

// Задание 7

fun clotheChoice (tempOutside: Int) {
    when (tempOutside) {
        in -30 until 10 -> println("Warm clothes")
        in 10  until 18 -> println("Demi-season clothes")
        in 18  until 35 -> println("Summer clothes")
        else -> println("Please stay home")
    }
}

// Задание 8

fun movieChoice (viewerAge: Int) {
    require(viewerAge >= 0) {"Viewer age must be bigger than 0"}
    when (viewerAge) {
        in 0 .. 9 -> println("Kids")
        in 10 until 18 -> println("Teenager")
        else -> println("18+")
    }
}