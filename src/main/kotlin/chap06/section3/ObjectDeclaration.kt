package chap06.section3

object OCustomer {
    var name = "kildong"
    fun greeting() = println("Hello world")
    val HOBBY = Hobby("Basketball")
    init {
        println("Init")
    }
}

class CCustomer {
    companion object {
        const val HELLO = "hello"
        var name = "Joosol"
        @JvmField val HOBBY = Hobby("Football")
        @JvmStatic fun gretting() = println("Hello world!")
    }
}

class Hobby(val name: String)

fun main() {
    OCustomer.greeting()
    OCustomer.name = "Dooly"
    println("name = ${OCustomer.name}")
    println(OCustomer.HOBBY.name)

    CCustomer.gretting()
    println("name = ${CCustomer.name}, HELLO = ${CCustomer.HELLO}")
    println(CCustomer.HOBBY.name)
}