package kotlincourse.lessons.lesson10.homework

fun main() {

//1. Создайте пустой неизменяемый словарь, где ключи и значения - целые числа.
    val m1: Map<Int, Int> = emptyMap()
    println(m1)

    println("---------")

//2. Создайте словарь, инициализированный несколькими парами "ключ-значение", где ключи - float, а значения - double
    val m2: Map<Float, Double> = mapOf(13.2442F to 1.1, 44.222F to 16.22)
    println(m2)

    println("---------")

//3. Создайте изменяемый словарь, где ключи - целые числа, а значения - строки.
    val m3: MutableMap<Int, String> = mutableMapOf()
    println(m3)

    println("---------")

//4. Имея изменяемый словарь, добавьте в него новые пары "ключ-значение".
    m3.put(2, "No")
    println(m3)

    println("---------")

//5. Используя словарь из предыдущего задания, извлеките значение, используя ключ. Попробуй получить значение с ключом, которого в словаре нет.
    val m3_1 = m3[4]
    println(m3_1)

    println("---------")

//6. Удалите определенный элемент из изменяемого словаря по его ключу.

    m3.remove(2)
    println(m3)

    println("---------")

//7. Создайте словарь (ключи Double, значения Int) и выведи в цикле результат деления ключа на значение.
// Не забудь обработать деление на 0 (в этом случае выведи слово “бесконечность”)
    val m4: Map<Double, Int> = mapOf(7.5 to 12, 84.4 to 67, 43.1 to 9)
    for ((key, value) in m4) {
        if (value == 0) {
            println("$key / $value = бесконечность")
        } else {
            println("$key / $value = ${key / value}")
        }
    }

    println("---------")

//8. Измените значение для существующего ключа в изменяемом словаре.
    m3[2] = "Maybe"
    println(m3)

    println("---------")

//9. Создайте два словаря и объедините их в третьем изменяемом словаре через циклы.
    val m5: Map<String, Int> = mapOf("Hi" to 6, "Hello" to 7)
    val m5_1 = mapOf("Bye" to 8, "Goodbye" to 9)
    val m5_2: MutableMap<String, Int> = mutableMapOf()
    for ((key, value) in m5) {
        m5_2[key] = value
    }
    for ((key, value) in m5_1) {
        m5_2[key] = value
    }
    println(m5_2)

    println("---------")

//10. Создайте словарь, где ключами являются строки, а значениями - списки целых чисел. Добавьте несколько элементов в этот словарь.
    val m6: MutableMap<String, List<Int>> = mutableMapOf()
    m6["Oh"] = listOf(13, 22, 511, 0)
    m6["My"] = listOf(52, 97, 3, 666)
    println(m6)

    println("---------")

//11. Создай словарь, в котором ключи - это целые числа, а значения - изменяемые множества строк. Добавь данные в словарь.
    // Получи значение по ключу (это должно быть множество строк) и добавь в это множество ещё строку. Распечатай полученное множество.
    val m7: MutableMap<Int, MutableSet<String>> = mutableMapOf()
    m7[1] = mutableSetOf("qqq", "www")
    m7[2] = mutableSetOf("rrr", "ttt", "yyy")
    println(m7)
    val m7Set = m7[1]
    m7Set?.add("eee")
    println(m7Set)

    println("---------")

//12. Создай словарь, где ключами будут пары чисел. Через перебор найди значение у которого пара будет содержать цифру 5 в качестве первого или второго значения.
    val m8: MutableMap<List<Int>, String> = mutableMapOf(listOf(6, 5) to "zxc", listOf(2, 11) to "vbn")
    for ((key, value) in m8) {
        for (element in key)
            if (element == 5)
                println(value)
    }
    println("---------")

//Задачи на подбор оптимального типа для словаря

//1. Словарь библиотека: Ключи - автор книги, значения - список книг
    val m9: MutableMap<String, MutableSet<String>> = mutableMapOf("Dune" to mutableSetOf("Part 1", "Part 2"))
    println(m9)

    println("---------")

//2. Справочник растений: Ключи - типы растений (например, "Цветы", "Деревья"), значения - списки названий растений
    val m10: MutableMap<String, MutableList<String>> =
        mutableMapOf("Деревья" to mutableListOf("Осина", "Береза"), "Цветы" to mutableListOf("Ирис", "Ваниль"))
    println(m10)

    println("---------")

//3. Четвертьфинала: Ключи - названия спортивных команд, значения - списки игроков каждой команды
    val m11: MutableMap<String, MutableList<String>> = mutableMapOf(
        "Не фанат" to mutableListOf("Дядя", "Еще дядя"),
        "Не нравится" to mutableListOf("Дядя", "Еще дядя")
    )
    println(m11)

    println("---------")

//4. Курс лечения: Ключи - даты, значения - список препаратов принимаемых в дату
    val m12: MutableMap<String, MutableList<String>> =
        mutableMapOf(
            "08.10.2026" to mutableListOf("Atarax", "Zoloft"),
            "09.10.2026" to mutableListOf("Anafranil", "Kombilipen")
        )
    println(m12)

    println("---------")

//5. Словарь путешественника: Ключи - страны, значения - словари из городов со списком интересных мест.
    val m13: MutableMap<String, MutableMap<String, MutableList<String>>> = mutableMapOf(
        "France" to mutableMapOf("Paris" to mutableListOf("Arc de Triomphe", "Eiffel Tower")),
        "Japan" to mutableMapOf("Tokio" to mutableListOf("Shibuya Sky", "Azabudai Hills"))
    )
    println(m13)
}