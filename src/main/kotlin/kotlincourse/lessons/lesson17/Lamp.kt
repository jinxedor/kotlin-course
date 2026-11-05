package kotlincourse.lessons.lesson17

//Инкапсуляция полей
//Класс "Лампа": Разработайте класс Lamp с приватными полями isOn (включена ли лампа) и публичными методами turnOn() и turnOff()
// для управления состоянием лампы.

class Lamp() {
    var isTurnedOn = false
        private set
    fun turnOn() {
        isTurnedOn = true
    }

    fun turnOff() {
        isTurnedOn = false
    }

    fun getIsTurnedOn(): Boolean {
        return isTurnedOn

    }
}