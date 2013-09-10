package scala.tutorials.inference


// Scala has a built-in type inference mechanism which allows the programmer to omit certain
// type annotations. It is, for instance, often not necessary in Scala to specify the type
// of a variable, since the compiler can deduce the type from the initialization expression
// of the variable.

object InferenceTest3 extends App {
  def id[T](x: T) = x

  val p = MyPair(1, "scala") // type: MyPair[Int, String], equivalent to:
  val pp: MyPair[Int, String] = MyPair[Int, String](1, "scala")

  val q = id(1) // type: Int, equivalent to
  var qq: Int = id[Int](1)
}