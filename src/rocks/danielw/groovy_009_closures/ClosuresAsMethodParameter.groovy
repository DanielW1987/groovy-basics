package rocks.danielw.groovy_009_closures

// Closures as parameter
static def timesTen(int number, Closure closure) {
  closure(number * 10)
}

// Simply call the method
timesTen(10, {int num -> println num})

// you can omit the braces around the closure if it's the only or last method argument
timesTen(2) {int num -> println num}

def list = [1, 2, 3, 4, 5]
list.each {println it}    // you need no braces here
list.each ({println it})  // but you can use braces if you want