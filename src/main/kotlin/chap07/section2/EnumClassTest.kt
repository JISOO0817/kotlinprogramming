package chap07.section2

interface Score {
    fun getScore(): Int
}

enum class MemberType(var prio: String) : Score {
    NORMAL("Third") {
        override fun getScore(): Int = 100
    },
    SILVER("second") {
        override fun getScore(): Int = 500
    },
    GOLD("first") {
        override fun getScore(): Int = 1500
    }
}

fun main() {
    println(MemberType.NORMAL.getScore())
    println(MemberType.GOLD)
    println(MemberType.valueOf("SILVER"))
    println(MemberType.SILVER.prio)

    for(grade in MemberType.values()) {
        println("grade.name = ${grade.name},prio = ${grade.prio}")
    }
}