package scala.scalaschool.datastructures

object DataStructures extends App {
  // list
  var numbers = List(1, 2, 3, 4)
  var numbers2 = 1 :: 2 :: 3 :: Nil


  // set
  Set(1, 1, 2)


  // Tuple
  // A tuple groups together simple logical collections of items without using a class

  val hostPort = ("localhost", 80)
  // > hostPort: (String, Int) = (localhost, 80)
  hostPort._1
  hostPort._2

  // Tuples fit with pattern matching nicely.

  hostPort match {
    case ("localhost", port) => "port on local"
    case (host, port) => "others"
  }

  // Tuple has some special sauce for simply making Tuples of 2 values: ->
  1 -> 2
  // > (Int, Int) = (1,2)

  // Maps:
  // It can hold basic datatypes.
  Map(1 -> 2)
  Map("foo" -> "bar")

  // with variable argument syntax
  Map(1 -> "one", 2 -> "two")

  // the above statement expands to
  Map((1, "one"), (2, "two"))

  // Maps can themselves contain Maps or even functions as values.
  def multiply(m: Int)(n: Int): Int = m * n

  Map("multiple" -> {multiply(_)})


  // Option, Option is a container that may or may not hold something.
  val numberMap = Map(1 -> "one", 2 -> "two")
  println(numberMap.get(2)) // > Option[java.lang.String] = Some(two)
  println(numberMap.get(3)) // > Option[java.lang.String] = None


  // map
  // Evaluates a function over each element in the list, returning a list with the same number of elements.
  println(numbers.map((i: Int) => i * 2)) // > List[Int] = List(2, 4, 6, 8)

  // foreach
  // foreach is like map but returns nothing. foreach is intended for side-effects only.

  // returns nothing.
  println(numbers.foreach((i: Int) => i * 2)) // > ()



  // filter
  // removes any elements where the function you pass in evaluates to false
  println(numbers.filter((i: Int) => i % 2 == 0)) // > 2, 4

  def isEven(i: Int): Boolean = i % 2 == 0

  numbers.filter(isEven _)


  // zip
  // zip aggregates the contents of two lists into a single list of pairs.
  List(1, 2, 3).zip(List("a", "b", "c"))
  // > List((1,a), (2,b), (3,c))


  // partition
  // partition splits a list based on where it falls with respect to a predicate function.
  numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  numbers.partition(_ %2 == 0)
  // > (List[Int], List[Int]) = (List(2, 4, 6, 8, 10),List(1, 3, 5, 7, 9))


  // find
  // find returns the first element of a collection that matches a predicate function.
  numbers.find((i: Int) => i > 5)
  // > Option[Int] = Some(6)


  // flatten
  // flatten collapses one level of nested structure.
  List(List(1, 2), List(3, 4)).flatten
  // > List[Int] = List(1, 2, 3, 4)



  // flatMap
  // flatMap is a frequently used combinator that combines mapping and flattening. flatMap takes a function that
  // works on the nested lists and then concatenates the results back together.
  val nestedNumbers = List(List(1, 2), List(3, 4))
  nestedNumbers.flatMap(x => x.map(_ * 2))
  // > List[Int] = List(2, 4, 6, 8)
}
