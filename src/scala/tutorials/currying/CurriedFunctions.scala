package scala.tutorials.currying

object CurriedFunctions extends App {

  def multiply(m: Int)(n: Int): Int = m * n

  def adder(m: Int, n: Int) = m + n


  // You can call it directly with both arguments
  multiply(2)(3)
  // print out: 6


  // You can fill in the first parameter and partially apply the second
  val timesTwo = multiply(2) _
  println(timesTwo(3))
  // print out: 6



  // You can take any function of multiple arguments and curry it
  val adder2 = (adder _).curried
  println(adder2(4)(6))
  // print out: 10
}
