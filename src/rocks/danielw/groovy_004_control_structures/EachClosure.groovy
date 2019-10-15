package rocks.danielw.groovy_004_control_structures

def list = [1, 2, 3, 4, 5]
list.each {
  println it
}

(1..10).each {
  println it
}

Range range = 20..10
range.each {
  print "${it} "
}