package chap06.section1

class User(_id: Int, _name: String, _age: Int) {
    val id = _id  //불변(읽기전용)
    var name = _name //변경 가능
    var age = _age //변경 가능
}

fun main() {
    val user = User(1,"sean",30)
    val name = user.name
    user.age = 40
    println("name:${name},age:${user.age}")
}