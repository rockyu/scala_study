package scala.tutorials.higherorderfunctions


// Scala allows the definition of higher-order functions. These are functions that take other
// functions as parameters, or whose result is a function.

object FunTest extends App {

  // apply takes a function (Int => String) as parameter
  def apply(f: Int => String, v: Int) = f(v)

  val decorator = new Decorator("[", "]")

  println(apply(decorator.layout, 7))
  // out: [7]
}