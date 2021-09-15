package chap07.section2

class Outer {
    val ov = 5
    class Nested {  //정적 클래스
        val nv = 10
        fun gretting() = "[Nested] Hello! ${nv}"
        fun accessOuter() {
            println(country)
            getSomething()
        }
    }

    companion object {
        const val country = "korea"
        fun getSomething() = println("Get something...")
    }

    fun outside() {
        val msg = Nested().gretting()
        println("[Outer]: ${msg},${Nested().nv}")
    }
}

fun main() {
    val output = Outer.Nested().gretting()
    println(output)


    val outer = Outer()
    outer.outside()
}