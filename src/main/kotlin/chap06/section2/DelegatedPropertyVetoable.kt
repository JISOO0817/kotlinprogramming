package chap06.section2

import kotlin.properties.Delegates

fun main() {
    var max: Int by Delegates.vetoable(0) {
        property, oldValue, newValue ->
        newValue > oldValue
    }

    println(max)   //0 old Value
    max = 10      // 10 new Value
    println(max)  // 10   old Value

    max = 5   // 5 new Value
    println(max) // 10  조건 다르므로 거부...
}