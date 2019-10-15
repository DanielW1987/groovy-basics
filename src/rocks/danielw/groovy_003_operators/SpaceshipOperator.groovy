package rocks.danielw.groovy_003_operators

// The spaceship operator (<=>) delegates to the compareTo method
// In other words, you are effectively sorting your elements in ascending order.
assert (1 <=> 1) == 0
assert (1 <=> 2) == -1
assert (2 <=> 1) == 1
assert ('a' <=> 'z') == -1