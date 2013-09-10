package scala.tutorials.inference

// Also return types of methods can often be omitted since they corresponds to the type of
// the body, which gets inferred by the compiler.

object InferenceTest1 extends App {
  val x = 1 + 2 * 3 // the type of x is Int

  val y = x.toString() // the type of y is String

  def succ(x: Int) = x + 1 // method succ returns Int values
}
