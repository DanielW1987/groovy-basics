package rocks.danielw.groovy_005_ast_transformations

import javax.sql.DataSource

/*
 * Class annotation to make a singleton class. The singleton is obtained through normal property access using the singleton
 * property (defaults to "instance"). Such classes can be initialized during normal static initialization of the class or
 * lazily (on first access). To make the singleton lazy use @Singleton(lazy=true). Lazy singletons are implemented with
 * double-checked locking and a volatile backing field. By default, no explicit constructors are allowed. To create one or
 * more explicit constructors use @Singleton(strict=false).
 *
 * This could be used to:
 *  - provide your own custom initialization logic in your own no-arg constructor - you will be responsible for the entire
 *    code (the @Singleton annotation becomes merely documentation)
 *  - provide one or more constructors with arguments for a quasi-singleton - these constructors will be used to create
 *    instances that are independent of the singleton instance returned by the singleton property
 */
@Singleton(lazy = true)
class DatabaseSource {

  String url
  String user
  String password
  String database

}

DatabaseSource dbSource1 = DatabaseSource.getInstance()
DatabaseSource dbSource2 = DatabaseSource.instance
