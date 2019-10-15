package rocks.danielw.groovy_004_control_structures

// It's allowed to use expressions in case labels
def intValue = 5

switch (intValue) {
  case {intValue < 5}:
    println "less or equal than 5"
    break
  case {intValue > 5}:
    println "greater than 5"
    break
  case {intValue == 0}:
    println "is zero!"
    break
  default:
    println "should not happen!"
}

// Groovy switch statement can handle any kind of switch value and different kinds of matching can be performed
def x = 1.23
def result

switch (x) {
  case "foo":
    result = "found foo"
    break

  case [4, 5, 6, 'inList']:
    result = "list"
    break

  case 12..30:
    result = "range"
    break

  case Integer:
    result = "integer"
    break

  case Number:
    result = "number"
    break

  case ~/fo*/: // toString() representation of x matches the pattern
    result = "foo regex"
    break

  case { it < 0 }: // or { x < 0 }
    result = "negative"
    break

  default:
    result = "default"
}

assert result == "number"