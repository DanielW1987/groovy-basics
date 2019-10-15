package rocks.danielw.groovy_002_datatypes

String firstName = "John"
String name = "Maria Thompson"
println 'Name is ' + name

// will print Name is ${name}
println 'Name is ${name}'

// use double quote for string interpolation
println("First name is ${firstName}")
println "First name is $firstName" // works also

// strings can interpolate expressions
def sum = "The sum of 2 and 3 equals ${2 + 3}"
assert sum.toString() == 'The sum of 2 and 3 equals 5'

// Multi-Line String, don't support string interpolation
def aMultilineString = '''line one
line two
line three'''

// Triple-double-quoted strings behave like double-quoted strings, with the addition that they are multiline, like the triple-single-quoted strings.
def lastName = "Doe"
def template = """
    Dear Mr ${lastName},

    You're the winner of the lottery!

    Yours sincerly,

    Dave
"""

assert template.toString().contains('Doe')

// dollar slashy strings (useful for regular expressions)
def folder = "C:\\groovy\\john\\foo\\bar"
def folder2 = $/C:\groovy\john\foo\bar/$ // you don't need to escape the backslashes
def folder3 =
$/C:\groovy
\john
\foo
\bar/$

println folder
println folder2
println folder3


// slashy strings (useful for regular expressions)
def myName1 = "My name is \"John\""
def myName2 = /My name is "John"/ // we need to escape '/' with '\'
def myName3 = /Also works in 
multi-line strings/

println myName1
println myName2