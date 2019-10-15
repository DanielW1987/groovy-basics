package rocks.danielw.groovy_004_control_structures

println "same as for-in loop"
1.upto(5) {
  println it // it => reference to loop counter
}

println "iterating from 0 (inclusive) to 5 (exclusive)"
5.times {
  println it
}

println "iterating from 1 (inclusive) to 10 (exclusive) with steps of 2"
1.step(10, 2) {
  println it
}

println "you can omit the 'it' and do it like in Java"
1.upto(5) {
  num -> println num
}