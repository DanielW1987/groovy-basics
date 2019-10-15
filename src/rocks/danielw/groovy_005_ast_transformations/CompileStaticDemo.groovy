package rocks.danielw.groovy_005_ast_transformations

import groovy.transform.CompileStatic
import groovy.transform.TypeCheckingMode

/*
 * This will let the Groovy compiler use compile time checks in the style of Java then perform static compilation, thus bypassing
 * the Groovy meta object protocol.
 *
 * When a class is annotated, all methods, properties, files, inner classes, etc. of the annotated class will be type checked.
 * When a method is annotated, static compilation applies only to items (closures and anonymous inner classes) within the method.
 *
 * By using TypeCheckingMode.SKIP, static compilation can be skipped on an element within a class or method otherwise marked with
 * CompileStatic.
 */
@CompileStatic
class CompileStaticDemo {

  String foo() {
    return "foo"
  }

  String bar() {
    return "bar"
  }

  @CompileStatic(TypeCheckingMode.SKIP)
  void noReturn() {}

}
