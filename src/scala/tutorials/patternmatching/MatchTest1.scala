package scala.tutorials.patternmatching

// Scala has a built-in general pattern matching mechanism. It allows to match on any sort
// of data with a first-match policy. Here is a small example which shows how to match
// against an integer value:
object MatchTest1 extends App {

  def matchTest(x: Int): String =
    x match {
      case 1 => "one"
      case 2 => "two"
      case _ => "many"
    }

  // The _ in the last case statement is a wildcard; it ensures that we can handle any statement. Otherwise you will
  // suffer a runtime error if you pass in a number that doesn’t match

  // out: many
  println(matchTest(3))


}
