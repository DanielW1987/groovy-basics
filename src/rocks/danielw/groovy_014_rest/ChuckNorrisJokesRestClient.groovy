package rocks.danielw.groovy_014_rest

import groovyx.net.http.ContentType
@Grab('org.codehaus.groovy.modules.http-builder:http-builder:0.7.1')
import groovyx.net.http.RESTClient

String BASE_URL = "http://api.icndb.com"
def chuck = new RESTClient(BASE_URL)
chuck.contentType = ContentType.JSON

// simple GET
chuck.get(path: "/jokes/random") { response, json ->
  println response.status
  println json
}

// GET with parameter
def params = [firstName: "John", lastName: "Doe"]
chuck.get(path: "/jokes/random", query: params) { response, json ->
  println response.status
  println json
}
