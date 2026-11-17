package kotlincourse.lessons.lesson18

import java.io.InputStream

interface Powerrable {
    fun turnOn()
    fun turnOff()
}

interface Openable {
    fun open()
    fun close()
}

interface WaterContainer {
    val capacity: Int
    fun fillWater(amount: Int)
    fun getWater(amount: Int)
}

interface TemperatureRegulatable {
    val maxTemperature: Int
    fun setTemperature(temp: Int)
}

interface WaterConnection {
    fun connectToWaterSupply()
    fun getWater(amount: Int)
}

interface AutomaticShutdown {
    val sensorType: String
    val maxSensoredValue: Int
    fun startMonitoring()
}

interface Drainable {
    fun connectToDrain()
    fun drain()
}

interface Timable {
    fun setTimer(time: Int)
}

interface BatteryOperated {
    fun getCapacity(): Double
    fun replaceBattery()
}

interface Mechanical {
    fun performMechanicalAction()
}

interface LightEmitting {
    fun emitLight()
    fun completeLiteEmission()
}

interface SoundEmitting {
    fun setVolume(volume: Int)
    fun mute()
    fun playSound(stream: InputStream)
}

interface Progrrammable {
    fun programAction(action: String)
    fun execute()
}

interface Movable {
    fun move(direction: String, distance: Int)
}

interface Cleanable {
    fun clean()
}

interface Rechargeable {
    fun getCapacity(): Double
    fun recharge()
}

class KettleElectric() : Powerrable, WaterContainer, TemperatureRegulatable, AutomaticShutdown {
    override fun turnOn() {
        TODO("Not yet implemented")
    }

    override fun turnOff() {
        TODO("Not yet implemented")
    }

    override val capacity: Int
        get() = TODO("Not yet implemented")

    override fun fillWater(amount: Int) {
        TODO("Not yet implemented")
    }

    override fun getWater(amount: Int) {
        TODO("Not yet implemented")
    }

    override val maxTemperature: Int
        get() = TODO("Not yet implemented")

    override fun setTemperature(temp: Int) {
        TODO("Not yet implemented")
    }

    override val sensorType: String
        get() = TODO("Not yet implemented")
    override val maxSensoredValue: Int
        get() = TODO("Not yet implemented")

    override fun startMonitoring() {
        TODO("Not yet implemented")
    }
}

class VacuumCleaner() : Powerrable, Openable, Movable, Progrrammable {
    override fun turnOn() {
        TODO("Not yet implemented")
    }

    override fun turnOff() {
        TODO("Not yet implemented")
    }

    override fun open() {
        TODO("Not yet implemented")
    }

    override fun close() {
        TODO("Not yet implemented")
    }

    override fun move(direction: String, distance: Int) {
        TODO("Not yet implemented")
    }

    override fun programAction(action: String) {
        TODO("Not yet implemented")
    }

    override fun execute() {
        TODO("Not yet implemented")
    }
}

class SoundbarPortable() : Powerrable, Rechargeable, SoundEmitting, LightEmitting {
    override fun turnOn() {
        TODO("Not yet implemented")
    }

    override fun turnOff() {
        TODO("Not yet implemented")
    }

    override fun getCapacity(): Double {
        TODO("Not yet implemented")
    }

    override fun recharge() {
        TODO("Not yet implemented")
    }

    override fun setVolume(volume: Int) {
        TODO("Not yet implemented")
    }

    override fun mute() {
        TODO("Not yet implemented")
    }

    override fun playSound(stream: InputStream) {
        TODO("Not yet implemented")
    }

    override fun emitLight() {
        TODO("Not yet implemented")
    }

    override fun completeLiteEmission() {
        TODO("Not yet implemented")
    }
}

class Boiler() : Powerrable, WaterConnection, WaterContainer, TemperatureRegulatable, AutomaticShutdown {
    override fun turnOn() {
        TODO("Not yet implemented")
    }

    override fun turnOff() {
        TODO("Not yet implemented")
    }

    override fun connectToWaterSupply() {
        TODO("Not yet implemented")
    }

    override fun getWater(amount: Int) {
        TODO("Not yet implemented")
    }

    override val capacity: Int
        get() = TODO("Not yet implemented")

    override fun fillWater(amount: Int) {
        TODO("Not yet implemented")
    }

    override val maxTemperature: Int
        get() = TODO("Not yet implemented")

    override fun setTemperature(temp: Int) {
        TODO("Not yet implemented")
    }

    override val sensorType: String
        get() = TODO("Not yet implemented")
    override val maxSensoredValue: Int
        get() = TODO("Not yet implemented")

    override fun startMonitoring() {
        TODO("Not yet implemented")
    }
}

fun switchOff(power: Powerrable) {
    power.turnOff()
}

fun main() {
    val households = listOf(KettleElectric(), VacuumCleaner(), SoundbarPortable(), Boiler())
    households.forEach {switchOff(it)}

}