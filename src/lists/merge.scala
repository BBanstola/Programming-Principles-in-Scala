/**
  * Created by Own on 3/8/2019.
  */

/* merge` function of a merge sort algorithm using pattern matching on tuples (pairs) */

def merge(xs:List[Int], ys:List[Int]):List[Int] = (xs,ys) match {
  case (Nil,ys) => ys
  case (xs, Nil) => xs
  case (x::xs1, y::ys1) =>
    if (x<y) x::merge(xs1,ys)
    else y::merge(xs,ys1)

}

def msort(xs:List[Int]):List[Int] = {
  val n = xs.length/ 2
  if (n == 0) xs
  else {
    val (fst, snd) = xs.splitAt n
      merge(msort(fst), msort(snd))
  }
}


