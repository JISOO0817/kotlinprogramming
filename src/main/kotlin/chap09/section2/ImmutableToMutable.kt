package chap09.section2

fun main() {

    val names: List<String> = listOf("one","two","three") //불변형 리스트
    val mutableNames : MutableList<String> = names.toMutableList() //불변형 리스트를 가변형으로 만들어줌 (새로운 리스트)
    mutableNames.add("four")

    println(mutableNames)
}