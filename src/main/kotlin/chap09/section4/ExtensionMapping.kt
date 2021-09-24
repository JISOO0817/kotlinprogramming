package chap09.section4

import kotlin.math.max

fun main() {
    val list = listOf(1,2,3,4,5)
    val listWithNull = listOf(1,null,3,null,4,5)

    println(list.map { it * 2 })

    val mapIndexed = list.mapIndexed { index, it -> index * it  }
    println(mapIndexed)

    println(listWithNull.mapNotNull { it?.times(2) })
}