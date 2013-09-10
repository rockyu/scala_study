package scala.tutorials.generics

class Stack[T] {
  var elems: List[T] = Nil

  def push(x: T) {
    elems = x :: elems
  }

  def top: T = elems.head

  def pop() {
    elems = elems.tail
  }
}
