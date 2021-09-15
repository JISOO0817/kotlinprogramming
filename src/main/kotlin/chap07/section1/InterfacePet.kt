package chap07.section1

interface Pet {
    var category: String //인터페이스에서 프로퍼티는 오직 추상 메서드로만 선언애햐아한다. abstract 키워드를 적지 않아도 default 가 추상 프로퍼티임.
    fun feeding()
    fun patting() {
        println("keep patting!")
    }
    fun test()

    var species: String
}

class Cat(name: String, override var category: String) : Pet ,Animal(name){

    override fun feeding() {
        println("Feed the cat a tuna can!")
    }

    override fun test() {
        TODO("Not yet implemented")
    }

    override var species: String = "cat"
}

fun main() {
    val obj = Cat("coco","small")
    println("Pet category: ${obj.category}")
    obj.feeding()
    obj.patting()
    obj.test()
}