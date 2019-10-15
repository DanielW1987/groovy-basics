package rocks.danielw.groovy_010_exceptions

// In Java you write something like this
void javaException() throws Exception {
  throw new Exception("oups")
}

// In Groovy, a method does not have to be declared with the exception.
void groovyException() {
  throw new Exception("oups")
}

// Otherwise the exception Handling is identical with Java