package rocks.danielw.groovy_007_collections

import org.hamcrest.core.Is

// Create a range from an enum
Range dayRange = WeekDays.SUNDAY..WeekDays.SATURDAY

// Print the size of the Range
println "Size of dayRange: ${dayRange.size()}"

// Use the contains method to see if Wednesday is in that Range
assert dayRange.contains(WeekDays.WEDNESDAY)

// Print the from element of this range
println "From element: ${dayRange.from}"

// Print the to element of this range
println "To element: ${dayRange.to}"



// Create a list days (Sun - Sat)
def dayList = (WeekDays.SUNDAY..WeekDays.SATURDAY).toList()

// Print out the list
dayList.each {print "$it "}

// Print the size of the list
println "Size of the list is ${dayList.size()}"

// Remove Saturday from the list
dayList.removeElement(WeekDays.SATURDAY)
println dayList

// Add Saturday back by appending it to the list
dayList << WeekDays.SATURDAY
println dayList

// Print out the Wednesday using its index
println dayList[3]



// Create a map of days of the week (1: Sunday, 2:Monday, etc...)
def dayMap = [:]
(WeekDays.SUNDAY..WeekDays.SATURDAY).eachWithIndex {WeekDays weekDay, int index ->
  dayMap[index] = weekDay
}

// Print out the map
println dayMap

// Print out the class name of the map
println "Class name of the map is ${dayMap.getClass().getName()}"

// Print the size of the map
println "Size of the map is ${dayMap.size()}"

// Is there a method that would easily print out all of the days (values)?
println dayMap.values()
