package academy.learnprogramming.iokotlin

import java.io.File


fun main(args: Array<String>) {

    //write into file
    val fileName = "Demo.txt"

    val file = File(fileName)
    file.writeText("Hello World")
    file.writeText("Bye world")
    file.appendText("Gurmeet Singh")

    // 1st way
    File(fileName).reader().forEachLine { println(it) }

// 2nd way
    var lines2 =  File("testfile.txt").reader().readLines()
    lines2.forEach { print(it) }

   // 3rd way
    var lines3 =  File("testfile.txt").reader().readText()
    lines3.forEach { print(it) }


    //4th way
    var reader4  =  File("testfile.txt").reader()
    var lines4 = reader4.readText()
    lines4.forEach { print(it) }


   // 5th way
    var reader5 = File("testfile.txt").reader()
    var lines5 = reader5.readText()
    println(lines5)
    reader5.close()

   // 6th way
    var lines6 = File("testfile.txt").reader().use { it.readText() }
    println(lines6)

   // 7th way
    var lines7 = File("testfile.txt").bufferedReader().use { it.readText() }
    println(lines7)

    // 8th way
    var lines8 = File("testfile.txt").readText()
    println(lines8)



    //new InputStreamReader(new FileInputStreamReader(new File("testfile.txt")), "UTF-8")
}