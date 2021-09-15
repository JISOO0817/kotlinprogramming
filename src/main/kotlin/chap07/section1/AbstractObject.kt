package chap07.section1

abstract class Printer {
    abstract fun print() //추상 메서드
}

val myPrinter = object: Printer() {   //객체 인스턴스 (익명 객체를 지정하는 object 키워드 사용)
    override fun print() {  //추상 메서드
        println("출력합니다.")
    }
}

fun main() {
    myPrinter.print()
}