package rocks.danielw.groovy_003_operators

/*
 * The Safe Navigation operator is used to avoid a NullPointerException. Typically when you have a reference to an object you might
 * need to verify that it is not null before accessing methods or properties of the object. To avoid this, the safe navigation operator
 * will simply return null instead of throwing an exception.
 */

class Person {
  String firstName
  String lastName
}

Person person = null

// The 'Java' way
String displayName1 = null
if (person != null) {
  displayName1 = person.getFirstName() + " " + person.getLastName()
}
println displayName1


// The 'Groovy' way
println "${person?.getFirstName()} ${person?.getLastName()}"