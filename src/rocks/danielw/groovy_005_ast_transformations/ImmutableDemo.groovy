package rocks.danielw.groovy_005_ast_transformations

import groovy.transform.Immutable

/*
 * Meta annotation used when defining immutable classes.
 *
 * A class created in this way has the following characteristics:
 *  - The class is automatically made final.
 *  - Properties must be of an immutable type or a type with a strategy for handling non-immutable characteristics.
 *    Specifically, the type must be one of the primitive or wrapper types, Strings, enums, other @Immutable classes or known immutables
 *    (e.g. java.awt.Color, java.net.URI, java.util.UUID). Also handled are Cloneable classes, collections, maps and arrays,
 *    other "effectively immutable" classes with special handling (e.g. java.util.Date), and usages of java.util.Optional where the
 *    contained type is immutable (e.g. Optional<String>).
 *  - Properties automatically have private, final backing fields with getters. Attempts to update the property will result in a ReadOnlyPropertyException.
 *  - A map-based constructor is provided which allows you to set properties by name.
 *  - A tuple-style constructor is provided which allows you to set properties in the same order as they are defined.
 *  - See http://docs.groovy-lang.org/latest/html/gapi/groovy/transform/Immutable.html for more information
 */
@Immutable
class Person {

  int id
  String firstName
  String lastName

}

def p1 = new Person(id: 1, firstName: "John")
p1.lastName = "Doe" // will throw ReadOnlyPropertyException
