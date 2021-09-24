package chap09.section3

fun main() {
    val mixedTypeSet = setOf("hello",5,"world",3.14,'c')
    val intSet: Set<Int> = setOf(1,5,5)

    println(mixedTypeSet)
    println(intSet)
}