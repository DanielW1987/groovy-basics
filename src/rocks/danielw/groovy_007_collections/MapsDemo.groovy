package rocks.danielw.groovy_007_collections

class MapsDemo {

  static void main(String... args) {
    println "Declaring a map"
    declaringAMap()
    println "=" * 20

    println "Adding items"
    addingItems()
    println "=" * 20

    println "Retrieving items"
    retrievingItems()
    println "=" * 20

    println "Removing items"
    removingItems()
    println "=" * 20

    println "Iterating maps"
    iteratingMaps()
    println "=" * 20

    println "Filtering"
    filtering()
    println "=" * 20

    println "Transforming and Collecting"
    transformingAndCollecting()
    println "=" * 20

    println "Grouping"
    grouping()
    println "=" * 20

    println "Sorting"
    sorting()
    println "=" * 20
  }

  static void declaringAMap() {
    // An empty map can be created using:
    def emptyMap = [:]
    println emptyMap

    // Similarly, a map with values can be instantiated using:
    def map = [name: "Jerry", age: 42, city: "New York"] // Notice that you can omit the quotes, the key is a String by default
    def map2 = ["name": "Jerry", "age": 42, "city": "New York"] // you can use quotes if you want

    // By default Groovy creates an instance of java.util.LinkedHashMap
    assert map.getClass().getName() == "java.util.LinkedHashMap"

    // declaring a HashMap
    Map<String,String> hashMap = new HashMap<String,String>()
    assert hashMap.getClass().getName() == "java.util.HashMap"
  }

  static void addingItems() {
    def map = [name:"Jerry"]
    map["age"] = 42                 // specifying the key in brackets; we have a compiler warning here because map is untyped
    map.city = "New York"           // using the key as property
    map.put("key", "value")  // as in Java
    println map

    // when we use variables as key we have to enclose the variable name in parenthesis
    def hobby = "Hobby"
    def hobbyMap = [(hobby): "Coding"]
    println hobbyMap
  }

  static void retrievingItems() {
    def map = [name:"Jerry", age: 42, city: "New York", hobby:"Singing"]
    assert map["name"] == "Jerry"        // specifying the key in brackets
    assert map.getAt("name") == "Jerry"  // same as map['key']
    assert map.name == "Jerry"           // using the key as property
    assert map.get("name") == "Jerry"    // as in Java
  }

  static void removingItems() {
    // remove value
    def salaries = ["John": 48_000, "Maria": 55_000, "Thomas": 68_000]
    salaries.remove("John")
    println salaries

    // remove specified key/value pairs with minus; original map will not be modified
    def map = [1: 20, a: 30, 2: 42, 4: 34, ba: 67, 6: 39, 7: 49]
    def minusMap = map.minus([2:42, 4:34])
    assert minusMap == [1: 20, a: 30, ba: 67, 6: 39, 7: 49]

    // Next, we can also remove entries based on a condition. This can be achieved using the removeAll() method:
    minusMap.removeAll {it.key instanceof String}
    assert minusMap == [1: 20, 6: 39, 7: 49]

    // Inversely, to retain all entries which satisfy a condition, we can use the retainAll() method:
    minusMap.retainAll {it.value % 2 == 0}
    assert minusMap == [1: 20]
  }

  static void iteratingMaps() {
    def map = ["John": 48_000, "Maria": 55_000, "Thomas": 68_000]

    for (entry in map) {
      println "The entry: ${entry}"
      println "${entry.key} => ${entry.value}"
    }

    for (key in map.keySet()) {
      println "$key:${map[key]}"
    }

    // We can iterate through entries using the each() method
    map.each {println "$it.key: $it.value"}

    // also possible:
    map.each {entry -> println "$entry.key: $entry.value"}

    // The eachWithIndex() method provides an index in addition to Entry. Both the methods accept a Closure as an argument.
    map.eachWithIndex {entry, i -> println "$i $entry.key: $entry.value"}

    // It's also possible to ask the key, value, and index be supplied separately:
    map.eachWithIndex {key, value, i -> println "$i $key: $value"}
  }

