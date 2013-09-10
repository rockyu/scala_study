package scala.tutorials.abstracttypes

// Here is an example which defines both a deferred value definition and an abstract type definition
// as members of class Buffer
trait Buffer {
  type T
  val element: T
}
