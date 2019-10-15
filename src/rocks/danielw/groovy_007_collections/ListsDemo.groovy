package rocks.danielw.groovy_007_collections

class ListsDemo {

  static void main(String[] args) {
    println "Creating items"
    creatingLists()
    println "=" * 20

    println "Adding items"
    addingItems()
    println "=" * 20

    println "Removing items"
    removingItems()
    println "=" * 20

    println "Retrieving items"
    retrievingItems()
    println "=" * 20

    println "Looping lists"
    loopingLists()
    println "=" * 20

    println "Flattten"
    flatten()
    println "=" * 20

    println "Removing Duplicates"
    removingDuplicates()
    println "=" * 20

    println "Collect"
    collect()
    println "=" * 20
  }

  static void creatingLists() {
    def num = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    println num
    println num.getClass().getName() // java.util.ArrayList is used by default
  }

  static void addingItems() {
    def num = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

    num.push(-1) // push item to the head of the collection
    println num

    num.putAt(0, 0) // same as num[0] = 0
    num[0] = 0      // same as num.putAt(0, 0)
    println num

    num << 11 // adds 11 at the tail of the list
    num.add(12, 12) // adds 12 at the specified index
    println num

    def newNum = num + [13, 14, 15] // works like addAll() and returns a new list; the original list will not be modified
    println newNum
  }

  static void removingItems() {
    def num = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

    num.pop() // removes the first element
    println num

    num.removeAt(0) // removes the element at the specified index
    println num

    def newNum = num - [2, 3, 4] // removes 2,3,4 from list; ; the original list will not be modified
    println newNum
  }

  static void retrievingItems() {
    def num = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

    println num[0]
    println num.get(1)
    println num.getAt(1)
    println num[0..3]
    println num[4..2]
  }

  static void loopingLists() {
    def num = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

    println "Looping a list"
    for (n in num) {
      print "${n} "
    }
    println()
  }

  static void flatten() {
    def values = [1, 2, 3]

    // adding lists to the list
    values << [4, 5, 6]
    values << [7, 8, 9]

    println values

    // flatten the whole list
    println values.flatten()
  }

  static void removingDuplicates() {
    def letters = ['a', 'a', 'b', 'c', 'c']
    println letters.unique()

    def numbers = [1, 1, 1, 2, 2, 3, 4, 4] as Set
    println numbers
  }

  static void collect() {
    def nums = [1, 2, 3, 4, 5]
    def numsTimesTen = nums.collect {it * 10}
    println numsTimesTen
  }

}
