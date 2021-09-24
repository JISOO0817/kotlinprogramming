package chap09.section4

fun main() {
    val list = listOf(1,2,3,4,5)
    val listPair = listOf(Pair("a",300),Pair("b",200),Pair("c",100))
    val map = mapOf(11 to "java", 22 to "python", 33 to "c++")

    println(list.all { it < 10 }) //true
    println(list.all { it % 2 == 0}) // false
    println(list.any { it % 2 == 0 }) //true
    println(list.any { it > 10 }) // false

    println("contains:" + list.contains(2)) // true
    println(2 in list) // true
    println(map.contains(22)) // true
    println(11 in map) // true

    println("none:" + list.none()) // 검사했을 때 요소가 없으면 true 있으면 false
    println("none:" + list.none { it > 10 }) // true

    println(list.isEmpty()) //false
    println(list.isNotEmpty()) //true
}