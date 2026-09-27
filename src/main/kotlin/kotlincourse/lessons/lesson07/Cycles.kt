package kotlincourse.lessons.lesson07

import kotlin.io.path.fileVisitor

fun main() {

    val collection = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    for (item in collection) {
        // cycle body
    }
    for (i in 1..10) {
        println(i)
    }
    println("--------")

    for (i in 10 downTo 1) {
        println(i)
    }
    println("--------")

    for (i in 10 downTo 1 step 2) {
        println(i)
    }
    println("--------")

    val range = 1..10
    for (i in range) {
        println(i)
    }
    println("--------")

    var counter = 0
    while (counter++ < 10) { // "while" repeats until within given the terms
        println(counter)
        println("--------")
    }

    do { // "do while" does the check after the iteration thus guarantees minimum one completion of the cycle
        println(counter)
    } while (counter++ < 10) // Same with all other incr and decr
    println("--------")

    for (i in 1 .. 10) {
        if (i == 3) break //Остановка цикла при достижении заданной итерации
        println(i)
    }
    println("--------STOP")

    for (i in 1 .. 10) {
        if (i == 7) continue //Пропуск итерации в цикле
        println(i)
    }
    println("--------CONTINUE")


}

// practice
