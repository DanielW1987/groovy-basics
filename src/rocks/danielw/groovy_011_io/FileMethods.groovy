package rocks.danielw.groovy_011_io

import groovy.io.FileType

// printEachFileInDir()
// printEachFileRecursivelyInDir()
printEachDirectory()
findHiddenFiles()

def printEachFileRecursivelyInDir() {
  def dir = "/home/daniel/Dokumente/Clones/groovy-basics"
  new File(dir).eachFileRecurse(FileType.FILES) {
    if (it.name.endsWith(".groovy")) {
      println it.name
    }
  }
}

def printEachFileInDir() {
  def dir = "/home/daniel/Dokumente/Clones/groovy-basics"
  new File(dir).eachFile {
    if (it.isFile()) {
      println it.name
    }
  }
}

def printEachDirectory() {
  def dir = "/home/daniel/Dokumente/Clones/groovy-basics"
  new File(dir).eachDirRecurse {
    println it
  }
}

def findHiddenFiles() {
  def dir = "/home/daniel/Dokumente/Clones/groovy-basics"
  def hidden = []
  new File(dir).eachFile {
    if (it.isHidden()) {
      hidden << it.name
    }
  }

  println hidden
}