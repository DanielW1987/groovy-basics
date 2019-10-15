package rocks.danielw.groovy_005_ast_transformations

import groovy.transform.PackageScope
import groovy.transform.PackageScopeTarget

/*
 * Annotation used for turning off Groovy's auto visibility conventions.
 * By default, Groovy automatically turns package protected fields into
 * properties and makes package protected methods, constructors and
 * classes public. This annotation allows this feature to be turned off
 * and revert back to Java behavior if needed. Place it on classes, fields,
 * constructors or methods of interest
 */
@PackageScope // class is only visible in package instead of public by default
class PackageScopeDemo {

  @PackageScope // field is visible in package instead of private by default
  String firstName

  @PackageScope // constructor is only visible in package instead of public by default
  PackageScopeDemo () {}

  @PackageScope // method is only visible in package instead of public by default
  void doSomething() {}

}

@PackageScope([PackageScopeTarget.CLASS, PackageScopeTarget.FIELDS, PackageScopeTarget.METHODS])
class PackageScopeDemo2 {

  String firstName

  PackageScopeDemo2() {}

  void doSomething() {}

}