package chap07.section1.coffeemaker

class MyDripCoffeeModule : CoffeeModule {

    companion object {
        val electricHeater: ElectricHeater by lazy {
            ElectricHeater()
        }
    }

    private val _thermosiphon : Thermosiphon by lazy {
        Thermosiphon(electricHeater)
    }

    override fun getThermosiphon(): Thermosiphon = _thermosiphon
}