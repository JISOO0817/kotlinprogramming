package chap09.section2

fun main() {
    var names: List<String> = listOf("one","two","three")

    println(names.size) //3
    println(names.get(0)) //one
    println(names.indexOf("three")) //2
    println(names.contains("two")) //true
}