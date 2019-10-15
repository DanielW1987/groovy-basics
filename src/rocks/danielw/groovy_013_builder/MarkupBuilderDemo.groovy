package rocks.danielw.groovy_013_builder

import groovy.xml.MarkupBuilder

/*
 * Writing XML
 */
File file = new File("sports.xml")
Writer writer = new FileWriter(file)
def builder = new MarkupBuilder(writer)
builder.doubleQuotes = true
builder.omitEmptyAttributes = true
builder.omitNullAttributes = true

builder.sports {
  sport(id: 1) {
    name "Baseball"
  }
  sport(id: 2) {
    name "Basketball"
  }
  sport(id: 3) {
    name "Football"
  }
  sport(id: 4) {
    name "Hockey"
  }
  sport(id: null, foo: "") {
    name ""
  }
}

/*
 * Reading XML
 */
def xmlSlurper = new XmlSlurper()
def xml = xmlSlurper.parse(new File("sports.xml"))

println xml.getClass().getName()
println xml.sport[2].name
