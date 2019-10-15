package rocks.danielw.groovy_009_closures

/*
 * No parameter
 */
def noParams = {
  println "no params"
}

noParams()

def noParamsWithArrow = { ->
  println "no params with arrow"
}

noParamsWithArrow()

/*
 * Implicit parameter
 */
def foo = {
  println it // 'it' is an implicit parameter
}

foo("Hello World!")

/*
 * Explicit parameter
 */
def sayHello = {first, last ->
  println "Hello $first $last"
}

sayHello ("John", "Doe")

/*
 * Default values
 */
def greet = {String name, String greeting = "Howdy" ->
  println "$greeting $name"
}

greet("John", "Hello")
greet("John")

/*
 * Varargs
 */
def concat = {String... args ->
  args.join(' ') // you can omit the return statement
}

println concat("abc", "def", "ghi", "jkl")

/*
 * Evaluate closure parameter
 */
def evaluateClosure(Closure c) {
  println "Maximum number of parameters: ${c.maximumNumberOfParameters}"
  println "Parameter types: ${c.parameterTypes}"
}

def someClosure = {int x, int y ->
  x + y
}

evaluateClosure(someClosure)