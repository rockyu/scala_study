package scala.tutorials.operators


object MyBoolTest extends App {
  // It is now possible to use and and or as infix operators:
  def not(x: MyBool) = x negate; // semicolon required here
  def xor(x: MyBool, y: MyBool) = (x or y) and not(x and y)

// Here is the corresponding code in a more traditional object-oriented programming language syntax:
// def not(x: MyBool) = x.negate; // semicolon required here
// def xor(x: MyBool, y: scala.tutorials.operators.MyBool) = x.or(y).and(x.and(y).negate)


  val bool1 = new MyBool(true)
  val bool2 = new MyBool(false)

  // false
  println(bool1 and bool2)

  // true
  println(bool1 or bool2)

  // false
  println(bool1 negate)

  // false
  println(not(bool1))

  // true
  println(xor(bool1, bool2))

}