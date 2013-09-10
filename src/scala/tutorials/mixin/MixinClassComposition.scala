package scala.tutorials.mixin

import scala.tutorials.mixin.{StringIterator, RichIterator}


// We would like to combine the functionality of scala.tutorials.mixin.StringIterator and scala.tutorials.mixin.RichIterator into a single class.
// With single inheritance and interfaces alone this is impossible, as both classes contain member
// impementations with code. Scala comes to help with its mixin-class composition. It allows the
// programmers to reuse the delta of a class definition, i.e., all new definitions that are not inherited.
// This mechanism makes it possible to combine scala.tutorials.mixin.StringIterator with scala.tutorials.mixin.RichIterator, as is done in the following
// test program which prints a column of all the characters of a given string
object StringIteratorTest {

  def main(args: Array[String]) {

    class Iter extends StringIterator("print me out") with RichIterator

    val iter = new Iter

    iter foreach println
  }
}

// The Iter class in function main is constructed from a mixin composition of the parents scala.tutorials.mixin.StringIterator and
// scala.tutorials.mixin.RichIterator with the keyword with. The first parent is called the superclass of Iter, whereas the second
// (and every other, if present) parent is called a mixin.