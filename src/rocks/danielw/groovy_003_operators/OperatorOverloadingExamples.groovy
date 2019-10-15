package rocks.danielw.groovy_003_operators

/*
 * List examples
 */
def list = [1, 2, 3, 4, 5]

// add element at the end
list << 6

println list
println list[2] // prints 3
println list[-2] // prints 5, starts at the end (-1 => 6, -2 => 5, -3 => 4 and so on)

// remove element from list
list = list - 3
println list

// replace element
list[1] = 3
println list


/*
 * String examples
 */
def name = "John"
println name[2]    // prints h
println name[-1]   // prints n
println name[0..2] // prints all character from index 0 to 2 (inclusive) => Joh
println name[1..3] // prints all character from index 1 to 3 (inclusive) => ohn
println name * 3   // prints John 3 times


def x = "Groovy is great!"
println x[0, 2, 4] // prints Gov


/*
 * Date examples
 */
Date today = new Date()
Date sevenDaysLater = today + 7
println today
println sevenDaysLater