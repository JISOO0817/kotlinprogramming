package chap08.section1

open class Parent

class Child : Parent()

class Cup<T>

fun main() {
    val obj1: Parent = Child() //parent 형식의 obj1은 child의 자료형으로 변환될 수 있다. (parent => 상위클래스, child => 하위클래스)
    //val obj2: Child = Parent()

    //val obj3: Cup<Parent> = Cup<Child>() 제네릭 클래스에서는 T 형식매개변수에 클래스를 지정하더라도 서로 관련이 없기 때문에 형식불일치 오류 발생
    //val obj4: Cup<Child> = Cup<Parent>()

    val obj5 = Cup<Child>()
    val obj6 : Cup<Child> = obj5
}