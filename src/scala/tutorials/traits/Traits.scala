package scala.tutorials.traits

import scala.tutorials.Point

// Similar to interfaces in Java, traits are used to define object types by specifying
// the signature of the supported methods. Unlike Java, Scala allows traits to be partially
// implemented; i.e. it is possible to define default implementations for some methods.
// In contrast to classes, traits may not have constructor parameters

// Traits are typically integrated into a class (or other traits) with a mixin class composition:

object TraitsTest extends App {

  val p1 = new Point(2, 3)
  val p2 = new Point(2, 4)
  val p3 = new Point(3, 3)

  println(p1.isNotSimilar(p2))
  println(p1.isNotSimilar(p3))
  println(p1.isNotSimilar(2))

}