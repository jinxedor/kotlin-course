package kotlincourse.lessons.lesson17


// Банкомат
//Написать класс счёта, в котором можно пополнять, проверять и списывать с баланса только при предоставлении корректного пин кода.
// Также можно выполнять смену пинкода. В случае неудачной проверки, выбрасываем ошибку.
// Количество неверно введённых пинкодов 3, после чего проверка всегда будет заканчиваться ошибкой.
// Если пин введён верно, то счётчик попыток сбрасывается.

class ATM {
    /*
    balance private
    private pin
    fun getBalance by Pin
     */
    private var balance: Double = 0.1
    private var pin: String = "0000"

    fun getBalance(pin: String): Double {
        if (this.pin == pin) {
            return balance
        }
        return 0.0
    }
}