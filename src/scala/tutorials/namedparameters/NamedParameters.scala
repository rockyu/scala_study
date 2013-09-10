package scala.tutorials.namedparameters

object NamedParameters extends App {

  // When calling methods and functions, you can use the name of the variables expliclty
  // in the call, like so:
  def printName(first:String, last:String) = {
    println(first + " " + last)
  }

  printName("John","Smith")
  // Prints "John Smith"

  printName(first = "John",last = "Smith")
  // Prints "John Smith"

  printName(last = "Smith",first = "John")
  // Prints "John Smith"

  // Note that once you are using parameter names in your calls, the order doesn’t matter, so long as all parameters are named. This feature works well with default parameter values:

  def printNameV2(first:String = "John", last:String = "Smith") = {
    println(first + " " + last)
  }

  printNameV2(last = "Jones")
  // Prints "John Jones"

}
