package scala.tutorials.comprehension

object ComprehensionTest3 extends App {
  for (i <- Iterator.range(0, 20);
       j <- Iterator.range(i, 20) if i + j == 32)
    println("(" + i + ", " + j + ")")
}

// print out:
// (13, 19)
// (14, 18)
// (15, 17)
// (16, 16)