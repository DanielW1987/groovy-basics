package rocks.danielw.groovy_011_io

import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths

String filePath = "data.txt"
File file = new File(filePath)


// Reading the entire content as String
String content = file.text
println "Reading the entire content as String:\n$content \n\n"


// Collecting lines into a list
List<String> list = file.collect {it}
println "Collecting lines into a list: $list \n\n"


// Reading entire file into a list
List<String> list2 = file.readLines()
println "Reading entire file into a list : $list2 \n\n"


// Storing file content in an array
def array = file as String[]
println "Storing file content in an array and print first item: ${array[0]} \n\n"


// Reading file line by line
println "Reading file line by line: "
file.eachLine {println it}

print "\n\n"


// Reading file line by line with line number
println "Reading file line by line with line number: "
file.eachLine {line, lineNumber ->
  println "[$lineNumber]: $line"
}

print "\n\n"


// Reading file with BufferedReader
println "Reading file with BufferedReader: "
String line
file.withReader {reader ->
  while ((line = reader.readLine()) != null) {
    println line
  }
}

print "\n\n"


// Copying file content to another file
Path newFilePath = Paths.get("data2.txt")
Files.deleteIfExists(newFilePath)
def newFile = new File(newFilePath.toString())
newFile << file.text
