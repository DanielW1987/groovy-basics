package rocks.danielw.groovy_003_operators

// for elvis operator demo
class User {
  String firstName
  String lastName

  String name() {
    return "$firstName $lastName"
  }
}

/*
 * There are all operators available that also exist in Java.
 * The application is also the same as in Java.
 * Groovy has some nice additions.
 */
// Math.pow(2, 3)
assert  2 ** 3 == 8

// Method for integer division
assert 9.intdiv(5) == 1

// basic operator methods for primitives
assert 2.2.plus(1.1) == 3.3

assert 2 == 2.5.toInteger() // conversion
assert 2 == 2.5 as Integer  // enforced coercion
assert 2 == (int) 2.5       // cast

assert '5.50'.isNumber()
assert 5 == '5'.toInteger()

// Negation operator
assert (!true)    == false // Simple: the negation of true is false
assert (!'foo')   == false // 'foo' is a non empty string, evaluating to true, so negation returns false
assert (!'')      == true  // '' is an empty string, evaluating to false, so negation returns true


// Ternary operator
String string = "My string"
def result = (string != null && string.length() > 0) ? 'Found' : 'Not found'
println result

result = string ? 'Found' : 'Not found' // you can omit the null and length check
println result


// Elvis operator
def msg = null
def output      = (msg != null) ? msg : 'Default message'
def output2     = msg ? msg : 'Default message'
def elvisOutput = msg ?: 'Default message' // you can omit the value before the : if it's the same value as before the ?
