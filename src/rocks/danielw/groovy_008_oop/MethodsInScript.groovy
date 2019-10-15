package rocks.danielw.groovy_008_oop

// methods in scripts with no return value
static printHello() {
  println "Hello"
}

static String returnHello() {
  "Hello" // or return "Hello"
}

static def returnHello2() { // without a return type
  "Hello"
}

printHello()
println returnHello()
println returnHello2()