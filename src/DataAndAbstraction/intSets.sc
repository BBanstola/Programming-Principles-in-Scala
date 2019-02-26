object intSets{
  println("Welcome to 3.1 Class Hierarchies")

    val t1 = new NonEmpty(3, new Empty, new Empty)
    val t2 = (t1 incl 4)
}

abstract class Intset{
  def incl(x:Int): Intset
  def contains(x: Int): Boolean
}

class Empty extends Intset{
  def contains(x:Int): Boolean = false
  def incl(x: Int):Intset = new NonEmpty(x,new Empty, new Empty)
  override def toString = "."
}

class NonEmpty(elem: Int, left: Intset, right: Intset) extends Intset{
  def contains(x:Int):Boolean =
    if (x <  elem) left contains x
    else if (x > elem) right contains x
    else true

  def incl(x: Int): Intset =
    if (x < elem) new NonEmpty(elem, left incl x, right)
    else if (x > elem) new NonEmpty(elem, left, right incl x)
    else this
    override def toString = "{" + left + elem + right + "}"
}