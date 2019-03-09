/**
  * Created by Own on 3/9/2019.
  */

/* Check for primality (a non optimal yet concise approach) */

def isPrime(n:Int):Boolean =   (2 until n) forall (x => n % x != 0)

