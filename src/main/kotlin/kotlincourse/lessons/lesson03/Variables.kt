package kotlincourse.lessons.lesson03

//will be mutable?
//do we need to initialize it right away? - if not lateinit
//initialize value, if needed
//do we need a delay before initialization -> if yes -> by lazy?
//clear naming: fun -> action, variable -> data
//commented params -> bad practice

//practice
//car number
val shassi: String = "S6767V0" // cannot be changed

//auto colour
lateinit var colour: String //can be re-coloured

//auto mileage
var mileage: Double = 0.0

// owner name
lateinit var ownerName: String

//wheel number
const val wheelNumber: Int = 4

//detailed report for auto utilisation
val utilisationInfo: String by lazy {
    "oh well"
}




val name: String = "Anton" // immutable, can be calculated at runtime
var age: Int = 26 //mutable

//lateinit var only
lateinit var phoneNumber: String

//lazy initialization

val lazyValue: String by lazy {
    Thread.sleep(200)
    "Hello, this is a lazy string!"
}

const val PI: Double = 3.14 //only primitive

//getters & setters
var count: Int = 0
    get() {
        return if (field > 190) field else 0
    }
    set(value) {
        if (field >= 0) field = value
    }

fun test() {
    println(name)
    println(age)
    age = 190
    println(age)
    // phoneNumber = "855855"
    println(phoneNumber)
    println(lazyValue)
    println(lazyValue)


}