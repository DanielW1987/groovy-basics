package rocks.danielw.groovy_007_collections

/*
 * A Range represents the list of discrete items between some starting (or from) value and working up towards
 * some ending (or to) value. For a reverse range, the list is obtained by starting at the to value and working
 * down towards the from value.
 *
 * See: http://docs.groovy-lang.org/latest/html/gapi/groovy/lang/Range.html
 *
 * In Java you have to write the following:
 *
 * for (int i = 1; i <= 10; i++) {
 *   System.out.println(i);
 * }
 *
 * or
 *
 * for (int i = 10; i >= 1; i-) {
 *   System.out.println(i);
 * }
 *
 */

// creating an inclusive range from 1 to 10
Range range = 1..10
println range
println range.getClass().getName()

println "From: ${range.getFrom()}"            // or range.from
println "To: ${range.getTo()}"                // or range.to
println "Is reversed: ${range.isReverse()}"   // or range.reverse


// Forms a list by stepping through the range by the indicated interval.
def list = range.step(2) // [1, 3, 5, 7, 9]
println list


// creating an exclusive range
Range rangeExclusive = 1..<10 // from 1 to 9


// creating a reversed range
Range reversedRange = 20..0


// Ranges inherits all methods from List interface (some methods throw UnsupportedOperationException, e. g. add())
assert reversedRange.contains(5)
assert reversedRange.size() == 21 // 0 to 20 => 21 numbers
assert reversedRange.subList(0, 5) == 4..0
assert reversedRange instanceof java.util.List


// Ranges with letters
Range letterRange = 'a'..'z'
println letterRange


// Ranges with dates
Date today = new Date()
Date sevenDaysLater = today + 7
Range dayRange = today..sevenDaysLater
println dayRange