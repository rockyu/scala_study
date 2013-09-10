package scala.tutorials.mixin

abstract class AbsIterator {
  type T
  def hasNext: Boolean
  def next: T
}
