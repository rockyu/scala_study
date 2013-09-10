package scala.tutorials.abstracttypes

import scala.tutorials.abstracttypes.IntSeqBuffer

// In Scala, classes are parameterized with values (the constructor parameters) and with types
// (if classes are generic). For reasons of regularity, it is not only possible to have values
// as object members; types along with values are members of objects. Furthermore, both forms
// of members can be concrete and abstract.


object AbstractTypeTest1 extends App {

  def newIntSeqBuf(elem1: Int, elem2: Int): IntSeqBuffer =
    new IntSeqBuffer {
      type T = List[U]
      val element = List(elem1, elem2)
    }

  val buf = newIntSeqBuf(7, 8)

  println("length = " + buf.length)
  println("content = " + buf.element)
}