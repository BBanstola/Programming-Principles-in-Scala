/* Add a method neg to class Rational that is used like this.
x.neg should evaluate to the negative of the rational number x.
As a second step, now add a method subtract or sub to subtract
two rational numbers. */

object rationals{
  val x = new Rational(1,3)
  val y = new Rational(5,7)
  val z = new Rational(3,2)

  x.add(y).makeString
  x.sub(y).sub(z).makeString

  x.less(y)
  x.max(z).makeString
}

class Rational(x: Int, y:Int){

  require(y> 0,"Denominator must be positive")

  private def gcd(a: Int, b:Int):Int = if (b==0)a else gcd(b,a%b)
  private val g = gcd(x,y)
  
  def numer = x / g
  def denom = y / g

  def neg: Rational = new Rational(
      -numer,denom)

  def add(that: Rational) = new Rational(
    numer * that.denom + that.numer * denom , denom*that.denom
  )

  def less(that:Rational) = numer*that.denom < that.numer*denom

  def max(that:Rational) = if (this.less(that)) that else this

  def sub(that: Rational) = add(that.neg)

  def makeString = (numer + "/" + denom)
}
