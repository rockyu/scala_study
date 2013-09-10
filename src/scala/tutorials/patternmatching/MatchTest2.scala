package scala.tutorials.patternmatching

// The block with the case statements defines a function which maps integers to strings. The
// match keyword provides a convenient way of applying a function (like the pattern matching
// function above) to an object.

// Here is a second example which matches a value against patterns of different types:
object MatchTest2 extends App {

  def matchTest(x: Any): Any =
    x match {
      case 1 => "one"
      case "two" => 2
      case y: Int => "scala.Int"
    }

  // out: 2
  println(matchTest("two"))
}