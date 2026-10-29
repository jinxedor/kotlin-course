package kotlincourse.lessons.lesson14.Homework

fun main() {
    val party = Party("My house", 11)
    party.details()

    val emotion = Emotion("Happy", 5)

    Moon.showPhase()

    val Knife = Product("Knife", 30, 1)

    val concert = Concert("The Beabels", "Madison Square Garden", 15, 243)
    concert.ConcertInfo()
    concert.buyTicket()
    concert.ConcertInfo()
}

//Событие: вечеринка. Создайте класс Party, который описывает вечеринку. У него должны быть свойства location (String) и attendees (Int).
// Добавьте метод details(), который выводит информацию о месте проведения и количестве гостей.
class Party(
    val location: String,
    val attendees: Int,
) {
    fun details() {
        println("Location: $location, Attendees: $attendees")
    }
}

//Аспект реальности: эмоция. Создайте класс Emotion, который представляет эмоцию. У него должно быть свойство type (String) и intensity (Int).
// Добавьте метод express(), который выводит описание эмоции в зависимости от её типа и интенсивности.
class Emotion(
    val type: String,
    val intensity: Int,
) {
    fun express() {
        val degree = when {
            intensity <= 3 -> "slightly"
            intensity <= 7 -> "moderately"
            else -> "very"
        }
        println("I feel $degree ${type.lowercase()} (intensity: $intensity)")
    }
}

//Природное явление: луна. Создайте объект Moon, который будет представлять Луну.
// Добавьте свойства isVisible (Boolean), чтобы отображать, видна ли Луна в данный момент, и phase (String),
// чтобы отображать текущую фазу Луны (например, "Full Moon", "New Moon"). Добавьте метод showPhase(), который выводит текущую фазу Луны.
object Moon {
    var isVisible: Boolean = true
    var phase: String = "New Moon"
    fun showPhase() {
        when {
            isVisible -> println("The moon is in $phase phase")
            else -> println("The moon is not there to present itself")
        }
    }
}


//Покупка: продукт. Создайте дата класс для продукта, который будет представлять продукт в магазине.
// У него должны быть свойства “название”, “цена”, “количество”.
data class Product(
    val name: String,
    val price: Int,
    val quantity: Int
)

//Мероприятие: концерт. Создайте класс, который будет представлять концерт.
// У него должны быть свойства “группа”, “место проведения”, “стоимость”, “вместимость зала”. Также приватное поле “проданные билеты”.
// Добавьте метод, который выводит информацию о концерте и метод “купить билет”, который увеличивает количество проданных билетов на один.

class Concert(
    val band: String,
    val place: String,
    val ticketPrice: Int,
    val placeCapacity: Int,
) {
    private var soldTickets: Int = 0
    fun ConcertInfo() {
        println(
            "Today's guest: $band. " +
                    "We're waiting you at $place, entry tickets just for $ticketPrice dollars. " +
                    "Remaining seats: ${placeCapacity - soldTickets}"
        )
    }

    fun buyTicket() {
        if (soldTickets < placeCapacity) {
            soldTickets++
        }
    }
}