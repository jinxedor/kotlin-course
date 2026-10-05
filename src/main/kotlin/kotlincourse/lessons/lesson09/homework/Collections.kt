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
        }
        else {
            println("$e9R - Нечётное")

        }
        e9I++

    }

    //Создай функцию, которая принимает массив строк и строку для поиска. Функция должна находить в массиве элемент, в котором принятая строка является подстрокой (метод contains()). Распечатай найденный элемент.

}