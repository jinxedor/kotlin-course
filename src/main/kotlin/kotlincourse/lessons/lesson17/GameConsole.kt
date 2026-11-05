package kotlincourse.lessons.lesson17

//Игровая Консоль
//Создайте класс GameConsole с публичным методом startGame(gameName: String).
// Внутри класса определите приватные методы initializeHardware() и loadGame(gameName: String),
// которые автоматически выполняются при вызове startGame(gameName).
// Пользователь не должен вызывать инициализацию аппаратного обеспечения и загрузку игры напрямую.

class GameConsole {
    fun startGame(gameName: String) {
        loadGame(gameName)
    }
    private fun initializeHardware() {
        println("Engine started.")

    }
    private fun loadGame(gameName: String) {
        initializeHardware()
        println("Game loaded from $gameName!!")
    }
}

fun main() {
    val gameConsole = GameConsole()
    gameConsole.startGame("Mamasita")
}