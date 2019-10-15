package rocks.danielw.groovy_005_ast_transformations

import groovy.transform.TypeChecked

/*
 * Without @TypeChecked this call will compile even if we write <return "$first $last">.
 * Only the IDE complains that it could not resolve this variables, but it will compile.
 * With @TypeChecked the Groovy compiler use compile time checks in the style of Java.
 */
@TypeChecked
class TypeCheckedDemo {

  String firstName
  String lastName

  String getFullName() {
    return "$firstName $lastName"
  }

}
