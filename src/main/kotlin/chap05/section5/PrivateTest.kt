package chap05.section5

private class PrivateTest {
    private var i = 1
    private fun privateFunc() {
        i += 1
    }

    fun access() {
        privateFunc()
    }
}

class OtherClass {
    private val opc = PrivateTest()
    fun test() {
        val pc = PrivateTest()
    }
}

fun main() {
    val pc = PrivateTest()
    //pc.i 접근불가. i는 private 으로 선언되었기 때문에 접근할 수 없음
    //pc.privateFunc()
}

fun TopFunction() {
    val tpc = PrivateTest()
}