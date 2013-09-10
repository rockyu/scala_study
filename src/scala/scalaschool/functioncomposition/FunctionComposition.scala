package scala.scalaschool.functioncomposition

object FunctionComposition extends App {
  def f(s: String) = "f(" + s + ")"
  def g(s: String) = "g(" + s + ")"

  // compose
  // compose makes a new function that composes other functions f(g(x))

  val fComposeG = f _ compose g _
  // > fComposeG: (String) => java.lang.String = <function>

  println(fComposeG("yay"))
  // > f(g(yay))



  // andThen
  // andThen is like compose, but calls the first function and then the second, g(f(x))

  val fAndThenG = f _ andThen g _
  // > fAndThenG: (String) => java.lang.String = <function>

  println(fAndThenG("yay"))
  // > g(f(yay))
}



