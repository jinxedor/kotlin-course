package kotlincourse.lessons.lesson07.homework

import kotlincourse.lessons.lesson04.b

// "For" cycles

// Straight range
fun main() {
    straightCycle()
    reverseCycle()
    stepCycle()
    untilCycle()
    whileCycle()
    doWhileCycle()
    breakCycle()
    continueCycle()
}

fun straightCycle() {
    for (c in 1..5) {
        println(c)
    }
    for (c in 1..10) {
        if (c % 2 == 0) {
            println(c)
        }
    }
    println("-------")
}

// Reverse range

fun reverseCycle() {
    for (c in 5 downTo 1) {
        println(c)
    }
    for (c in 10 downTo 1) {
        println(c - 2)
    }
    println("-------")
}


// Steps

fun stepCycle() {
    for (c in 1..9 step 2) {
        println(c)
    }
    for (c in 1..20) {
        if (c % 3 == 0) {
            println(c)
        }
    }
    println("-------")
}

// Until
fun untilCycle() {
    val size = 15
    for (c in 3 until size step 2) {
        println(c)
    }
    println("-------")
}

// While

fun whileCycle() {
    var t = 0
    while (t++ <= 5) {
        println(t * t)
    }
    var v = 10
    while (v-- >= 5) {
        println(v)
    }
    println("-------")
}

// Do While

fun doWhileCycle() {
    var g = 5
    do {
        println(g)
    } while (g-- > 1)
    var h = 5
    do {
        println(h)
    } while (h++ < 10)
    println("-------")
}

// Breaks

fun breakCycle() {
    for (w in 1 .. 10) {
        println(w)
        if (w == 6) break

    }
    for (q in 1 .. 10) {
        println(1)
        if (q == 10) break
    }
    println("-------")
}

// Continues

fun continueCycle() {
    for (a in 1..10) {
        if (a % 2 == 0) continue
        println(a)
    }
    var b = 0
    while (b++ < 10) {
        if (b % 3 == 0) continue
        println(b)
    }
}
