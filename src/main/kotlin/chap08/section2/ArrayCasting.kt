package chap08.section2

fun main() {
    val b = Array<Any>(10,{0}) // 0,0,0,0,0,0,0,0,0,0
    b[0] = "Hello world"
    b[1] = 1.1
    println(b[0])
    println(b[1])
    println(b[2])

}