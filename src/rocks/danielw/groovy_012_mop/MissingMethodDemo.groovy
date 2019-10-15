package rocks.danielw.groovy_012_mop

// Groovy supports the concept of methodMissing. This method differs from invokeMethod in that it is only
// invoked in case of a failed method dispatch, when no method can be found for the given name and/or the given arguments.

class MyEmployee {

  def methodMissing(String name, def args) {
    println "Method missing called on: $name"
    println "with arguments ${args}"
  }
}

MyEmployee emp = new MyEmployee()
emp.someMethod(1, 2, 3, 4)