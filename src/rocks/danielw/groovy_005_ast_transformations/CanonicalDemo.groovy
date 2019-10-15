package rocks.danielw.groovy_005_ast_transformations

import groovy.transform.Canonical

/*
 * The @Canonical meta-annotation combines the @EqualsAndHashCode, @ToString and @TupleConstructor annotations.
 */
@Canonical
class Student {

  String firstName, lastName
  int age
  Date since
  Collection favItems = ["Food"]
  def object
}

def d = new Date()
def anyObject = new Object()
def s1 = new Student(firstName: "John", lastName: "Doe", age: 21, since: d, favItems: ["Books", "Games"], object: anyObject)
def s2 = new Student("John", "Doe", 21, d, ["Books", "Games"], anyObject)

assert s1 == s2
