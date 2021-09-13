package chap06.section2

import kotlin.properties.Delegates

class User {
    var name: String by Delegates.observable("NONAME") {  // by 를 통한 프로퍼티 위임   , 초깃값은 NONAME
        prop, old, new ->
        println("${old} -> ${new}")
    }
}

fun main() {
    val user = User()
    user.name="kildong"
    user.name="dooly"

    //메인에서 name 의 값을 변경해줄 때 observable 함수 코드 수행됨
}