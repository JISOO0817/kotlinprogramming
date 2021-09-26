package chap10.section1

fun main() {
    data class Person(var name: String, var skills: String)
    var person = Person("kildong","kotlin")
    val retrunObj = person.apply {
        name = "apply"
        skills =  "apply_skills"
        "success"
    }
    println(person)
    println(retrunObj)

    val retrunObj2 = person.run {
        this.name = "dooly"
        this.skills = "c#"
        "success"
    }
    println(person)
    println(retrunObj2)
}