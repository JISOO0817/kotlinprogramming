package chap08.section1

open class Animal(val size: Int) {
    fun feed() = println("Feeding...")
}

class Cat(val jump: Int): Animal(50)
class Spider(val poison: Boolean): Animal(1)

class Box2<out T: Animal>(val element: T) { //공변성 선언 , 상<->하 관계
    fun getAnimal(): T = element

}

fun main() {
    val c1: Cat = Cat(10)
    val s1: Spider = Spider(true)

    var a1: Animal = c1 //클래스의 상위 자료형으로 변환
    a1 = s1
    println("a1.size = ${a1.size}")

    val c2: Box2<Animal> = Box2<Cat>(Cat(10)) //공변성  o
    println("c2.element.size = ${c2.element.size}")

   // val c3: Box<Cat> = Box<Animal>(10) 이 경우는 공변성이 아니라 반공변성임. 반대의 경우는 인스턴스화 되지 않는다.


}
