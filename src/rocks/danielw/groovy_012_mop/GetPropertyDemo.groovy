package rocks.danielw.groovy_012_mop

// Every read access to a property can be intercepted by overriding the getProperty() method of the current object

class PropertyDemo {
  String prop1 = "prop1"
  String prop2 = "prop2"
  String prop3 = "prop3"

  def getProperty(String name) {
    println "getProperty() called with argument $name"
    return metaClass.getProperty(this, name)
  }

  def propertyMissing(String name) {
    return "property '$name' is missing"
  }

  def propertyMissing(String name, def arg) {

  }
}

def propertyDemo = new PropertyDemo()

println propertyDemo.prop1
println propertyDemo.prop2
println propertyDemo.prop3
println propertyDemo.prop4