  static void filtering() {
    // We can use the find(), findAll() and grep() methods to filter and search for map entries based on keys and values.
    def map = ["John": 48_000, "Maria": 55_000, "Thomas": 68_000, "Stacey": 57_000, "Eric": 72_000, "Peter": 72_000]

    // First, we look at the find() method which accepts a Closure and returns the first Entry that matches the Closure condition:
    assert map.find {it.value == 68_000}.key == "Thomas"

    // Similarly, findAll also accepts a Closure but returns a Map with all the key-value pairs that satisfy the condition in the Closure:
    def expectedResult = ["Eric": 72_000, "Peter": 72_000]
    assert map.findAll {it.value == 72_000} == expectedResult

    // If we'd prefer to use a List, though, we can use grep (returns a list of map entries) instead of findAll:
    def grep = map.grep {it.value >= 60_000}
    println "All employees who earn 60,000 or more"
    grep.each {println it}

    // Next, to find out if all the items in a map satisfy a condition we can use every which returns a boolean.
    assert map.every {it.value instanceof Integer}

    // Similarly, we can use any to determine if any items in the map match a condition:
    assert map.any {it.value instanceof Integer}
  }

  static void transformingAndCollecting() {
    // At times we may want to transform the entries in a map into new values. Using the collect() and collectEntries()
    // methods it's possible to transform and collect entries into a Collection or Map respectively.
    def map = [
            1: [name:"Jerry", age: 42, city: "New York"],
            2: [name:"Long", age: 25, city: "New York"],
            3: [name:"Dustin", age: 29, city: "New York"],
            4: [name:"Dustin", age: 34, city: "New York"]]

    // We can collect the names of all employees into a list using collect():
    def names = map.collect {it.value.name}
    assert names == ["Jerry", "Long", "Dustin", "Dustin"]

    // Next, if we're interested in a unique set of names, we can specify the collection by passing a Collection object:
    def uniqueNames = map.collect([] as HashSet) {it.value.name}
    assert uniqueNames == ["Jerry", "Long", "Dustin"] as Set

    // If we want to change the employee names in the map from lowercase to uppercase, we can use collectEntries. This method returns a map of transformed values:
    def idNames = map.collectEntries {
      String emplName = it.value.name
      return [it.key, emplName.toUpperCase()]
    }
    assert idNames == [1:"JERRY", 2:"LONG", 3:"DUSTIN", 4:"DUSTIN"]

    // Lastly, it's also possible to use collect methods in conjunction with the find and findAll methods to transform the filtered results:
    def below30Names = map.findAll {it.value.age < 30}
                          .collect {it.value.name}

    assert below30Names == ["Long", "Dustin"]
  }

  static void grouping() {
    // The groupBy() method returns a map of maps. And each map contains key-value pairs which evaluate to the same result for the given condition:
    def map = [1: 20, 2: 40, 3: 11, 4: 93]

    def subMap = map.groupBy {it.value % 2}
    assert subMap == [0: [1: 20, 2: 40], 1: [3: 11, 4: 93]]

    // Another way of creating submaps is by using subMap(). It is different in groupBy() in the sense that it only allows for grouping based on the keys:
    def keySubMap = map.subMap([1, 2]) // In this case, the entries for keys 1 and 2 are returned in the new map, and all the other entries are discarded.
    assert keySubMap == [1: 20, 2: 40]
  }

  static void sorting() {
    // Usually, when sorting, we may want to sort the entries in a map based on key or value or both.
    // Groovy provides a sort() method which can be used for this purpose.
    def map = [ab: 20, a: 40, cb: 11, ba: 93]

    // If sorting needs to be done on key, use the no-args sort() method which is based on natural ordering:
    def naturallyOrderedMap = map.sort()
    assert [a: 40, ab: 20, ba: 93, cb: 11] == naturallyOrderedMap

    // Or use the sort(Comparator) method to provide comparison logic:
    def compSortedMap = map.sort({k1, k2 -> k1 <=> k2} as Comparator)
    assert [a: 40, ab: 20, ba: 93, cb: 11] == compSortedMap

    // Next, to sort on either key or values or both, we can supply a Closure condition to sort():
    def cloSortedMap = map.sort({it1, it2 -> it1.value <=> it2.value}) // sort by value
    assert [cb: 11, ab: 20, a: 40, ba: 93] == cloSortedMap
  }

}
