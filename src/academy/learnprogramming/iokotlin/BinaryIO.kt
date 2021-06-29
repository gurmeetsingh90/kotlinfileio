package academy.learnprogramming.iokotlin

import java.io.DataInputStream
import java.io.EOFException
import java.io.FileInputStream


fun main(args: Array<String>) {
    val di = DataInputStream(FileInputStream("testfile.bin"))
    var si: String

    var name: String? = "gurmeet"
    name = null
    println("${name?.length}")




}