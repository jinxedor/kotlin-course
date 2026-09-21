package kotlincourse.lessons.lesson06


fun main() {
    val number: Int = 4
    if (number > 2) {
        println("Математика. Ага.")
    } else if (number == 0)
        println("Чета поплыло все")
    else {
        println("Физика. Пизда.")
    }
    println("Вот такая вот хуйня, собачка")

    // Операторыработы с диапазонами чисел
    val intRange = 1..10

    val intUntil = 1 until 10 // Диапазон перебора значений в заданых рамках
    val downTo = 10 downTo 1 // В обратную сторону
    val charRange = 'd'..'v' // Символы

    val inRange = 2 in intRange
    val notInRange = 11 !in intRange

    println(intRange.joinToString(separator = " "))
    println(inRange)

    //Альтернатива if/else для комплексной проверки условий
    val score = 67
    when (score) {
        in 61..100 -> println("еще посидим")
        in 41..60 -> println("пупупу...")
        in 10..40 -> println("гуляй родной")
        else -> println("Мальчик, не делай тете мозги")

    }

    when {
        score in 61..100 -> println("еще посидим")
        10 > 5 -> println("Ass")
        else -> println("Мальчик, не делай тете мозги")
    }

    val a = 30
    val b = 20
    val max = if (a > b) a else b

    val results = when (score) {
        in 61..100 -> println("Well done")
        in 41..60 -> println("Could be better")
        in 10..40 -> println("Cant be worse")
        else -> println("No-no-no")
    }

    example1(arg = 20)
    example2(arg = 11)
    example3(arg = "Pear")
}


// Пример задания через if/else


fun example1(arg: Int) {
    if (arg in 0..<6) {
        println("Night")
    } else if (arg in 6..<12) {
        println("Morning")
    } else if (arg in 12..<18) {
        println("Day")
    } else if (arg in 18..<24) {
        println("Evening")
    } else {
        println("This is not the time format")
    }
}

//Тот же пример через when (Предпочтительнее)

fun example2(arg: Int) {
    when (arg) {
        in 0..<6 -> {
            println("Night")
        }

        in 6..<12 -> {
            println("Morning")
        }

        in 12..<18 -> {
            println("Day")
        }

        in 18..<24 -> {
            println("Evening")
        }

        else -> {
            println("This is not the time format")
        }
    }
}

// Пример 2
fun example3(arg: String) {
    when (arg) {
        "Apple", "Banana", "Pear" -> println("Fruits")
        "Strawberry", "Wildberry", "Blueberry" -> println("Berries")
        else -> println("I dont eat that")
    }
}