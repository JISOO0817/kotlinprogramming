package chap08.section1

fun <T> add(a: T, b: T, op: (T, T) -> T) : T {
    return op(a,b)
}

fun main() {
    val result = add(2,3){a, b ->a + 1}
    println(result)
}