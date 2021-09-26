package chap10.section1

fun main() {
    data class User(val name: String, var skills: String, var email: String? = null)
    val user = User("kildong","default")

    val result = with(user) {
        skills = "kotlin"
        email = "kildong@example.com"
        "success"
    }
    println(user)
    println("Result : ${result}")
}