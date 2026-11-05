package kotlincourse.lessons.lesson16.homework

import kotlin.math.PI
import kotlin.math.sin

// ANSI-цвета для консоли
object Ansi {
    const val RESET = "\u001B[0m"

    const val BLACK = "\u001B[30m"
    const val RED = "\u001B[31m"
    const val GREEN = "\u001B[32m"
    const val YELLOW = "\u001B[33m"
    const val BLUE = "\u001B[34m"
    const val MAGENTA = "\u001B[35m"
    const val CYAN = "\u001B[36m"
    const val WHITE = "\u001B[37m"

    const val BG_BLACK = "\u001B[40m"
    const val BG_RED = "\u001B[41m"
    const val BG_GREEN = "\u001B[42m"
    const val BG_YELLOW = "\u001B[43m"
    const val BG_BLUE = "\u001B[44m"
    const val BG_MAGENTA = "\u001B[45m"
    const val BG_CYAN = "\u001B[46m"
    const val BG_WHITE = "\u001B[47m"
}


// ПЕРЕОПРЕДЕЛЕНИЕ МЕТОДОВ


// Животные и их звуки
// Базовый класс: Animal с методом makeSound().
//Классы наследники: Dog, Cat, Bird.
//Базовый метод makeSound() в классе Animal выводит "This animal makes no sound."
//Переопределите метод makeSound() в каждом классе-наследнике, чтобы Dog выводил "Bark", Cat - "Meow", Bird - "Tweet". Обогати вывод звуков цветом.
//Создайте список животных List<Animal> и вызовите в цикле метод makeSound()
open class Animal {
    open fun makeSound() {
        println("This animal makes no sound.")
    }
}

class Dog : Animal() {
    override fun makeSound() {
        println("${Ansi.YELLOW}Bark${Ansi.RESET}")
    }
}

class Cat : Animal() {
    override fun makeSound() {
        println("${Ansi.MAGENTA}Meow${Ansi.RESET}")
    }
}

class Bird : Animal() {
    override fun makeSound() {
        println("${Ansi.CYAN}Tweet${Ansi.RESET}")
    }
}

fun animalsDemo() {
    println("=== Animals ===")
    val animals: List<Animal> = listOf(Animal(), Dog(), Cat(), Bird())
    for (animal in animals) {
        animal.makeSound()
    }
}

// Геометрические фигуры
//Абстрактный (базовый) класс: Shape с open методом area().
//Классы наследники: Circle, Square, Triangle.
//Метод area() возвращает 0.0.
//Переопределите метод area() в каждом классе-наследнике для расчета площади соответствующей фигуры.
//Подсказка: каждый класс должен иметь аргументы конструктора, позволяющие вычислить площадь (для круга это радиус, для квадрата это сторона,
//для треугольника это две стороны и угол между ними)
//Создай набор геометрических фигур и выведи в цикле их площадь

open class Shape {
    open fun area(): Double = 0.0
}

class Circle(private val radius: Double) : Shape() {
    override fun area(): Double = PI * radius * radius
}

class Square(private val side: Double) : Shape() {
    override fun area(): Double = side * side
}

// Треугольник: две стороны и угол между ними (в градусах)
class Triangle(
    private val sideA: Double,
    private val sideB: Double,
    private val angleDegrees: Double,
) : Shape() {
    override fun area(): Double = 0.5 * sideA * sideB * sin(Math.toRadians(angleDegrees))
}

fun shapesDemo() {
    println("\n=== Shapes ===")
    val shapes: List<Shape> = listOf(
        Shape(),
        Circle(2.0),
        Square(3.0),
        Triangle(3.0, 4.0, 90.0),
        Triangle(5.0, 5.0, 60.0),
    )
    for (shape in shapes) {
        println("${shape::class.simpleName}: %.2f".format(shape.area()))
    }
}

//Принтеры Создай абстрактный принтер, который имеет абстрактный метод печати, принимающий в качестве аргумента строку.
//Создай классы наследники: лазерный и струйный
//Лазерный принтер должен разбивать фразу на слова по пробелу и выводить каждое слово отдельно чёрными буквами на белом фоне (хорошо работает на тёмной теме)
//Струйный принтер должен разбивать фразу на слова по пробелу и выводить каждое слово отдельно цветными буквами на цветном фоне.
// Слова должны быть разноцветны. Можно сделать список пар с цветом текста и фона и проходить циклически по этому списку при выводе текста.
// Проверить работу на длинном тексте
abstract class Printer {
    abstract fun print(text: String)
}

class LaserPrinter : Printer() {
    override fun print(text: String) {
        for (word in text.split(" ")) {
            println("${Ansi.BLACK}${Ansi.BG_WHITE}$word${Ansi.RESET}")
        }
    }
}

class InkjetPrinter : Printer() {
    // Пары: цвет текста и цвет фона
    private val palette = listOf(
        Ansi.RED to Ansi.BG_WHITE,
        Ansi.GREEN to Ansi.BG_BLACK,
        Ansi.YELLOW to Ansi.BG_BLUE,
        Ansi.WHITE to Ansi.BG_MAGENTA,
        Ansi.BLACK to Ansi.BG_CYAN,
        Ansi.BLUE to Ansi.BG_YELLOW,
    )

