package chap06.section2

class LazyTest {

    // 초기화 블록
    init {
        println("init block")   // 2) 초기화 블록 수행
    }

    val subject by lazy {  // subject 프로퍼티는 지연초기화이기에 바로 실행 x
        println("lazy initialized")
        "kotlin programming" //lazy 반환값
    }

    fun flow() {
        println("not initialized")  //4)
        println("subject one: ${subject}")  // 5) 초기화 시점
        println("subject two: ${subject}") // 6) 이미 초기화된 값 사용용
    }
}

fun main() {
    val test = LazyTest()  //  1) 객체 생성
    test.flow()  // 3) test 객체의 flow 메서드 수행
}