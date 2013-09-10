package scala.tutorials.operators

// Any method which takes a single parameter can be used as an infix operator in Scala. Here is the
// definition of class MyBool which defines three methods and, or, and negate.
class MyBool(x: Boolean) {

  def and(that: MyBool): MyBool = if (x) that else this

  def or(that: MyBool): MyBool = if (x) this else that

  def negate: MyBool = new MyBool(!x)

  override def toString: String = x + ""
}
