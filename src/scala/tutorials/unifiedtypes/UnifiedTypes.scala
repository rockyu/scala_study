package scala.tutorials.unifiedtypes

// In contrast to Java, all values in Scala are objects (including numerical values and functions).
// Since Scala is class-based, all values are instances of a class. The diagram below illustrates
// the class hierarchy.

object UnifiedTypes extends App {

  val set = new scala.collection.mutable.LinkedHashSet[scala.Any]
  set += "This is a string" // add a string
  set += 732 // add a number
  set += 'c' // add a character
  set += true // add a boolean value
  set += main _ // add the main function

  val iter: Iterator[Any] = set.iterator
  while (iter.hasNext) {
    println(iter.next.toString())
  }

  // This is a string
  // 732
  // c
  // true
  // <function>
}