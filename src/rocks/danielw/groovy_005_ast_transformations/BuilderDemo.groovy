package rocks.danielw.groovy_005_ast_transformations

import groovy.transform.ToString
import groovy.transform.builder.Builder

/*
 * The @Builder AST transformation is used to help write classes that can be created using fluent api calls. The transform supports
 * multiple building strategies to cover a range of cases and there are a number of configuration options to customize the building
 * process. In addition, a number of annotation attributes let you customise the building process. Not all annotation attributes are
 * supported by all strategies. See the individual strategy documentation for more details. If you're an AST hacker, you can also
 * define your own strategy class. The following strategies are bundled with Groovy:
 *  - SimpleStrategy for creating chained setters
 *  - ExternalStrategy where you annotate an explicit builder class while leaving some buildee class being built untouched
 *  - DefaultStrategy which creates a nested helper class for instance creation
 *  - InitializerStrategy which creates a nested helper class for instance creation which when used with @CompileStatic allows type-safe object creation
 *
 * Note that Groovy provides other built-in mechanisms for easy creation of objects.
 */
@Builder(prefix = "with")
@ToString(includePackage = false)
class Developer {

  String firstName
  String lastName
  String email
  Date hireDate
  List<String> programmingLanguages

}

Developer developer = Developer.builder()
                               .withFirstName("John")
                               .withLastName("Doe")
                               .withEmail("john.doe@example.com")
                               .withHireDate(new Date())
                               .withProgrammingLanguages(["Java", "Groovy", "Python"])
                               .build()

println developer

// this has nothing to do with the builder, but is also possible
Developer developer1 = new Developer()
developer1.with {
  firstName = "Maria"
  lastName = "Thompson"
  email = "maria.thompson@exaxple.com"
  hireDate = new Date()
  programmingLanguages = ["Java", "Go"]
}

println developer1