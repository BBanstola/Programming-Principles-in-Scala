/**
  * Created by Own on 2/24/2019.
  */

//Simple implementation as per Lecture 4.1- Objects Everywhere


abstract class Boolean{
  def ifThenElse[T](t: => T, e: => T):T

  def && (x: => Boolean):Any = ifThenElse(x, false)
  def || (x: => Boolean):Any = ifThenElse(true, x)
  def unary_! : Boolean = ifThenElse(false, true)

  def == (x:Boolean):Boolean = ifThenElse(x, x.unary_!)
  def != (x:Boolean):Boolean = ifThenElse(x.unary_!,x)
}


object true extends Boolean{
  def ifThenElse[T](t: => T, e: => T) = t
}

object false extends Boolean{
  def ifThenElse[T](t: => T, e: => T) = e
}
