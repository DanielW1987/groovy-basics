package rocks.danielw.groovy_015_gdk

import groovy.text.SimpleTemplateEngine
import groovy.text.Template

/*
 * Template Placeholders
 *
 * $variable        Inserts the value of the variable into the text
 * ${groovycode}    Evaluates single line groovy code and inserts the result into the text
 * <%=groovycode%>  Evaluates the groovy code and insert the result into the text
 * <%groovycode%>   Evaluates the groovy code
 */

/*
 * 3 components to building a dynamic template
 *
 * 1. Engine (SimpleTemplateEngine)
 * 2. Template (dynamic-email.txt)
 * 3. Data Bindings (The data to insert into the dynamic portions of our email)
 */

SimpleTemplateEngine engine = new SimpleTemplateEngine(true) // produces verbose output
Template template = engine.createTemplate(new File("dynamic-email.txt"))

Map bindings = [
        firstName: "John",
        lastName: "Doe",
        commits: 27,
        repositories: [
                [name: "Apache Groovy Course", url: "https://github.com/apache-groovy-course"],
                [name: "Spring Boot REST", url: "https://github.com/spring-boot-rest"],
                [name: "Learning Spring Boot", url: "https://github.com/learning-spring-boot"]
        ]
]

println template.make(bindings)