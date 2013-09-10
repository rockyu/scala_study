package scala.tutorials.implicitparameters

import scala.tutorials.implicitparameters.SemiGroup

abstract class Monoid[A] extends SemiGroup[A] {
  def unit: A
}
