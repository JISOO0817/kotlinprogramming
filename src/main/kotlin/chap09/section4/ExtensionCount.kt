package chap09.section4

fun main() {
    val list = listOf(1,2,3,4,5,6)
    val listPair = listOf(Pair("a",300),Pair("b",200),Pair("c",100))
    val map = mapOf(11 to "java", 22 to "kotlin", 33 to "c++")

    println(list)
    println(listPair)
    println(map)

    println("===================")

    list.forEach { print("${it}") }
    println()
    list.forEachIndexed { index, value -> println("index[$index]:$value") }

    println(list.count{it % 2 == 0})

    println(list.maxOrNull())
    println(list.minOrNull())

    println("maxBy:" + map.maxByOrNull { it.key })
    println("minBy:" + map.minByOrNull { it.key })
}