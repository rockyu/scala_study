package scala.tutorials.implicitparameters

abstract class SemiGroup[A] {
  def add(x: A, y: A): A
}
