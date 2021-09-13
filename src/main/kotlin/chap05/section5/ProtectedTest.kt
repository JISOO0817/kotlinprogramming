package chap05.section5

open class Base { //최상위 클래스 protected 사용 불가
    protected var i = 1
    protected fun protectedFunc() {
        i += 1
    }

    fun access() {
        protectedFunc() //같은 클래스 접근 허용
    }
    protected class Nested
}

class Derived : Base() {
    fun test(base: Base): Int {
        protectedFunc()  //접근허용
        return i
    }
}

fun main() {
    val base = Base()
    //base.i 접근불가
    //base.protectedFunc()
    base.access() //접근 가능
}