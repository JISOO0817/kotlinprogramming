package chap09.section4

fun main() {
    val list = listOf<Int>(1,2,3,4,5,6)
    val listMixed = listOf(1,"hello",3,"world",5,'a')
    val listWithNull = listOf(1,null,3,5,6)
    val listRepeated = listOf(2,2,3,4,5,5,6)
    val map = mapOf(11 to "java", 22 to "python", 33 to "kotlin")

    println(list.filter { it % 2 == 0 })  // 2,4,6 골러줌
    println(list.filterNot { it % 2 == 0 }) //1,3,5 골라줌
    println(listWithNull.filterNotNull()) // null 을 제외하기 위해 filterNotNull 사용


    println("filterIndexed:" + list.filterIndexed{idx,value -> idx != 1 && value % 2 == 0})

    val mutList = list.filterIndexedTo(mutableListOf()){index, i -> index != 1 && i % 2 == 0 }
    println(mutList)

    println("filterKeys:" + map.filterKeys { it != 11 })
    println("filterValues:" + map.filterValues { it == "java" })

    println("filterIsInstance:" + listMixed.filterIsInstance<String>())

    println("slice:" + list.slice(listOf(0,1,2))) // o번째 1번째 2번째 인덱스 잘라서 가져옴

    println(list.take(2)) //앞의 두 요소 반환
    println(list.takeLast(2)) //뒤의 두 요소 반환
    println(list.takeWhile { it < 3 })

    println(list.drop(2)) // 앞으 ㅣ두 요소를 제외하고 반환
    println(list.dropLast(2))  // 뒤의 두 요소를 제외하고 반환 1,2,3,4
    println(list.dropLastWhile { it > 3 }) // 3초과를 제외하고 반환


    println("component():" +list.component1())

    println("distince :" + listRepeated.distinct())
    println("intersect:" + listRepeated.intersect(listOf(5,6,7,8)))

}