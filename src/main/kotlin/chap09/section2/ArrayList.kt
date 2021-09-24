package chap09.section2

import java.util.*

fun main() {
    val stringList: ArrayList<String> = arrayListOf("hello","kotlin","wow")
    stringList.add("java")
    stringList.remove("hello")
    println(stringList)
}