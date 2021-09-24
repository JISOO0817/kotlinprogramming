package chap09.section4

fun main() {
    val unsortedList = listOf(3,2,7,5)
    println(unsortedList.reversed()) //거꾸로 출력

    println(unsortedList.sorted()) //정렬하여 출력

    println(unsortedList.sortedDescending()) //오름->내림순으로 출력

    println(unsortedList.sortedBy { it % 3 }) //특정 비교식에 의한 출력

    println(unsortedList.sortedByDescending { it % 3 })
}