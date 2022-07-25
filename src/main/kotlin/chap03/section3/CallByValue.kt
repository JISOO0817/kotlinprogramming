package chap03.section3

class CallByValue {

    fun main() {
        val result = callByValue(lambda())
        println(result)
    }

    fun callByValue(b: Boolean): Boolean {
        println("callbyvalue function")
        return b
    }

    val lambda: () -> Boolean = {
        println("lambda function")
        true
    }
}