package chap10.section3

import java.io.*

fun main() {
    val outString: String = "안녕하세요."
    val path = "D:\\test\\testfile.txt"

    val file = File(path)
    val printWriter = PrintWriter(file)

    printWriter.println(outString)
    printWriter.close()
}