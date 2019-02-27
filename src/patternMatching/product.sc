

trait Expression
case class Num(x:Int) extends Expression
case class Add(l:Expression,r:Expression) extends Expression
case class Product(a:Expression, b:Expression) extends Expression

object expressions{
  def view(e:Expression):String = e match {
    case Num(x) => x.toString
    case Product(a,b) => "(" + view(a) + "*" + view(b) + ")"
    case Add(a,b) => "(" + view(a) + "+" + view(b) + ")"
  }

  view(Add(Product(Add(Num(3),Num(6)),Num(5)), Num(4)))


}