package rocks.danielw.groovy_002_datatypes

// define variables with keyword 'def'
def name = "John Doe"

// You can also use data types
String firstName = "Maria Thompson"

// multi variable declaration
def (String a, int b, Double c) = [30, 40, 50]
println("Value of a is: ${a}")
println("Value of b is: ${b}")
println("Value of c is: ${c}")

// groovy is dynamically typed
name = 2 // value was a String before
println "The new value of name is: ${name}" // works fine