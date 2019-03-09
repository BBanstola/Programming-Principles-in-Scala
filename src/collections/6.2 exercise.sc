/* Given a positive integer `n`, find all pairs of positive intefers
 `i` and `j` with `1 <= j < i < n` such that `i + j` is prime. */

def isPrime(n:Int):Boolean =   (2 until n) forall (x => n % x != 0)

object pairs{
  val n = 7
 (1 until n ) flatMap (i => (1 until i) map (j => (i,j))) filter (a => isPrime(a._1+a._2))

}

// OR

val n = 7
for {
  i <- 1 until n
  j <- 1 until i
  if isPrime(i+j)
} yield (i,j)