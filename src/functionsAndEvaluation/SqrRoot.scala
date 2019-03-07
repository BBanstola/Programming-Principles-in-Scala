/**
  * Created by Own on 3/7/2019.
  */

//Compute `sqrt(x)` using Newton's method:

def abs(x:Double):Double = if (x<0) -x else x
def sqrt(x:Double):Double={
  def iterator(guess: Double):Double = {
    def goodGuess(guess:Double):Boolean = abs(guess*guess - x) < 0.001
    def betterGuess(guess:Double):Double = (guess + x/guess) / 2
    if (goodGuess(guess)) guess
    else iterator(betterGuess(guess))
  }
  iterator(1.0)
}
println(sqrt(10.0))