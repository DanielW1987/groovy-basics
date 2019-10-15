package rocks.danielw.groovy_001_introduction

/*
 * Unlike Java with which Groovy shares the assert keyword, the latter in Groovy behaves very differently. First of all,
 * an assertion in Groovy is always executed, independently of the -ea flag of the JVM. It makes this a first class choice for unit tests.
 *
 * see http://groovy-lang.org/semantics.html#_power_assertion
 */

// you must provide an assertion an expression that evaluates to true
assert true

// We can provide a full expression on the right hand side. Note that unlike Java and more like Ruby or Scala == is equality
assert 1 == 1

// like the example above we are evaluating an expression
def x = 1
assert x == 1

// what happens when the expression doesn't evaluate to true?
assert false

// The power assertion output shows evaluation results from the outer to the inner expression
assert 1 == 2

// complex debug output with custom fail message
assert 1 == (3 + 10) * 100 / 5 * 20

// The power assertion statements true power unleases in complex boolean statements, or statements with collections or other toString-enabled classes
def y = [1,2,3,4,5]
assert (y << 6) == [6,7,8,9,10]
