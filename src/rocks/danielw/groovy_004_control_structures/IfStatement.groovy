package rocks.danielw.groovy_004_control_structures

/*
 * null, empty strings and empty collections evaluates to false
 */
String name = "John"
if (name) {
  println "name has a value"
}

String lastName = "" // or null
if (lastName) {
  println "lastName has a value"
}
else {
  println "lastName hasn't a value"
}

def languages = []
if (! languages) {
  println "languages is empty"
}
