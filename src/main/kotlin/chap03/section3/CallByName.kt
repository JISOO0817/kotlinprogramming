package chap03.section3

class CallByName {

    fun main() {
        val result = callBytName(otherLambda)
        println(result)
    }

    fun callBytName(b: () -> Boolean): Boolean {
        println("callbyNAme function")
        return b()
    }

    val otherLambda: () -> Boolean = {
        println("otherLambda function")
        true
    }
}