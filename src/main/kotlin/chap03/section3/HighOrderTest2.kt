package chap03.section3

class HighOrderTest2 {

    fun main() {
        var result: Int
        result = highOrder({x,y -> x+y},10,20)
    }

    fun highOrder(sum: (Int, Int) -> Int, a: Int, b: Int): Int {
        return sum(a,b)
    }
}