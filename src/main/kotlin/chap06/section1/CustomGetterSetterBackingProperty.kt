package chap06.section1

import kotlin.AssertionError

class User4(_id: Int, _name: String, _age: Int) {
    val id = _id
    private var tempName: String? = null
    var name = _name
    get() {
        if(tempName == null) tempName = "NONAME"
        return tempName ?: throw AssertionError("Asserted by others")
    }
    var age = _age
}

fun main() {
    val user4 = User4(1,"kildong",35)
    user4.name=""
    println("user4.name = ${user4.name}")
}
