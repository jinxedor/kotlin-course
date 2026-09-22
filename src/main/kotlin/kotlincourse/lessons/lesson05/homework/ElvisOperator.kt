package kotlincourse.lessons.lesson05.homework

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