package chap06.section1

class User1(_id: Int, _name: String, _age: Int) {
    val id = _id
    get() = field

    var name = _name
    get() = field
    set(value) {
        field = value
    }

    var age = _age
    get() = field
    set(value) {
        field = value
    }
}

fun main() {
    val user1 = User1(1,"kildong",30)
    //user1.id = 2  id 는 val 로 셋 할 수 없음
    user1.age = 35
    println("user1.age = ${user1.age}")
}