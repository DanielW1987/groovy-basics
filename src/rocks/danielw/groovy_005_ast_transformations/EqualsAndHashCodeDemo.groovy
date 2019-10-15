package rocks.danielw.groovy_005_ast_transformations

import groovy.transform.EqualsAndHashCode

/*
 * Class annotation used to assist in creating appropriate equals() and hashCode() methods.
 */
@EqualsAndHashCode(excludes = ["firstName", "lastName"])
class Customer {

  int id
  String firstName
  String lastName

}

def c1 = new Customer(id: 1, firstName: "John", lastName: "Doe")
def c2 = new Customer(id: 1, firstName: "Maria", lastName: "Thompson")

if (c1 == c2) {
  println "Customer '$c1.firstName $c1.lastName' is equal to '$c2.firstName $c2.lastName'"
}