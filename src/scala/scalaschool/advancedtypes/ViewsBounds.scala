package scala.scalaschool.advancedtypes

object ViewsBounds extends App {
  // Generic programming with views

  // In the Scala standard library, views are primarily used to implement generic functions over collections. For
  // example, the “min” function (on Seq[])
  // def min[B >: A](implicit cmp: Ordering[B]): A = {....}


  // The main advantages of this are:

  // 1) Items in the collections aren’t required to implement Ordered, but Ordered uses are still statically type
  // checked.

  // 2) You can define your own orderings without any additional library support:

  println(List(1, 2, 3, 4).min)
  // > Int = 1

  println(List(1, 2, 3, 4).min(new Ordering[Int] {
    def compare(a: Int, b: Int) = b compare a
  }))
  // > Int = 4
}
