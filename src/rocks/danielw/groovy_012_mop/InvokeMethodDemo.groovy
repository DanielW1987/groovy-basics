package rocks.danielw.groovy_012_mop

// This method is called when the method you called is not present on a Groovy object
class InvokeDemo {

  def test() {
    return "method exists"
  }

  @Override
  Object invokeMethod(String s, Object o) {
    return "called invokeMethod $s $o"
  }
}

def invokeDemo = new InvokeDemo()

assert invokeDemo.test() == "method exists"
assert invokeDemo.someMethod() == "called invokeMethod someMethod []"