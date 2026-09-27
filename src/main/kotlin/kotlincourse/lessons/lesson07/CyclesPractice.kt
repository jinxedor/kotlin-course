package kotlincourse.lessons.lesson07

import kotlincourse.lessons.lesson04.p

fun main() {
    for (i in 1..5) {
        println(i * i)
    }
    println("--------")

    for (i in 10 downTo 1) { // reverse cycle
        println(i)
    }
    println("--------")

    for (i in 1..10) { // alternative reverse cycle
        println(11 - i)
    }
    println("--------")

    for (i in 20 downTo 1 step 2) { // cycle of even numbers
        println(i)
    }
    println("--------")

    for (i in 20 downTo 1) { // alternative cycle of even numbers
        if (i % 2 == 0) {
            println(i)
        }
    }
    println("--------")

    for (d in 1..30) {
        if (d % 3 == 0) {
            println(d)
        }
    }
    println("--------")

    val index: Int = 13
    for (p in 0 until index) {
        println(p)
    }
    println("--------")

    var e = 0
    var sum = 0
    while (e++ < 10) {
        println(e)
        sum += e
        println(sum)
    }
    println("--------")

    var w = 1
    while (true) {
        if (++w % 7 == 0) break
    }
    println(w)
    println("--------")

    for (t in 1 .. 10) {
        if (t ==3 || t == 7) continue
        println(t)
    }
}