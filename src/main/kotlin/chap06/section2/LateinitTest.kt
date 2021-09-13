package chap06.section2


class Person {

    lateinit var name: String

    fun test() {
        if(!::name.isInitialized) { // :: 리플렉션을 이용해 참조
            println("not initialized")
        }else {
            println("initialized")
        }
    }
}

fun main() {
    val kildong = Person()
    kildong.test() //초기화되어있지 않음
    kildong.name = "kildong" //name 에 값 할당
    kildong.test() //이 부분에서는 초기화되어있음
    println("name=${kildong.name}")
}

