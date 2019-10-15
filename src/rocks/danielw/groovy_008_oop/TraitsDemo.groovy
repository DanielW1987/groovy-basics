package rocks.danielw.groovy_008_oop

/*
 * Simple Trait example
 */
trait Greetable {

  abstract String name()
  String greeting() {
    "Hello, ${name()}!"
  }

}

class HumanBeing implements Greetable {
  String name() {
    'Bob'
  }
}

def h = new HumanBeing()
assert h.greeting() == 'Hello, Bob!'


/*
 * Private methods in Trait
 * Traits only support public and private methods. Neither protected nor package private scopes are supported
 */
trait Greeter {

  // Traits may also define private methods. Those methods will not appear in the trait contract interface
  private String greetingMessage() {
    'Hello from a private method!'
  }

  String greet() {
    return greetingMessage()
  }

}

class GreetingMachine implements Greeter {}

def g = new GreetingMachine()
assert g.greet() == "Hello from a private method!"


/*
 * Traits may implement interfaces, in which case the interfaces are declared using the implements keyword
 */
// ToDo Daniel: make examples
//interface Named {
//  String name()
//}
//
//trait Greetable implements Named {
//  String greeting() { "Hello, ${name()}!" }
//}
//
//class Per son implements Greetable {
//  String name() { 'Bob' }
//}
//
//def h2 = new HumanBeing()
//assert h2.greeting() == 'Hello, Bob!'
//assert h2 instanceof Named
//assert h2 instanceof Greetable
