package scala.tutorials.abstracttypes

import scala.tutorials.abstracttypes.SeqBuffer

// Traits or classes with abstract type members are often used in combination with anonymous class
// instantiations. To illustrate this, we now look at a program which deals with a sequence buffer
// that refers to a list of integers:
abstract class IntSeqBuffer extends SeqBuffer {
  type U = Int
}
