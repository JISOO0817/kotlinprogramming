package chap10.section1

fun main() {
    data class Person(var name: String, var skills: String)
    var person = Person("kildong","kotlin")
    person.apply { this.skills = "swift" }
    println(person)

    val retrunObj = person.apply {
        name = "sean"
        skills = "java"
    }
    println(person)
    println(retrunObj)

    val alsoTest = Person("kildong","c++")
    alsoTest.also {
        it.name = "also"
        it.skills = "also_skill"
    }
    println(alsoTest)
}