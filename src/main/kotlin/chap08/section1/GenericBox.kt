package chap08.section1

class Box<T>(t: T) {  //형식 매개변수로 받은 인자를 name에 저장
    var name = t
    //var test : T  프로퍼티는 초기화되거나 abstract로 선언되어야 한다.
}

fun main() {
    val box1: Box<Int> = Box(1)
    val box2: Box<String> = Box("Hello")
    println(box1.name)
    println(box2.name)
}