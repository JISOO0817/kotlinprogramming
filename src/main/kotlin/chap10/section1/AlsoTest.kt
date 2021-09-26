package chap10.section1

fun main() {
    data class Person(var name: String, var skills: String)
    var person = Person("killdong","kotlin")
    val a = person.let {
        it.skills = "android"
        "success"
    }

    println(person)
    println("a:${a}")

    val b = person.also {
        it.skills = "java"
        "success"
    }
    println(person)
    println("b:${b}")
}