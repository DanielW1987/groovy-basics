package rocks.danielw.groovy_015_gdk

import java.sql.Timestamp

// create a new date
Date today = new Date()
println today

// create a date for a specific date
println "create a date"
Date birthday = new Date(87, 6, 8) // month is index based
println birthday
println birthday.format("dd.MM.YYYY")
println "=" * 20

// add & subtract
println "add & subtract"
Date oneWeekFromToday = today + 7
Date oneWeekAgo = today - 7
println oneWeekFromToday
println oneWeekAgo
println "=" * 20

// downTo & upTo
println "downTo & upTo"
oneWeekFromToday.downto(today) {
  println it
}
println "=" * 20

// ranges
println "ranges"
Range twoWeeks = oneWeekAgo..oneWeekFromToday
twoWeeks.each {
  println it
}
println "=" * 20

// next & previous
println "next & previous"
Date newYear = new Date("01/01/2020")
println newYear.next()
println newYear.previous()
println "=" * 20

// timestamps
println "Timestamps"
Timestamp timestamp = today.toTimestamp()
println timestamp