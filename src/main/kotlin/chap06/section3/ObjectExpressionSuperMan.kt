package chap06.section3

open class Superman() {
    fun work() = println("Taking photos")
    fun talk() = println("Talking with people.")
    open fun fly() = println("Flying in  the air.")
}

fun main() {
    val pretendedMan = object : Superman() {
        override fun fly() = println("Im not a real superman. i cant fly")
    }

    pretendedMan.work()
    pretendedMan.talk()
    pretendedMan.fly()
}