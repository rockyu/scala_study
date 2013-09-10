package scala.tutorials.patternmatching

object MatchingOnType extends App {

  // You can use match to handle values of different types differently.
  def bigger(o: Any): Any = {
    o match {
      case i: Int if i < 0 => i - 1
      case i: Int => i + 1
      case d: Double if d < 0.0 => d - 0.1
      case d: Double => d + 0.1
      case text: String => text + "s"
    }
  }

  println(bigger(5)) // 6
  println(bigger(-5)) // -6
  println(bigger("rock")) // rocks
}
