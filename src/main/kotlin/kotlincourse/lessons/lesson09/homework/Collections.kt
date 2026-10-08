package kotlincourse.lessons.lesson09.homework

fun main() {

    //Создайте массив из 5 целых чисел и инициализируйте его значениями от 1 до 5.
    val e1: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    println(e1.joinToString(" "))
    println("-----")

    //Создайте пустой массив строк размером 10 элементов.
    val e2: Array<String> = Array(1) { "" }
    println(e2.joinToString(" "))
    println("-----")
    //Создайте массив из 5 элементов типа Double и заполните его значениями, являющимися удвоенным индексом элемента.
    val e3: DoubleArray = doubleArrayOf(1.1, 2.2, 3.3)
    println(e3.joinToString(" "))
    println("-----")

    //Создайте массив из 5 элементов типа Int. Используйте цикл, чтобы присвоить каждому элементу значение, равное его индексу, умноженному на 3.
    val e4: Array<Int> = arrayOf(1, 2, 3, 4, 5)

    for (e4Index in e4.indices) {
        e4[e4Index] = e4Index * 3
    }
    println(e4.joinToString(" "))
    println("-----")

    //Создайте массив из 3 nullable строк. Инициализируйте его одним null значением и двумя строками.
    val e5: Array<String?> = arrayOfNulls<String>(3)
    e5[0] = null
    e5[1] = ", not null"
    e5[2] = "aand nope, not null"
    println(e5.joinToString(" "))
    println("-----")

    //Создайте массив целых чисел и скопируйте его в новый массив в цикле.
    val e6: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    println(e6.joinToString(" "))

    println("Was copied")

    val e6Copy: Array<Int> = Array<Int>(5) { 0 }
    println(e6Copy.joinToString(" "))

    for (e6Value in e6.indices) {
        e6Copy[e6Value] = e6[e6Value]
    }
    println(e6.joinToString(" "))
    println("-----")

    //Создайте два массива целых чисел одинаковой длины. Создайте третий массив, вычев значения одного из другого. Распечатайте полученные значения.
    val e7: Array<Int> = Array<Int>(5) { 10 }
    println(e7.joinToString(" "))

    val e7M: Array<Int> = Array<Int>(5) { 7 }
    println(e7M.joinToString(" "))

    val e7R: Array<Int> = Array<Int>(5) { 0 }
    println(e7R.joinToString(" "))

    for (e7V in e7.indices) {
        e7R[e7V] = e7[e7V] - e7M[e7V]
    }
    println(e7R.joinToString(" "))
    println("-----")

    //Создайте массив целых чисел. Найдите индекс элемента со значением 5. Если значения 5 нет в массиве, печатаем -1. Реши задачу через цикл while.
    val e8: Array<Int> = arrayOf(1, 2, 3, 4, 1, 22, 5, -24)
    var e8I = 0
    var e8R = -1
    while (e8I < e8.size) {
        if (e8[e8I] == 5) {
            e8R = e8I
            break
        }
        e8I++
    }
    println(e8R)
    println("-----")

    //Создайте массив целых чисел. Используйте цикл для перебора массива и вывода каждого элемента в консоль. Напротив каждого элемента должно быть написано “чётное” или “нечётное”.
    val e9: Array<Int> = arrayOf(1, 2, 3, 4, 111, 22, -5, -24)
    var e9I = 0
    var e9R: Int
    while (e9I < e9.size) {
        e9R = e9[e9I]
        if (e9R % 2 == 0) {
            println("$e9R - Чётное")
        } else {
            println("$e9R - Нечётное")

        }
        e9I++

    }

    //Создай функцию, которая принимает массив строк и строку для поиска. Функция должна находить в массиве элемент, в котором принятая строка является подстрокой (метод contains()). Распечатай найденный элемент.
    val e10Library = arrayOf("Example")
    fun e10(array: Array<String>, searchString: String) {

        for (item in array) {


            if (item.contains(searchString)) {


                println("Match: $item")
            }
        }
    }

//    Создайте пустой неизменяемый список целых чисел.
    val l1: List<Int?> = listOf()

//    Создайте неизменяемый список строк, содержащий три элемента (например, "Hello", "World", "Kotlin").
    val l2: List<String> = listOf("Hello", "World", "Kotlin")

//    Создайте изменяемый список целых чисел и инициализируйте его значениями от 1 до 5.
    val l3: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)

    //    Имея изменяемый список целых чисел, добавьте в него новые элементы (например, 6, 7, 8).
    fun l3() {
        l3.add(6)
        l3.add(7)
        l3.add(8)
        val result = l3.joinToString(separator = ", ")
        println(result)
    }

//    Имея изменяемый список строк, удалите из него определенный элемент (например, "World").
    val l4: MutableList<String> = mutableListOf("Hello", "World", "Kotlin")
    fun l4_1(){
        l4.removeAt(1)
        println(l4)
    }

//    Создайте список целых чисел и используйте цикл для вывода каждого элемента на экран.
    val l5: List<Int> = listOf(1, 2, 3, 4, 5)
    fun l5_1(){
        for(i in l5){
            if(i<= l5.max()) println(i)
        }
    }

//    Создайте список строк и получите из него второй элемент, используя его индекс.
    val l6: List<String> = listOf("Hello", "World", "Kotlin")

    fun l6(){
        val l6Index = l6[1]
        println(l6Index)
    }

//    Имея изменяемый список чисел, измените значение элемента на определенной позиции (например, замените элемент с индексом 2 на новое значение).
    val l7: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)
    fun l7(){
        l7[2] = 1
    }

//    Создайте два списка строк и объедините их в один новый список, содержащий элементы обоих списков. Реши задачу с помощью циклов.
    val l8: MutableList<String> = mutableListOf("Waa", "Woo", "Wii")
    val l8_1: MutableList<String> = mutableListOf("Dee", "Doo", "Daa")
    val l8_2: MutableList<String?> = mutableListOf()
    fun l8_join(){
        for (word in l8) {
            l8_2.add(word)
        }
        for (word in l8_1) {
            l8_2.add(word)
        }
        println(l8_2.joinToString(separator = ", "))
    }

//    Создайте список целых чисел и найдите в нем минимальный и максимальный элементы используя цикл.
    val l9: List<Int> = listOf(1,2, 3, 4, 5, 6, 7)
    var l9Max = l9[0]
    var l9Min = l9[0]

    fun l9_minmax(){
        for (num in l9) {
            if(num > l9Max){
                l9Max = num
            }
            if (num < l9Min) {
                l9Min = num
            }
        }
        println(l9Max)
        println(l9Min)
    }

//    Имея список целых чисел, создайте новый список, содержащий только четные числа из исходного списка используя цикл.
    val l11: List<Int> = listOf(1, 2, 3, 4, 5, 6, 7)
    val l11_1: MutableList<Int?> = mutableListOf()
    fun l11_even(){
        for (num in l11) {
            if(num % 2 == 0){
                l11_1.add(num)
            }
        }
        println(l11_1.joinToString ( separator = "," ))
    }


}