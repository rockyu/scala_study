package scala.tutorials.mixin

import scala.tutorials.mixin.AbsIterator

// Here is a concrete iterator class, which returns successive characters of a given string:
class StringIterator(s: String) extends AbsIterator {
  type T = Char
  private var i = 0

  def hasNext = i < s.length()

  def next = {
    val ch = s charAt i; i += 1; ch
  }
}
