package chap08.section2

fun main() {
    val fruits = arrayOf("banana","avocado","apple","kiwi")
    fruits
        .filter { it.startsWith("a")}  //a 로 시작하는 과일을 걸러준후에
        .sortedBy { it }  //정렬한다
        .map { it.toUpperCase() }  //대문자로 변경
        .forEach{ println(it)}
}