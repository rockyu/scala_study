package scala.tutorials.implicitparameters


// The actual arguments that are eligible to be passed to an implicit parameter fall into two categories:

// First, eligible are all identifiers x that can be accessed at the point of the method call without a prefix and
// that denote an implicit definition or an implicit parameter.

// Second, eligible are also all members of companion modules of the implicit parameter’s type that are labeled implicit.
object ImplicitTest extends App {

  implicit object StringMonoid extends Monoid[String] {
    def add(x: String, y: String): String = x concat y

    def unit: String = ""
  }

  implicit object IntMonoid extends Monoid[Int] {
    def add(x: Int, y: Int): Int = x + y

    def unit: Int = 0
  }

  // In the following example we define a method sum which computes the sum of a list of elements using the monoid’s
  // add and unit operations. Please note that implicit values can not be top-level, they have to be members of a template.
  def sum[A](xs: List[A])(implicit m: Monoid[A]): A =
    if (xs.isEmpty) m.unit
    else m.add(xs.head, sum(xs.tail))

  // find implicit value for parameter m: scala.tutorials.implicitparameters.Monoid[Int]
  println(sum(List(1, 2, 3)))

  // find implicit value for parameter m: scala.tutorials.implicitparameters.Monoid[String]
  println(sum(List("a", "b", "c")))

  // print out:
  // 6
  // abc
}