    override fun print(text: String) {
        for ((index, word) in text.split(" ").withIndex()) {
            val (textColor, backgroundColor) = palette[index % palette.size]
            println("$textColor$backgroundColor$word${Ansi.RESET}")
        }
    }
}

fun printersDemo() {
    println("\n=== Printers ===")
    val longText = "Polymorphism lets us treat objects of different classes through " +
            "a common interface while each class keeps its own behavior " +
            "so the same call can produce different results"

    val printers: List<Printer> = listOf(LaserPrinter(), InkjetPrinter())
    for (printer in printers) {
        println("--- ${printer::class.simpleName} ---")
        printer.print(longText)
    }
}


//ПЕРЕГРУЗКА МЕТОДОВ


//Корзина товаров
//Класс “Корзина товаров”: содержит поле словаря из ID товаров и их количества.
//Базовый метод addToCart(itemId) добавляет одну единицу товара к уже существующим в корзине.
//Выполнить перегрузку addToCart который:
//Принимает два аргумента (itemId и количество amount)
//Принимает словарь из id и количества и добавляет всё в корзину
//Принимает список из id (добавляет по одной единице).
//Учесть, что если товар уже есть в корзине, нужно увеличить его количество, если нет - добавить.
//Попробуй создать корзину и положить в неё товар разными способами, потом распечатать корзину в консоль.
//Переопредели у корзины метод toString для красивого форматирования содержимого таблицы,
// включая итоговое количество артикулов и общее количество всего товара в корзине.
class Cart {
    private val items = mutableMapOf<Int, Int>()

    // Базовый метод: одна единица товара
    fun addToCart(itemId: Int) {
        addToCart(itemId, 1)
    }

    // Товар и количество
    fun addToCart(itemId: Int, amount: Int) {
        items[itemId] = (items[itemId] ?: 0) + amount
    }

    // Словарь id -> количество
    fun addToCart(newItems: Map<Int, Int>) {
        for ((id, amount) in newItems) {
            addToCart(id, amount)
        }
    }

    // Список id: по одной единице каждого
    fun addToCart(ids: List<Int>) {
        for (id in ids) {
            addToCart(id)
        }
    }

    override fun toString(): String = buildString {
        val line = "+-----------+----------+"
        appendLine(line)
        appendLine(String.format("| %-9s | %8s |", "Item ID", "Quantity"))
        appendLine(line)
        for ((id, quantity) in items.toSortedMap()) {
            appendLine(String.format("| %-9d | %8d |", id, quantity))
        }
        appendLine(line)
        appendLine(String.format("| %-9s | %8d |", "Articles", items.size))
        appendLine(String.format("| %-9s | %8d |", "Total", items.values.sum()))
        append(line)
    }
}

fun cartDemo() {
    println("\n=== Cart ===")
    val cart = Cart()
    cart.addToCart(101)                                  // одна единица
    cart.addToCart(102, 3)                               // товар и количество
    cart.addToCart(mapOf(103 to 2, 101 to 4))            // словарь
    cart.addToCart(listOf(104, 102, 104, 104))           // список id
    println(cart)
}

// Логгер
//Класс “Логгер”: представляет из себя инструмент для вывода информации в консоль с разным префиксами уровня логирования (INFO, WARNING, ERROR, DEBUG)
//Базовый метод log(message) выводит в консоль сообщение message с префиксом INFO
//Выполнить перегрузку метода log, который:
//Принимает уровень логирования и сообщение. Выводит сообщения типа WARNING жёлтым цветом, а ERROR белым цветом на красном фоне.
//Принимает список сообщений и все их выводит с уровнем INFO
//Принимает объект типа Exception и выводит его поле message с префиксом уровня ERROR
//Попробуй создать логгер и добавить в него сообщения разными способами. Проверь вывод в консоли.

enum class LogLevel { INFO, WARNING, ERROR, DEBUG }

class Logger {
    // Базовый метод: уровень INFO
    fun log(message: String) {
        log(LogLevel.INFO, message)
    }

    // Уровень и сообщение
    fun log(level: LogLevel, message: String) {
        val text = "[$level] $message"
        when (level) {
            LogLevel.WARNING -> println("${Ansi.YELLOW}$text${Ansi.RESET}")
            LogLevel.ERROR -> println("${Ansi.WHITE}${Ansi.BG_RED}$text${Ansi.RESET}")
            else -> println(text)
        }
    }

    // Список сообщений: все с уровнем INFO
    fun log(messages: List<String>) {
        for (message in messages) {
            log(message)
        }
    }

    // Исключение: поле message с уровнем ERROR
    fun log(exception: Exception) {
        log(LogLevel.ERROR, exception.message ?: "Unknown error")
    }
}

fun loggerDemo() {
    println("\n=== Logger ===")
    val logger = Logger()
    logger.log("Application started")
    logger.log(LogLevel.WARNING, "Disk space is running low")
    logger.log(LogLevel.ERROR, "Failed to connect to database")
    logger.log(LogLevel.DEBUG, "Cache size = 42")
    logger.log(listOf("Loading config", "Config loaded", "Server is ready"))
    logger.log(IllegalStateException("Something went wrong"))
}

fun main() {
    animalsDemo()
    shapesDemo()
    printersDemo()
    cartDemo()
    loggerDemo()
}