 /*Exercise: Create a class for polynomials and implement the `+` function*/

class Poly(val terms: Map[Int, Double]) {
  def + (other: Poly): Poly = new Poly(terms ++ (other.terms map adjust))
  def adjust(term: (Int, Double)): (Int, Double) = {
    val (exp, coeff) = term
    terms get exp match {
      case Some(c1) => exp -> (coeff + c1)
      case None => exp -> coeff
    }
  }
    override def toString =
    (for ((exp, coeff) <- terms.toList.sorted.reverse) yield coeff + "X^" +exp) mkString "+"

  val p1 = new Poly(Map(1 -> 2.0, 3-> 4.0, 5-> 6.2 ))

  val p2 = new Poly(Map(1 -> 3.0, 3-> 7.0))

  p1+p2
}

// With Default Values

 class Polynomial(terms0: Map[Int, Double]) {
   val terms = terms0 withDefaultValue 0.0
   def + (other: Polynomial): Polynomial = new Polynomial(terms ++ (other.terms map adjust))
   def adjust(term: (Int, Double)): (Int, Double) = {
     val (exp, coeff) = term
     exp -> (coeff + terms(exp))
   }
 }