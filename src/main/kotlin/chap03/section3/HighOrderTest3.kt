package chap03.section3

class HighOrderTest3 {


    fun main() {
        val out: () -> Unit = {println("Hello world!")}

        out()
        val new = out
        new()
    }
}