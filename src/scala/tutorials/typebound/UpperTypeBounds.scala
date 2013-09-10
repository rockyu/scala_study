package scala.tutorials.typebound

// An upper type bound T <: A declares that type variable T refers to a subtype of type A. Here
// is an example which relies on an upper type bound for the implementation of the polymorphic
// method findSimilar:
trait Similar {
  def isSimilar(x: Any): Boolean
}

case class MyInt(x: Int) extends Similar {
  def isSimilar(m: Any): Boolean =
    m.isInstanceOf[MyInt] &&
      m.asInstanceOf[MyInt].x == x
}


// In Scala, type parameters and abstract types may be constrained by a type bound. Such type
// bounds limit the concrete values of the type variables and possibly reveal more information
// about the members of such types.

object UpperBoundTest extends App {

  def findSimilar[T <: Similar](e: T, xs: List[T]): Boolean =
    if (xs.isEmpty) false
    else if (e.isSimilar(xs.head)) true
    else findSimilar[T](e, xs.tail)

  val list: List[MyInt] = List(MyInt(1), MyInt(2), MyInt(3))

  // out: false
  println(findSimilar[MyInt](MyInt(4), list))

  // out: true
  println(findSimilar[MyInt](MyInt(2), list))
}