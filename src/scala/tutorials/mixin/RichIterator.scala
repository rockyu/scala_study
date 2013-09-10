package scala.tutorials.mixin

import scala.tutorials.mixin.AbsIterator

// Next, consider a mixin class which extends AbsIterator with a method foreach which
// applies a given function to every element returned by the iterator. To define a class
// that can be used as a mixin we use the keyword trait.
trait RichIterator extends AbsIterator {
  def foreach(f: T => Unit) {
    while (hasNext) f(next)
  }
}
