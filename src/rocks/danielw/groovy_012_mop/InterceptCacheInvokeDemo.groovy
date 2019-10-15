package rocks.danielw.groovy_012_mop

class Student {

  List<String> languages = []

  def methodMissing(String name, def args) {
    println "$name() method was called..."
  }

}

Student student = new Student()
student.languages << "Groovy"
student.languages << "Java"


