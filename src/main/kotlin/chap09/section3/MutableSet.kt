package chap09.section3

fun main() {

    val animals = mutableSetOf("lion","dog","cat","python")
    println(animals)

    animals.add("dog")
    println(animals)

    animals.remove("python")
    println(animals)
}