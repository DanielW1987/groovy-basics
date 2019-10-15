package rocks.danielw.groovy_009_closures

// empty closure
def c = {}
assert c instanceof Closure

// simple closure without argument
def sayHello = {println "Hello World!"}
sayHello()
sayHello.call() // alternative to sayHello()

// simple closure with 1 argument
def sayHelloName = {String name -> println "Hello $name"}
sayHelloName("John Doe")
