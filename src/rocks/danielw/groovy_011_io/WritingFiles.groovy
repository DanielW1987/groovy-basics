package rocks.danielw.groovy_011_io

File file = new File("data3.txt")

file.write("This is line 1\n") // append line to existing content in the file
file << "This is line 2\n"          // append line to existing content in the file
file.text = "This is line 3\n"      // overwrites everything in the existing file

file.withWriter {writer ->
  writer.writeLine ("This is line 4") // overwrites everything in the existing file
}

file.append("This is line 5")  // append line to existing content in the file