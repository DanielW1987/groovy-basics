package rocks.danielw.groovy_003_operators

/*
 * The Spread-dot Operator (*.), often abbreviated to just Spread Operator, is used to invoke an action on all items of an aggregate
 * object. It is equivalent to calling the action on each item and collecting the result into a list:
 */
class Car {
  String make
  String model
}

def cars = [
        new Car(make: 'Peugeot', model: '508'),
        new Car(make: 'Renault', model: 'Clio')
]

// The expression cars*.make is equivalent to cars.collect{ it.make }
def makes = cars*.make
assert makes == ['Peugeot', 'Renault']


// other example
def v1 = "abc"
def v2 = "def"
def result = [v1, v2]*.toList()
assert result == [["a", "b", "c"], ["d", "e", "f"]]