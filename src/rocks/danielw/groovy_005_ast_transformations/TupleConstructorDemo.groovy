package rocks.danielw.groovy_005_ast_transformations

import groovy.transform.ToString
import groovy.transform.TupleConstructor

/*
 * Class annotation used to assist in the creation of tuple constructors in classes.
 * Should be used with care with other annotations which create constructors.
 */
@TupleConstructor
@ToString(includePackage = false)
class A {

  String firstName
  String lastName
  String country
  Date dateOfBirth

  /*
   * @TupleConstructor generates the following constructor:
   * A (String firstName = null, String lastName = null, String country = null, Date dateOrBirth = null) {
   *    this.firstName = firstName
   *    this.lastName = lastName
   *    this.country = country
   *    this.dateOfBirth = dateOfBirth
   * }
   */

}

A a = new A("John", "Doe")
println a