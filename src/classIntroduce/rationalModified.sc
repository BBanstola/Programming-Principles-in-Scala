/* Modify the rational class so that all rational numbers are kept unsimplified internally */

object rationals{
  val a = new Rational(3,2)
  val b = new Rational(5,2)

  a.add(b).makeString
}

class Rational(x:Int, y:Int){
  def num = x
  def denum = y

  require(y>0,"Denominator must be positive")

  def add(that:Rational) = new Rational(that.denum*num + that.num*denum, denum*that.denum)

  def neg:Rational = new Rational(0-num, denum)

  def minus(that:Rational) = add(that.neg)

  private def gcd(a:Int,b:Int):Int = if (b==0)a else gcd(b,a%b)

  def makeString ={
    val g = gcd(num, denum)
    num/g + "/" +denum/g}






}