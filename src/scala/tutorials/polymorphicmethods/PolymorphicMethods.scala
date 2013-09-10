package scala.tutorials.polymorphicmethods

// Methods in Scala can be parameterized with both values and types. Like on the class
// level, value parameters are enclosed in a pair of parentheses, while type parameters
// are declared within a pair of brackets.

object PolyTest extends App {

  // duplicate x n times
  def dup[T](x: T, n: Int): List[T] =
    if (n == 0)
      Nil
    else
      x :: dup(x, n - 1)

  // out: List(3, 3, 3, 3)
  println(dup[Int](3, 4))

  // out: List(three, three, three)
  println(dup("three", 3))
}

// Please note that the trait App is designed for writing short test programs, but should be
// avoided for production code (for Scala versions 2.8.x and earlier) as it may affect the
// ability of the JVM to optimize the resulting code; please use def main() instead.