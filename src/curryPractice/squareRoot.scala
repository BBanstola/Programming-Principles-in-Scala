/**
  * Created by Own on 2/6/2019.
  */

/* Write a square root function using fixed point and averageDamp */

import scala.math.abs

  val tolerance = 0.0001

  def isCloseEnough(x:Double,y:Double)= abs((x-y)/x)/x < tolerance

  def fixedPoint(f:Double => Double)(firstGuess:Double)={
    def iterate(guess:Double):Double = {
      val next = f(guess)
      if (isCloseEnough(guess,next)) next
      else iterate(next)
    }
    iterate(firstGuess)
  }
  def averageDamp(f:Double => Double)(x:Double)= (x+f(x))/2

  def sqrt(a:Double)= fixedPoint(averageDamp(y => a/y))(1)




