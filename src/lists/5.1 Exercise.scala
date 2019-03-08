
/*
### Exercise
  - Implement `removeAt(x, xs)` which removes the element at index `x` from the list `xs`

def removeAt[T](x: T, xs: List[T]): List[T] = xs take x ::: xs drop x + 1

- Flatten a list of lists to a list

*/

def removeAt[T](x: T, xs: List[T]): List[T] = xs take x ::: xs drop x + 1

def flatten[A](l: List[A]): List[A] = l match {
  case Nil => Nil
  case (x: List[A]) :: xs => flatten(x) ::: flatten(xs)
  case (x: A) :: (xs: List[A]) => x :: flatten(xs)
}




