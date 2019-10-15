package rocks.danielw.groovy_008_oop

import groovy.transform.ToString

/*
 * Groovy imports the following packages by default:
 *
 *   import java.lang.*
 *   import java.util.*
 *   import java.io.*
 *   import java.net.*
 *   import groovy.lang.*
 *   import groovy.util.*
 *   import java.math.BigInteger
 *   import java.math.BigDecimal
 */
@ToString // generates toString() method
class User { // class es are public by default

  // Properties are private by default and getters and setters will be generated automatically
  Long id
  String firstName
  String lastName
  String email
  private Date dateOfBirth // if you declare a property as private no getter and setter will be generated, but you can create getter and setter on your own
  def languages = [] // is an ArrayList by default

  /*
   * Groovy has named parameter, so we don't need any constructor.
   * If you want to initialize you objects without named parameter or with a
   * fixed set of parameter, you need constructors!
   *
   * Constructors (if you have them) and methods are public by default.
   * In Groovy getters and setters for each property are created automatically.
   */

  void printFullName() {
    println "Full name is: $firstName $lastName"
  }

}

/*
 * If you want to use a script in a file in which a class already exists, the file must have a different name than the class.
 * Groovy will build a wrapper class for the script at compile time. This wrapper class will be named like the file in which
 * the script is located.
 */
def user = new User(firstName: "John", lastName: "Doe")

// set property values
user.setLastName("Vega")
user.email = "john.vega@example.com" // In the compiled code the set method is used

// add values to list with 'Left Shift Operator'
user.languages << "Groovy"
user.languages << "Java"

user.printFullName()
println user
