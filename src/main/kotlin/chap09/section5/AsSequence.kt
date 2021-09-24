package chap09.section5

fun main() {
    val list1 = listOf(1,2,3,4,5)
    val listDefault = list1
        .map {println("map${it}"); it*it} //list 컬렉션에 대한 첫 번째 map 연산
        .filter { println("filter(${it}"); it% 2 == 0 }  //map 에서 it * it 을 통해 새로운 list 를 만든 것에 대한 filter 적용
    println(listDefault)


    val listSeq = list1.asSequence()
        .map { println("map${it}"); it*it }
        .filter { println("filter($it)"); it % 2 == 0 }
        .toList()
    println(listSeq)
}