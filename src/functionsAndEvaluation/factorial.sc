// Factorial

def fact(n:Int):Int = if (n == 0) 1 else n * fact(n-1)

fact(5)

// Tail Recursive

def factorial(n:Int):Int = {
  def factTailRec(n:Int, product: Int):Int = {
    if (n == 1) product
    else factTailRec(n-1, product * n)
  }
  factTailRec(n,1)
}

factorial(6)