/**
  * Created by Own on 3/8/2019.
  */

/*  Define a function `pack` that packs consecutive duplicates of list elements into sublists.
    Example: `pack(List("a", "a", "a", "b", "c", "c", "a"))` should return `List(List("a", "a", "a"), List("b"), List("c", "c"), List("a"))`
 */

def pack[T](xs: List[T]): List[List[T]] = xs match {
  case Nil => Nil
  case y :: ys =>
    val (first, rest) = xs span (z => z == y)
    first :: pack(rest)
}

/*  Using `pack` define `encode` that returns `List(List("a", 3), List("b", 1), List("c", 2), List("a", 1))` for the same input.
*/


def encode[T](xs: List[T]): List[(T, Int)] =
  pack(xs) map (x => (x.head, x.length))

