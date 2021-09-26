package chap10.section1

fun main() {
    val score: Int? = 32
    //var score = null

    fun checkScore() {
        if (score != null) {
            println("score: ${score}")
        }
    }

    //let 함수를 사용하여 null 검사를 제거
    //let 함수는  null 이 아닐때에만 실행

    fun checkScoreLet() {
        score?.let { println("score: ${it}")}
        val str = score.let { it.toString() }
        println(str)
    }
    checkScore()
    checkScoreLet()
}