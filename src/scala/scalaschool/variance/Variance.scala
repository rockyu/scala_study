package scala.scalaschool.variance

object Variance extends App {
  //                Meaning 	                      Scala notation
  // covariant 	    C[T’] is a subclass of C[T] 	  [+T]
  // contravariant 	C[T] is a subclass of C[T’] 	  [-T]
  // invariant 	    C[T] and C[T’] are not related 	[T]


  class Covariant[+A]

  val cv1: Covariant[AnyRef] = new Covariant[String]

  // val fail: Covariant[String] = new Covariant[AnyRef]
  // error: type mismatch;


  class Contravariant[-A]
  val cv2: Contravariant[String] = new Contravariant[AnyRef]

  // val fail: Contravariant[AnyRef] = new Contravariant[String]
  // error: type mismatch;
}
