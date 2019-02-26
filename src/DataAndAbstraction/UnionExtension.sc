
/*The task is to add a new method to our IntSet class hierarchy.
The method should take the union of a set and some other set.*/

abstract class IntSet{
  def incl(x:Int): IntSet
  def contains(x: Int): Boolean
  def union(other: IntSet): IntSet
}

class NonEmpty(elem:Int, left: IntSet, right: IntSet) extends IntSet{
  def contains(x:Int):Boolean ={
    if (x < elem) left contains x
    else if (x > elem) right contains x
    else true
  }
  def incl(x:Int):IntSet = {
    if (x < elem) new NonEmpty(elem, left incl x, right)
    else if (x > elem) new NonEmpty(elem, left, right incl x)
    else this
  }
  def union(other: IntSet):IntSet =
    ((left union right)union other) incl elem
    override def toString = "{" + left + elem + right+ "}"
}

class Empty extends IntSet {
  def contains(x: Int): Boolean = false

  def incl(x: Int): IntSet = new NonEmpty(x, new Empty, new Empty)

  override def toString = "."

  def union(other: IntSet): IntSet = other
}

