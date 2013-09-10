package scala.tutorials.generics

import scala.tutorials.generics.Stack

object Generics extends App {
  val stack = new Stack[Int]
  stack.push(1)
  stack.push('a')

  println(stack.top)

  stack.pop()
  println(stack.top)

  // print out:
  // 97
  // 1
}