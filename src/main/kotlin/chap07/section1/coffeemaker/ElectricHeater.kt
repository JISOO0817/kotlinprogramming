package chap07.section1.coffeemaker

class ElectricHeater(var heating: Boolean = false) : Heater {
    override fun on() {
        println("[ElectricHeater] heating...")
        heating = true
    }

    override fun off() {
        heating = false
    }

    override fun isHot(): Boolean = heating
}