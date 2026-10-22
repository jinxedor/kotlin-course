package kotlincourse.lessons.lesson14

import kotlincourse.lessons.lesson14.Person1.Calculator
import kotlincourse.lessons.lesson14.Person1.Carriage
import kotlincourse.lessons.lesson14.Person1.Passenger
import kotlincourse.lessons.lesson14.Person1.Train
import kotlincourse.lessons.lesson14.Person1.User
import java.time.LocalDate
import java.time.Period

fun main() {

    val person = Person("John", 30)
    person.sayHello()
}

//Основная структура класса в Kotlin
// В Kotlin класс объявляется с использованием ключевого слова class. Внутри класса могут быть поля (свойства) и методы (функции).
// Пример базового класса:
class Person1(
    val name: String,
    var age: Int
) {
    // Метод класса
    fun sayHello() {
        println("Hello, my name is $name and I am $age years old.")
    }


    //Конструктор класса
    //Конструктор используется для объявления полей, значения которым необходимо задать в момент инициализации объекта этого класса.
    // Первичный конструктор определяется в круглых скобках сразу после названия класса и содержит в себе перечисление полей с типами через запятую.\
    class Passenger(
        val name: String,
        private val dateOfBirth: String,
        private var phone: String
    ) {
        private var age: Int = calculateAge()
        private fun calculateAge(): Int {
            return Period.between(
                LocalDate.parse(dateOfBirth),
                LocalDate.now()
            ).years
        }

        fun recalculateAge() {
            age = calculateAge()
        }
    }

    class Carriage(
        val capacity: Int,
        val type: String = "Плацкарт"
    ) {
        private val passengers = mutableMapOf<Int, Passenger>()
        fun boardPassenger(passenger: Passenger, seat: Int) {
            if (passengers.size < capacity) {
                passengers[seat] = (passenger)
            }
        }

        fun passengerGetOff(seat: Int) {
            passengers.remove(seat)
        }
    }

    class Train(
        val engineType: String
    ) {
        val carriages = mutableListOf<Carriage>()
        fun boardPassenger(
            passenger: Passenger,
            seat: Int,
            carriageType: String
        ) {
            // логика для размещения пассажира
        }
    }


    //Object
// object в Kotlin используется для создания синглтонов, то есть классов, которые могут иметь только один экземпляр.
// Это удобно, когда вам нужен глобальный объект, например, менеджер конфигурации или логгер.
    object Logger {
        fun log(message: String) {
            println("Log: $message")
        }
    }


    // Companion object
    // Если вам необходимо создать что-то похожее на статическое поле или метод (как в Java), в Kotlin используется companion object.
    // Он позволяет объявить статические методы и переменные, которые принадлежат самому классу, а не конкретному его экземпляру:
    class Calculator {
        companion object {
            fun add(a: Int, b: Int): Int {
                return a + b
            }
        }
    }
    //Data class
    // data class — это специальный вид классов в Kotlin, который предназначен для хранения данных.
    // Они автоматически предоставляют полезные функции, такие как toString(), equals(), hashCode(), и copy(). Пример:

    data class User(val id: Int, val name: String)

    //data class автоматически генерирует полезные методы.
    //Функция copy() позволяет легко создавать копии объектов, меняя нужные поля.

    fun main() {
        val reservedSeatCarriage = Carriage(48)
        val compartmentCarriage = Carriage(16, "Купе")
        val train = Train("Electric locomotive")
        train.carriages.add(reservedSeatCarriage)
        train.carriages.add(compartmentCarriage)
        val passengerAlexandr = Passenger("Alexandr", "02.10.1983", "")
        train.boardPassenger(passengerAlexandr, 10, "Купе")

        //Здесь Logger — это синглтон, и его методы доступны без создания экземпляра.
        Person1.Logger.log("Application started")


        //Companion object
        val result = Calculator.add(5, 3)
        println("Result: $result")

        //data class
        val user1 = User(1, "Alice")
        val user2 = user1.copy(name = "Bob")
        println(user1) // Output: User(id=1, name=Alice)
        println(user2) // Output: User(id=1, name=Bob)
        val lamp = Lamp (true)
        lamp.toggle()
    }
//practice
    //Физический предмет: Лампа Создайте класс Lamp, который будет представлять лампу.
// У лампы должно быть свойство isOn (Boolean), которое показывает, включена ли лампа.
// Добавьте метод toggle(), который меняет состояние лампы (включает или выключает её).

    class Lamp (var isOn: Boolean) {
        fun toggle() {
            isOn = !isOn
            val state = if (isOn) "on" else "off"
            println("The lamp is $state")
        }
    }
}