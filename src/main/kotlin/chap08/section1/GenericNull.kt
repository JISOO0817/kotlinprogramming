package chap08.section1

class GenericNull<T> {
    fun EqualityFunc(arg1: T, arg2: T) {
        println(arg1?.equals(arg2))  // ? => null 허용
    }
}

fun main() {
    val obj = GenericNull<String>()
    obj.EqualityFunc("Hello","World")

    val obj2 = GenericNull<Int?>()
    obj2.EqualityFunc(null,10) //null 허용용
}