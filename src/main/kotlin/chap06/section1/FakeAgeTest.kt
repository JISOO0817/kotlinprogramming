package chap06.section1

fun main() {
    val kim = FakeAge()
    kim.age = 15
    println("kim's real age = 15, pretended age = ${kim.age}")
}

class FakeAge {
    var age = 0
    set(value) {
        field = when {
            value < 18 -> 18
            value in 18..30 -> value
            else -> value - 3
        }
    }
}