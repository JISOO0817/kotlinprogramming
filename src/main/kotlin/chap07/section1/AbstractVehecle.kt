package chap07.section1

abstract class Vehicle(val name: String, val color: String, val weight: Double) {
    abstract var maxSpeed : Double

    var year = "2018"

    abstract fun start()
    abstract fun stop()

    fun displaySpecs() {
        println("name: ${name},color:${color},weight:${weight},year:${year},maxspeed:${maxSpeed}")
    }
}

class Car(name: String, color: String, weight: Double, override var maxSpeed: Double) : Vehicle(name,color,weight) {

    override fun start() {
        println("Car started")
    }

    override fun stop() {
        println("Car stopped")
    }
}

class Motorcycle(name: String, color: String, weight: Double, override var maxSpeed: Double) : Vehicle(name, color, weight) {

    override fun start() {
        println("Bike started")
    }

    override fun stop() {
        println("Bike stopped")
    }
}

fun main() {
    val car = Car("supermatiz","yellow",1110.0,270.0)
    val motor = Motorcycle("dreambike","red",173.0,100.0)
    car.year = "2013"
    car.displaySpecs()
    motor.displaySpecs()
    motor.start()
}