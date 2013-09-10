package scala.tutorials.patternmatching

case class Calculator(brand: String, model: String)

object MatchingOnClassMembers extends App {

  val hp20b = Calculator("hp", "20B")
  val hp20B = Calculator("hp", "20B")
  val hp30B = Calculator("hp", "30B")


  // case classes automatically have equality and nice toString methods based on the constructor arguments.
  println(hp20b == hp20B) // > true

  // case classes are designed to be used with pattern matching
  def calcType(calc: Calculator) = calc match {
    case Calculator("hp", "20B") => "financial"
    case Calculator("hp", "48G") => "scientific"
    case Calculator("hp", "30B") => "business"
    case Calculator(ourBrand, ourModel) => "Calculator: %s %s is of unknown type".format(ourBrand, ourModel)
  }

  println(calcType(hp20B))  // > financial
  println(calcType(hp30B))  // > business
}
