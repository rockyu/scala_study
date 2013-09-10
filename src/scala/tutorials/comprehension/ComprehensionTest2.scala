package scala.tutorials.comprehension

object ComprehensionTest2 extends App {

  def foo(n: Int, v: Int) =
    for (i <- 0 until n; j <- i until n if i + j == v) yield Pair(i, j);

  foo(20, 32) foreach {
    case (i, j) =>
      println("(" + i + ", " + j + ")")
  }

  // print out:
  //  (13, 19)
  //  (14, 18)
  //  (15, 17)
  //  (16, 16)

}