package chap06.section3

class Person3 {
    var id = 0
    var name = "Yongdeok"
    companion object {
        var language = "Korean"
        fun work() {
            println("working...")
        }
    }
}

fun main() {
    println(Person3.language)
    Person3.language = "English"
    println(Person3.language)
    Person3.work()
    //Person3.name
    val person3  =  Person3()
    person3.name

}