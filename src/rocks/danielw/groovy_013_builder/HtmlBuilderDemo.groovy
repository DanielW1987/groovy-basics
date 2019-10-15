package rocks.danielw.groovy_013_builder

import groovy.xml.MarkupBuilder

List courses = [
        [id: 1, name: "Apache Groovy"],
        [id: 2, name: "Spring Boot"]
]

MarkupBuilder builder = new MarkupBuilder()

builder.html {
  head {
    title "About Me"
    description "This is an about me page"
    keywords "Groovy, Java, Spring"
  }
  body {
    h1 "About Me"
    p "This is a bunch of text about me..."
    section {
      table {
        tr {
          th "id"
          th "name"
        }
        courses.each { course ->
          tr {
            td course.id
            td course.name
          }
        }
      }
    }
  }
}
