package scala.tutorials.regularexpressionpatterns

// In those cases, Scala allows patterns having a wildcard-star _* in the rightmost position
// to stand for arbitrary long sequences. The following example demostrate a pattern match
// which matches a prefix of a sequence and binds the rest to the variable rest.

object RegExpTest1 extends App {

  def containsScala(x: String): Boolean = {
    val z: Seq[Char] = x
    z match {
      case Seq('s', 'c', 'a', 'l', 'a', rest@_*) =>
        println("rest is " + rest)
        true
      case Seq(_*) =>
        false
    }
  }

  containsScala("scala-test")
  containsScala("nil")
}