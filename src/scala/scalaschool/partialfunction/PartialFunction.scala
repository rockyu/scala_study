package scala.scalaschool.partialfunction

object PartialFunction extends App {

  val one: PartialFunction[Int, String] = { case 1 => "one" }
  //> one: PartialFunction[Int,String] = <function1>
  val two: PartialFunction[Int, String] = { case 2 => "two" }
  val three: PartialFunction[Int, String] = { case 3 => "three" }
  val wildcard: PartialFunction[Int, String] = { case _ => "something else" }


  one.isDefinedAt(1) // > true
  one.isDefinedAt(2) // > false

  println(one(1)) // > one

  // PartialFunctions can be composed with something new, called orElse, that reflects whether the PartialFunction is defined over the supplied argument.
  val partial = one orElse two orElse three orElse wildcard


  println(partial(5))
  // > something else

  println(partial(3))
  // > three

  println(partial(2))
  // > two

  println(partial(1))
  // > one

  println(partial(0))
  // > something else
}
