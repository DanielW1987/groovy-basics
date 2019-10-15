package rocks.danielw.groovy_002_datatypes

/*
 * The following data types exists:
 *  - byte
 *  - short
 *  - int
 *  - long
 *  - float
 *  - double
 *  - char
 *  - boolean
 *  - String
 */
byte a = 10
short b = 20
int c = 30
long d = 10_000L
float e = 3.14F
double f = 3.14346588
char g = 'Z'
boolean trueValue = true
String str = "Hello World"


/*
 * Dynamic Type Casting
 */
println("Dynamic Type Casting")
def h = 10
println("Type of h is: ${h.getClass().getName()}")
h = (byte) 20
println("Type of h now is: ${h.getClass().getName()}")



println("=============================")



/*
 * All primitives are boxed to their Java Wrapper class, so we can call methods on primitive numbers
 */
println("Type inference")
println 12345.getClass().getName()                   // Integer
println 12345L.getClass().getName()                  // Long
println 12345678910111213141516.getClass().getName() // BigInteger
println 5.5.getClass().getName()                     // BigDecimal by Default
println 5.5d.getClass().getName()                    // Double



println("=============================")



/*
 * If either operand is a float or a double the result of +, -, * or / is a double.
 * In Java if only floats are involved the result is a float.
 *
 * It either operand is a BigDecimal the result ist a BigDecimal
 * It either operand is a BigInteger the result ist a BigInteger
 * It either operand is a Long the result ist a Long
 * It either operand is a Integer the result ist a Integer
 */
println("Type inference after calculation")
float myFloat = 5.25
double myDouble = 10.50
def result = myDouble / myFloat
println result.getClass().getName() // => java.lang.Double

float float1 = 10.75
float float2 = 53.75
def result2 = float2 / float1
println result2.getClass().getName() // => java.lang.Double

// double division
println 5.0d - 4.1d // => 0.9000000000000004 (as in Java)
println 5.0 - 4.1   // 0.9 (because of BigDecimal)

// integer division
def intDiv = 1 / 2 // 0 in Java because we divide 2 ints and the result is 0.5 and the decimal parts are ignored, so the result is 0
println intDiv // 0.5 in Groovy
println intDiv.getClass().getName() // type is BigDecimal
