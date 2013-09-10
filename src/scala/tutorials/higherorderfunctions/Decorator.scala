package scala.tutorials.higherorderfunctions

// Note: methods are automatically coerced to functions if the context requires this.
class Decorator(left: String, right: String) {
  def layout[A](x: A) = left + x.toString() + right
}
