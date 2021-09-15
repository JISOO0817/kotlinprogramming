package chap07.section1.coffeemaker

class Thermosiphon(heater: Heater) : Pump, Heater by heater {
    override fun pump() {
        if(isHot()) {
            println("[Thermosiphon] pumping..." )
        }
    }
}