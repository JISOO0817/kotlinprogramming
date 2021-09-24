package chap09.section2

fun main() {
    val mutableList: MutableList<String> = mutableListOf("kildong","dooly","chelsu")
    mutableList.add("ben")
    mutableList.removeAt(1) //1번인덱스 삭제 (둘리)
    mutableList[0] = "sean" //0번을 sean 으로 변경
    println(mutableList)

    val mutableListMixed = mutableListOf("android","apple",5,6,'x')
    println(mutableListMixed)
}