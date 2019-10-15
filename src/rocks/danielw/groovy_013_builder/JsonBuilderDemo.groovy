package rocks.danielw.groovy_013_builder

import groovy.json.JsonBuilder
import groovy.json.JsonSlurper

/*
 * Writing Json
 */
JsonBuilder builder = new JsonBuilder()
builder.books {

  currentBook {
    title "The 4 Hour Work Week"
    isbn "978-0-0307-46535-1"
    author(first: "Timothy", last: "Ferris", twitter: "@tferris")
    related "The 4 Hour Body", "The 4 Hour chef"
  }

  previousBook {
    title "The 4 Hour Body"
    isbn "978-0-0307-46535-2"
    author(first: "Timothy", last: "Ferris", twitter: "@tferris")
    related "The 4 Hour Work Week", "The 4 Hour chef"
  }

}

new File("books.json").write(builder.toPrettyString())

/*
 * Reading Json
 */
JsonSlurper jsonSlurper = new JsonSlurper()
def json = jsonSlurper.parse(new File("books.json"))

println json.getClass().getName()
println json.books.currentBook