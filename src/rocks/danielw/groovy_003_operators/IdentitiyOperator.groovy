package rocks.danielw.groovy_003_operators

/*
 * In Groovy, using == to test equality is different from using the same operator in Java.
 * In Groovy, == is calling equals. If you want to compare reference equality, you should
 * use 'is' like in the following example:
 */
def list1 = ['Groovy 1.8','Groovy 2.0','Groovy 2.3']
def list2 = ['Groovy 1.8','Groovy 2.0','Groovy 2.3']
assert list1 == list2
assert !list1.is(list2)
