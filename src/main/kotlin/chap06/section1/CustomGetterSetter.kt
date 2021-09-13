package chap06.section1

class User3(_id: Int, _name: String, _age: Int) {
    val id = _id
    var name = _name
        set(value) {
            println("The name was changed")
            field = value.toUpperCase()
        }

    var age = _age
}

fun main() {
    val user3 = User3(1,"kildong",35)
    user3.name = "coco"
    println("user3.name:${user3.name}")
}