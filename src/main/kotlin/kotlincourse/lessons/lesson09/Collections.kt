package kotlincourse.lessons.lesson09
// Arrays

//Using arrayOf:
val numbers: Array<Int> = arrayOf(1, 2, 3, 4, 5) // You can change the values but you cant change the size of the array

//You can change values within arrays calling them by index

//Specialized functions:
val doubles: DoubleArray = doubleArrayOf(1.1, 2.2, 3.3)

//Empty and nullable arrays:
val emptyArray: Array<String> = Array(5) { "" } //You cant create array without establishing its size
val emptyNullableArray: Array<Int?> = arrayOfNulls<Int>(5)

// Lists

//If called explicitly - list cant be change in size and content if it's not MutableList

val readOnlyList: List<String> = listOf("a", "b", "c") // Can't be changed

val mutableList: MutableList<String> = mutableListOf("a", "b", "c") // Can be changed

fun main() {
    numbers[0] = 10
    println(numbers.joinToString(" ")) //Arrays doesnt have auto transfer to String

    mutableList.add("d") // List becomes "a b c d"
    mutableList.removeAt(0) // We remove 'a' from the list
    mutableList[0] = "e" // We rewrite new [0] index after the 'a' removal to 'e'
    println(mutableList)

    // Sets

    // Collection of unique elements. Can be MutableSet.
    // Useful when you need to guarantee uniqueness or the order of the elements does not matter.
    // Used in search methods, or math operations with collections

    val numbersSet: Set<Int> = setOf(1, 2, 3, 4, 5) // Can't be changed

    val mutableNumbersSet: MutableSet<Int> = mutableSetOf(1, 2, 3, 4, 5) // Can be changed

    val emptySet: Set<Int> = emptySet()
    val emptyMutableSet: MutableSet<Int> = mutableSetOf() // Empty

    // You can add or remove values in MutableSet

    mutableNumbersSet.add(6)   // Add value
    mutableNumbersSet.remove(1) // Remove value
    println(mutableNumbersSet)

    // Iteration over values
    // You can iterate through values within arrays, lists and sets using certain code

    val set = setOf("K", "o", "t", "l", "i", "n")
    for (letter in set) {
        println("| $letter |") // template for printing
    }
    println("----------")
    val list = listOf(32, 53, 1, -76)
    for (index in list.indices) { //indices - is a property that addresses a range of indexes
        if (index == list.lastIndex) {
            println(list[index] + list[0]) // Sum of the last index and the first one
        } else {
            println(list[index] + list[index + 1])
        } //This functions returns the sum of the current index+next
    }
    println("----------")
    var index = list.lastIndex
    while (index >= 0) {
        println("`${list[index--]}`")
    } // Function encloses indexes in '' in a reverse order due to the usage of decrement
    println("----------")
// ----------------------------------------------------------
// PRACTICE

// Создайте пустой массив целых чисел (тип Int) длиной 10 заполненного нулями.

    val e1: Array<Int> = arrayOf(0, 0)
    println(e1.joinToString(" "))
    println("----------")

    val e2: DoubleArray = doubleArrayOf(1.1, 2.2, 3.3, 4.4, 5.5)
    println(e2.joinToString(" "))
    println("----------")

    val e3: Array<Int> = Array(10) { 0 }
    println(e3.joinToString(" "))
    println("----------")
    var index2 = 0

    for (i in 10..100 step 10) {
        e3[index2] = i
        index2++
    }
    println(e3.joinToString(" "))
}

