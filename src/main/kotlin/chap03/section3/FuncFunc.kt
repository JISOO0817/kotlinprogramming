package chap03.section3

class FuncFunc {

    fun main() {
        println(funcFunc())
    }

    fun sum(a: Int, b:Int) = a+b

    fun funcFunc(): Int {
        return sum(2,2)
    }
}