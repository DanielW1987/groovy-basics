package rocks.danielw.groovy_008_oop

class Person {

  String firstName
  String lastName

  Person (String fullName) {
    List<String> parts = fullName.split(' ')
    firstName = parts[0]
    lastName = parts[1]
  }
}

// by default we can use a constructor with named parameter
Person p1 = new Person(firstName: "John", lastName: "Doe")

// we can also use our own constructors as in Java
Person p2 = new Person("John Doe")
