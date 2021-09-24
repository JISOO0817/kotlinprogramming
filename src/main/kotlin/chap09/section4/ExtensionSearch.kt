package chap09.section4

fun main() {
    val list = listOf(1,2,3,4,5,6)
    val listPair = listOf(Pair("a",300),Pair("b",200),Pair("c",100))
    val listRepeated = listOf(2,2,3,4,5,5,6)

    println("elementAt: "+list.elementAt(1)) // 인덱스에 해당하는 요소 반환 2
    println("elementAtOrElse:" + list.elementAtOrElse(10,{2*it})) //인덱스를 벗어나는 경우 식에 따라 결과 반환
    println("elementAtOrNull:" + list.elementAtOrNull(10)) //인덱스를 벗어나는 경우 null 반환

}