package kotlincourse.lessons.lesson05.homework

////Simple operators
//
//(14 - 4 <= 10) || (6 / 2 != 3)
//true || false
//true
//
//(9 + 1 == 10) && (8 % 2 == 0)
//true && true
//true
//
//(7 - 2 < 5) || (4 * 3 != 12)
//false || false
//false
//
//(18 / 6 >= 3) && (5 + 5 == 10)
//true && true
//true
//
//(11 % 3 != 2) || (9 - 3 == 6)
//false || true
//true
//
//(5 * 2 < 11) && (14 / 2 == 7)
//true && true
//true
//
//(8 + 2 <= 10) || (7 % 2 != 1)
//true || true
//true
//
//(16 / 4 > 3) && (3 + 4 == 7)
//true && true
//true
//
//(10 % 2 == 0) || (5 - 3 != 1)
//true || true
//true
//
//// Operators with priority
//
//7 - 2 * (2 + 3) / 5 + 3 * 2
//7 - 1 + 6 = 12
//
//7 - 2 * 2 + 3 / 3 + 5 * 2
//7 - 4 + 1 + 10 = 14
//
//((4 * 3) < 13) && !(8 / 4 == 2) || (10 % 3 != 1)
//true && false || false
//false
//
//(((14 - 5) > 8) || (9 / 3 == 3)) && !(7 + 0 != 7)
//(true || true) && true
//true
//
//((2 + 3) <= 5) && (16 / 4 == 4) || !(6 % 2 == 0)
//true && true || false
//true
//
//
//// Operators with increment/decrement
//
//(var f = 6; --f >= 5) || ((3 * 2 == 6) && (9 - 4 != 5))
//true || true && false
//true
//
//(var g = 0; g++ != 0) && !((4 + 2 == 6) || (5 / 1 == 5))
//false && !(true || true)
//false && false
//false
//
//!(var h = 7; h-- > 6) || (8 + 1 == 9) && (3 % 2 != 1)
//true || true && false
//true
//
//((var i = 5; i++ == 5) || (2 * 2 != 4)) && (10 / 2 == 5)
//(true || false) && true
//true && true
//true
//
//(var j = 4; j-- < 4) && (6 + 0 == 6) || !(5 % 2 != 1)
//false && true || true
//true

//Elvis operators
fun main(args: Array<String>) {
    // example 1
    fun soundFade(fadeCoef: Double?, baseSound: Double) {
        val baseCoef = 0.5
        val soundCoef = baseSound * (fadeCoef ?: baseCoef)
        println(soundCoef)
    }
    soundFade(12.22, 11.17)

    // example 2
    fun deliveryCost(deliveryFee: Double?) {
        val deliveryBase = 50.0
        val insuranceCost = 0.005 * (deliveryFee ?: deliveryBase)
        val deliveryPrice = (insuranceCost + (deliveryFee ?: deliveryBase))
        println(deliveryPrice)
    }
    deliveryCost(null)


    // example 3
    fun meteoResearch (pressure: String?) {
        val crucialInfo = "Important data is missing!"
        val labPressure = pressure ?: crucialInfo
        println(labPressure)
    }
    meteoResearch (null)
}


