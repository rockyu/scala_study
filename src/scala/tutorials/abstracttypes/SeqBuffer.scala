package scala.tutorials.abstracttypes

import scala.tutorials.abstracttypes.Buffer

// In the following program we derive a class SeqBuffer which allows us to store only sequences in
// the buffer by stating that type T has to be a subtype of Seq[U] for a new abstract type U:
abstract class SeqBuffer extends Buffer {
  type U
  type T <: Seq[U]

  def length = element.length
}
