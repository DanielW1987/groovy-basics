package rocks.danielw.groovy_004_control_structures

println "\nsimple for loop for ranges"
for (i in 1..5) {
  println i
}

println "\n\niterating a String"
for (c in "Hello World") {
  print "${c} "
}

println "\n\niterating a list"
for (i in [10, 20, 30, 40, 50]) {
  print "${i} "
}

println "\n\niterating a array"
for (i in (0..20).toArray()) {
  print "${i} "
}

println "\n\niterating a map"
def map = ["abc" : 1, "def" : 2, "ghi": 3]
for (entry in map) {
  println "The entry: ${entry}"
  println "${entry.key} => ${entry.value}"
}

println "\n\niterating map values"
def map2 = [1 : "Java", 2 : "Groovy", 3: "Kotlin"]
for (value in map2.values()) {
  print "${value} | "
}
