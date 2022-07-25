package chap03.section3

class HighOrderTest {

    fun main() {
        var result:Int
        val multi = {x: Int, y:Int -> x*y}
        result = multi(10,5)
        println(result)
    }
}