package scala.tutorials.defaultparametervalues

object DefaultParameterValues extends App {

  // In Java, one tends to see a lot of overloaded methods that only serve to provide default
  // values for certain parameters of a large method. This is especially true with constructors:

  // Scala adds direct support for this:
  class HashMap[K,V](initialCapacity:Int = 16, loadFactor:Float = 0.75.toFloat) {}

  // Uses the defaults
  val m1 = new HashMap[String,Int]

  // initialCapacity 20, default loadFactor
  val m2= new HashMap[String,Int](20)

  // overriding both
  val m3 = new HashMap[String, Int](20, 0.8.toFloat)

  // override only the loadFactory via
  // named arguments
  val m4 = new HashMap[String,Int](loadFactor = 0.8.toFloat)

}