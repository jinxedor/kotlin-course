package kotlincourse.lessons.lesson18

//Абстракция в объектно-ориентированном программировании (ООП) — это процесс выделения ключевых характеристик объекта,
// исключая из рассмотрения несущественные детали. Это позволяет сосредоточиться на том, "что" делает объект, а не на том, "как" он это делает,
// облегчая тем самым проектирование и реализацию программных систем.

//Прочитай ещё раз, это важно - абстракция отвечает на вопрос “что”, а не “как”. Например, когда мы проектируем стиральную машину,
// мы должны ответить на вопрос - что она должна делать? Абстрактно - стирать, полоскать, отжимать бельё.
// По этой абстракции можно построить множество реализаций, которые будут соответствовать этой абстракции,
// но каждая реализация будет технически отличаться от другой - способ загрузки белья, способ вращения барабана,
// полуавтоматические или автоматы, разные программы стирки и так далее.

//Язык предоставляет нам несколько возможностей для абстрактного описания программы: Интерфейс и Абстрактный класс.

interface Powerable {
    // Абстрактные методы без реализации
    fun turnOn()
    fun turnOff()
}

interface Device : Powerable {

    // Константа, определенная в companion object
    companion object {
        const val TYPE = "Device"
    }

    // Абстрактное свойство (поле), которое должно быть переопределено в классе, реализующем интерфейс
    val deviceId: String

    // Метод с реализацией, вызывающий приватный метод
    fun restart() {
        turnOff()
        logAction("Устройство с ID $deviceId выключено для перезагрузки.")
        turnOn()
        logAction("Устройство с ID $deviceId включено после перезагрузки.")
    }

    // Приватный метод с реализацией (доступно начиная с Kotlin 1.4)
    private fun logAction(action: String) {
        println("* Лог действия устройства: $action *")
    }
}

abstract class HouseholdAppliance(
    val brand: String
) : Device {

    abstract val applianceType: String

    var isPoweredOn: Boolean = false
        private set

    abstract fun operate()

    override fun turnOn() {
        isPoweredOn = true
        onPowerChange()
    }

    override fun turnOff() {
        isPoweredOn = false
        onPowerChange()
    }

    private fun onPowerChange() {
        val state = if (isPoweredOn) {
            "включено"
        } else {
            "выключено"
        }
        println("Устройство '$applianceType $brand' $state.")
    }

    protected open fun performMaintenance() {
        println("*** Секция обслуживания устройства ***")
    }
}

interface Programmable {

    fun selectProgram(preset: Int)
}

class Microwave(
    brand: String,
    serialNumber: String
) : HouseholdAppliance(brand), Programmable {

    private val programPresets = mapOf(
        1 to "warm up soup",
        2 to "warm up bread"
    )

    private var lastProgram = 1

    override val deviceId = serialNumber

    override val applianceType: String = "Микроволновая печь"

    override fun operate() {
        if (isPoweredOn) {
            invokeProgram()
            performMaintenance()
        } else {
            println("Микроволновая печь от $brand не включена. Пожалуйста, включите ее.")
        }
    }

    override fun performMaintenance() {
        super.performMaintenance()
        println("Чистка микроволновой печи от $brand.")
    }

    override fun selectProgram(preset: Int) {
        if (preset in programPresets) {
            lastProgram = preset
        }
    }

    private fun invokeProgram() {
        println(programPresets[lastProgram])
    }
}

fun main() {
    val mw = Microwave("Samsung", "CX45HGR-T10")
    println(mw.isPoweredOn)
    // mw.isPoweredOn = true // так нельзя
    println(mw.deviceId)
    mw.turnOn()
    mw.operate()
    mw.restart()
    mw.operate()
    mw.turnOff()
}


// Practice

