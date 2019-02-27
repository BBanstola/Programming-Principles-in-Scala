/**
  * Created by Own on 2/27/2019.
  */

trait Expr
case class Number(n:Int) extends Expr
case class Sum(x:Expr,y:Expr) extends Expr

object exprs{
  def show(e:Expr):String = e match {
    case Number(x) => x.toString
    case Sum(a,b)=> show(a) + "+" + show(b)
  }
  show(Sum(Number(1),Number(5)))

}








