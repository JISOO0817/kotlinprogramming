package chap10.section3

import java.io.*
import java.nio.*
import java.nio.file.Files
import java.nio.file.Paths
import java.nio.file.StandardOpenOption

fun main() {
    val path = "D:\\test\\hello.txt"
    val text = "안녕하세요!"

    try{
        Files.write(Paths.get(path),text.toByteArray(),StandardOpenOption.CREATE)
    }catch (e: IOException) {

    }
}