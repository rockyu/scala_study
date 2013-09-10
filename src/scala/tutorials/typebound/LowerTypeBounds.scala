package scala.tutorials.typebound


// While upper type bounds limit a type to a subtype of another type, lower type bounds
// declare a type to be a supertype of another type. The term T >: A expresses that the
// type parameter T or the abstract type T refer to a supertype of type A.

// Note: the new prepend method has a slightly less restrictive type. It allows, for instance,
// to prepend an object of a supertype to an existing list. The resulting list will be a list
// of this supertype.


case class ListNode[+T](h: T, t: ListNode[T]) {
  def head: T = h

  def tail: ListNode[T] = t

  def prepend[U >: T](elem: U): ListNode[U] =
    ListNode(elem, this)
}

object LowerBoundTest extends App {
  val empty: ListNode[Null] = ListNode(null, null)

  val strList: ListNode[String]
      = empty.prepend("hello").prepend("world")

  val anyList: ListNode[Any]
      = strList.prepend(12345)
}