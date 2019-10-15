package rocks.danielw.groovy_005_ast_transformations

import groovy.transform.ToString

@ToString(includePackage = false, includeNames = true, ignoreNulls = true)
class Employee {

  String firstName
  String lastName
  String email

}

def e = new Employee(firstName: "John", lastName: "Doe")
println e
