package rocks.danielw.groovy_005_ast_transformations

import groovy.transform.Sortable
import groovy.transform.ToString

/*
 * A class annotation used to make a class Comparable by (potentially) multiple Comparators.
 * The generated Groovy class will:
 *  - implement the Comparable interface
 *  - have a compareTo method based on the name and age properties (priority ordering will be according to the ordering of property
 *    definition, highest first, unless 'includes' is used; in which case, priority will be according to the order given in the includes list)
 *  - have two Comparator methods named comparatorByName and comparatorByAge
 *  - sort by natural order by default, reversed natural order can be specified
 *
 * The properties within the class must themselves be Comparable or @Sortable.
 */
@Sortable(includes = "age")
@ToString(includePackage = false)
class Animal {

  String name
  int age

}

def a1 = new Animal(name: "Amber", age: 5)
def a2 = new Animal(name: "Rex", age: 4)

def animals = [a1, a2]
println animals

def sortedAnimals = animals.sort(false) // do not mutate the original collection
println sortedAnimals
println animals
