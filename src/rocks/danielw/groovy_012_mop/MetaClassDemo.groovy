package rocks.danielw.groovy_012_mop

class Developer {

}

// manipulating the meta class per instance
Developer developer = new Developer()
developer.metaClass.name = "Dan"
developer.metaClass.writeCode = { -> println "$name loves to write code..." }
developer.writeCode()

// manipulating the metal class for every instance
String.metaClass.shout = { -> toUpperCase() }
println "Hello World".shout()