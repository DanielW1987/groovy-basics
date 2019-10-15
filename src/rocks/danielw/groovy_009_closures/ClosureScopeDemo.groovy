package rocks.danielw.groovy_009_closures

/*
 * this: corresponds to the enclosing class where the closure is defined.
 * owner: corresponds to the enclosing object where the closure is defined, which may be either a class or a closure.
 * delegate: corresponds to a third party object where method calls or properties are resolved whenever the receiver
 * of the message is not defined.
 */
class ScopeDemo {

  def outerClosure = {
    println this.getClass().getName()
    println owner.getClass().getName()
    println delegate.getClass().getName()

    def nestedClosure = {
      println this.getClass().getName()
      println owner.getClass().getName()
      println delegate.getClass().getName()
    }
    nestedClosure.call()
  }

}

def demo = new ScopeDemo()
demo.outerClosure.call()


/*
 * Delegates Demo
 */
def writer = {
  append "John"
  append = "lives in Cleveland"
  println delegate.class.name
}

void append(String text) {
  println "Appending '$text'"
}

StringBuffer sb = new StringBuffer()
writer.resolveStrategy = Closure.DELEGATE_FIRST
writer.delegate = sb

writer()