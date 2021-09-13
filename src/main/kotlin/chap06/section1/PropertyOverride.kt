package chap06.section1

open class First {
    open val x = 0
    get() {
        println("First x")
        return field
    }
    val y = 0
}

class Second : First() {
    override val x : Int = 0
    get() {
        println("Second x")
        return field + 3
    }

}

fun main() {
    val second = Second()
    println(second.x)   // second 클래스의 x
    println(second.y)  //first 클래스의 y
}