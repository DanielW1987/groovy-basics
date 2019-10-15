package rocks.danielw.groovy_008_oop

class MyMathUtil {

  // it's possible to define default values for arguments, so you don't need method overloading anymore
  int sum(int a = 10, int b = 20) {
    return a + b
  }

  // simple void method (as in Java)
  void doSomething() {
    println "Hello World"
  }

  // don't specify return type
  def returnSomething() {
    "Hello World" // the 'return' is optional for the last statement in the method
  }

}

def util = new MyMathUtil()
println util.sum(5, 10) // prints 15
println util.sum() // prints 30
println util.sum(50) // prints 70