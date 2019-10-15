package rocks.danielw.groovy_003_operators

import groovy.transform.ToString

@ToString(includePackage = false)
class Account {

  BigDecimal balance

  Account plus(Account other) {
    return new Account(balance: this.balance + other.balance)
  }

  Account minus(Account other) {
    return new Account(balance: this.balance - other.balance)
  }

}

Account savings = new Account(balance: 100.0)
Account checking = new Account(balance: 500.0)

/*
 * Groovy allows you to overload the various operators so that they can be used with your own classes.
 * Only works if the class implements the methods plus() and minus(), since the operation + is mapped to this method.
 */
println savings + checking
println checking - savings


/*
 * See: http://docs.groovy-lang.org/latest/html/documentation/#Operator-Overloading
 * Here is a complete list of the operators and their corresponding methods:
 *
 * a + b    => a.plus(b)
 * a[b]     => a.getAt(b)
 * a - b    => a.minus(b)
 * a[b] = c => a.putAt(b, c)
 * a * b    => a.multiply(b)
 * a in b   => b.isCase(a)
 * a / b    => a.div(b)
 * a << b   => a.leftShift(b)
 * a % b    => a.mod(b)
 * a >> b   => a.rightShift(b)
 * a ** b   => a.power(b)
 * a >>> b  => a.rightShiftUnsigned(b)
 * a | b    => a.or(b)
 * a++      => a.next()
 * a & b    => a.and(b)
 * a--      => a.previous()
 * a ^ b    => a.xor(b)
 * +a       => a.positive()
 * a as b   => a.asType(b)
 * -a       => a.negative()
 * a()      => a.call()
 * ~a       => a.bitwiseNegate()
 */
