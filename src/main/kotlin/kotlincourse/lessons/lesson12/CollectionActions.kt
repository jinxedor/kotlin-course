package kotlincourse.lessons.lesson12

val numbers = listOf(-1, 2, -3, 4, -5, 8, 264)

fun main() {

    val positive = mutableListOf<Int>()

    for (i in numbers) {
        val isPositive = i > 0
        if (isPositive) {
            positive.add(i)
        }
    }

    // Функция forEach работает как цикл, перебирая каждый элемент коллекции, помещая его в специальную переменную 'it'
    // и выполняет блок кода с каждым элементом коллекции.
    numbers.forEach {
        // it - это специальная переменная в Kotlin для
        // хранения значения коллекции из текущей итерации
        val isPositive = it > 0
        if (isPositive) {
            positive.add(it)
        }
    }

    listOf(-1, 2, -3, 4, -5, 8, 264)
        .map { it * 2 } // узнать что оно делает

    //Когда мы работаем со списками в Kotlin и хотим выбрать из них определённые элементы, мы используем специальные методы, такие как filter.
    // Этот метод позволяет задать правило, по которому элементы будут отбираться. Рассмотрим два примера:
    fun filter(collection: List<Int>): List<Int> {
        val result = mutableListOf<Int>()
        for (i in collection) {
            if (i in 7..17) result.add(i)
        }
        return result
    }

    val list = listOf(8, 56, 23, 87, 12, 18, 11)
    val filtered1 = filter(list)
    println(filtered1)

    val filtered2 = listOf(8, 56, 23, 87, 12, 18, 11).filter {
        it in 7..17
    }
    println(filtered2)

    fun MyFilter(collection: List<Int>): List<Int> { // Custom function from Alexander without using .filter
        val result = mutableListOf<Int>()
        for (i in collection) {
            if (i in 7..17) result.add(i)
        }
        return result
    }

    val positiveNumbers =
        numbers.filter { it > 0 } // Alternative for the first block of code in the beginning. The point of the lesson to use filters.
    println(positiveNumbers) // Вывод: [2, 4]

//Похож на filter, но выбирает элементы, которые не соответствуют условию.
//Пример: Выбрать только те числа, которые не положительные (то-есть отрицательные).
    val notPositiveNumbers = numbers.filterNot { it > 0 }
    println(notPositiveNumbers) // Вывод: [-1, -3, -5]

//filterNotNull
//Используется для отбрасывания всех null значений из коллекции.
//Пример: Удалить null элементы из списка.
    val nullableList = listOf(1, null, 2, null, 3)
    val nonNullList = nullableList.filterNotNull()
    println(nonNullList) // Вывод: [1, 2, 3]

    //В массивах и списках мы можем взять первый элемент списка по индексу 0.
    // В множествах set нет индексов, но иногда бывает нужно взять первый элемент множества. Для этого можно использовать метод first().

    //Так же бывает необходимость взять последний элемент коллекции.
    // В массивах и списках порой нужно вычислять индекс последнего элемента, что не очень удобно, а в множествах индексов и вовсе нет.
    // Эту задачу легко решает метод last().
    val setOfNumbers = setOf(3, 4, 5, -5, 14)
    val firstElement = setOfNumbers.first()
    val lastElement = setOfNumbers.last()
    println(firstElement)
    println(lastElement)

//Получение элемента с условием что его может не быть

//firstOrNull и getOrElse
//firstOrNull или lastOrNull возвращает первый или последний элемент, который соответствует условию, или null, если такого элемента нет.
//getOrElse возвращает элемент по индексу или значение по умолчанию, если индекс вне диапазона списка.
    val firstPositive = numbers.firstOrNull { it > 0 }
    println(firstPositive) // Вывод: 2
    val nullable = numbers.firstOrNull { it > 1000 }
    println(nullable) // Вывод: null
    val elementOrElse = numbers.getOrElse(10) { -1 }
    println(elementOrElse) // Вывод: -1

//Преобразование коллекций

//map
//Преобразует каждый элемент коллекции согласно заданной функции.
//Пример: Увеличить каждое число в списке на 1.
    val incrementedNumbers = numbers.map { it + 1 }
    println(incrementedNumbers) // Вывод: [0, 3, -2, 5, -4, 9, 265]

//associate
//Создает словарь (Map) из списка, используя предоставленную функцию для генерации ключей.
//Пример: Создать словарь, где каждому числу соответствует его квадрат.
    val numberSquareMap = numbers.associate { it to it * it }
    println(numberSquareMap) // Вывод: {-1=1, 2=4, -3=9, 4=16, -5=25, 8=64, 264=69696}

//flatten
//Склеивает каждую коллекцию в коллекции между собой в одну общую коллекцию.
    val multipleList = listOf(
        listOf(1, 2, 3),
        listOf(4, 5, 6)
    )
    val flattenList = multipleList.flatten()
    println(flattenList)

//flatMap
//Выполняет одновременно преобразование вложенных коллекций и склеивание в одну общую коллекцию.
    val flattenListAfterMapping = multipleList.flatMap { list ->
        list.map { it * 2 }
    }
    println(flattenListAfterMapping)

//joinToString
//Преобразует все элементы коллекции в строки и объединяет их в одну строку с заданным разделителем.
//По умолчанию используется разделитель запятая с пробелом - ", ".
//Пример: Преобразовать список чисел в строку, разделенную двоеточием.
    val numbersString = numbers.joinToString(separator = " : ")
    println(numbersString) // Вывод: "-1 : 2 : -3 : 4 : -5 : 8 : 264"


//Сортировка Коллекций

//sorted
//сортирует элементы коллекции в возрастающем порядке.
    val sortedNumbers = numbers.sorted()
    println(sortedNumbers) // Вывод: [-5, -3, -1, 2, 4, 8, 264]


//sortedDescending
//сортирует элементы в убывающем порядке.
    val sortedDescendingNumbers = numbers.sortedDescending()
    println(sortedDescendingNumbers) // Вывод: [264, 8, 4, 2, -1, -3, -5]


//Длина коллекции
//size возвращает длину коллекции.
    println(numbers.size)

//Удаление элементов коллекции
    val elements = mutableListOf(23, 6, 76, 4)

    elements.remove(6) // удалит объект 6 из списка или множества
    elements.removeAt(1) // удалит объект с индексом 3 (работает только со списком)

//Проверка коллекции

//isEmpty
//Проверяет, является ли коллекция пустой

    if (numbers.isEmpty()) {
        println("Коллекция пуста")
    } else {
        println("В коллекции ${numbers.size} значений")
    }
//isNotEmpty
//Проверяет, что коллекция не пустая. Команда противоположна предыдущей.

//contains
//Проверяет, что коллекция содержит нужный элемент.

    if (numbers.contains(42)) {
        println("Коллекция содержит ответ на главный вопрос")
    } else {
        println("В коллекции нет ответа на главный вопрос")
    }
//Так же можно использовать оператор in

    if (42 in numbers) {
        println("Коллекция содержит ответ на главный вопрос")
    } else {
        println("В коллекции нет ответа на главный вопрос")
    }

//containsAll
//Проверяет вхождение одной коллекции в другую
    if (setOfNumbers.containsAll(listOf(4, 3))) {
        println("Коллекция содержит числа 4 и 3, при этом порядок не имеет значения")
    } else {
        println("В коллекции нет одного из чисел либо всех проверяемых чисел")
    }

//Другие полезные методы

//sum
//sum возвращает сумму всех элементов списка чисел.
    val sumOfNumbers = numbers.sum()
    println(sumOfNumbers) // Вывод: 269

//average
//возвращает среднее значение элементов списка чисел.
    val averageOfNumbers = numbers.average()
    println(averageOfNumbers) // Вывод: 38.42857142857143

//maxOrNull и minOrNull
//maxOrNull возвращает максимальный элемент списка или null, если список пуст.
//minOrNull возвращает минимальный элемент или null.
    val maxNumber = numbers.maxOrNull()
    println(maxNumber) // Вывод: 264
    val minNumber = numbers.minOrNull()
    println(minNumber) // Вывод: -5

//groupBy
//Группирует элементы коллекции по заданному критерию.
//Пример: Группировка чисел по положительным и отрицательным.
    val groupedBySign = numbers.groupBy { if (it > 0) "Positive" else "Negative" }
    println(groupedBySign) // Вывод: {Negative=[-1, -3, -5], Positive=[2, 4, 8, 264]}

//distinct
//Возвращает список, содержащий только уникальные элементы из исходного списка.
    val distinctNumbers = listOf(1, 2, 2, 3, 3, 3, 4).distinct()
    println(distinctNumbers) // Вывод: [1, 2, 3, 4]

//take
//Возвращает первые n элементов списка
    println(numbers.take(3)) // Вывод: [-1, 2, -3]

//takeLast
//Возвращает последние n элементов
    println(numbers.takeLast(3)) // Вывод: [-5, 8, 264]

//drop
//Возвращает всю коллекцию за исключением первых нескольких элементов
    println(numbers.drop(2)) // [-3, 4, -5, 8, 264]

//PRACTICE

//    Задачи на приведение коллекции к значению
//            Проверить, что размер коллекции больше 5 элементов.
    val ex1 = listOf(1, 2, 3, 4, 5, 6)
    println(ex1.size > 5)

//    Проверить, что коллекция пустая
    println(ex1.isEmpty())

//    Проверить, что коллекция не пустая
    println(ex1.isNotEmpty())

//    Взять элемент по индексу или создать значение если индекса не существует
    println(ex1.getOrElse(1) { 123 })

//    Собрать коллекцию в строку
    println(ex1.joinToString())
//            Посчитать сумму всех значений
    println(ex1.sum())
//            Посчитать среднее
    println(ex1.average())
//            Взять максимальное число
    println(ex1.maxOrNull())
//    Взять минимальное число
    println(ex1.minOrNull())
//    Взять первое число или null
    println(ex1.firstOrNull())
//    Проверить что коллекция содержит элемент
    println(ex1.contains(1443))
    println(2 in ex1)

//    Задачи на обработку коллекций
//            Отфильтровать коллекцию по диапазону 18-30
    val filter13 = ex1.filter { it in 18..30 }

//   Выбрать числа, которые не делятся на 2 и 3 одновременно
    //   ex1.filter { it % 2 != 0 && it % 3 != 0 }
    ex1.filterNot { it % 6 == 0}
//    Очистить текстовую коллекцию от null элементов
    val ex2 = listOf("text", null)
    ex2.filterNotNull()
//            Преобразовать текстовую коллекцию в коллекцию длин слов
    val ex3 = ex2.filterNotNull().map{it.length}
    val ex4 = ex2.mapNotNull{it?.length}

//    Преобразовать текстовую коллекцию в мапу, где ключи - слова, а значения - перевёрнутые слова
    val ex5 = listOf("text","warn", "text2")
    ex5.associate {it to it.reversed()}
    ex5.associateWith { it.reversed() } //alt

//    Отсортировать список в алфавитном порядке
    ex5.sorted()

//    Отсортировать список по убыванию
    ex5.sortedDescending()
//            Распечатать квадраты элементов списка
    ex1.forEach {
        print("-----")
        println(it*it)
        print("-----")
    }
//            Группировать список по первой букве слов
    println(ex5.groupBy {
        it[0]
    }
    )

//            Очистить список от дублей
    ex5.distinct()
//            Взять первые 3 элемента списка
    ex5.take(3)
//    Взять последние 3 элемента списка
    ex5.takeLast(3)
}