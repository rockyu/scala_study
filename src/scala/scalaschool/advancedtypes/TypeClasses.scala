package scala.scalaschool.advancedtypes

object TypeClasses extends App {

  // Sometimes you don’t need to specify that one type is equal/sub/super another, just that you could fake it with
  // conversions. A view bound specifies a type that can be “viewed as” another. This makes sense for an operation
  // that needs to “read” an object but doesn’t modify the object.

  // Implicit functions allow automatic conversion. More precisely, they allow on-demand function application when
  // this can help satisfy type inference. e.g.:

  implicit def strToInt(x: String) = x.toInt

  println("123")

  val y: Int = "123"

  println(math.max("123", 111))


  // view bounds, like type bounds demand such a function exists for the given type. You specify a type bound with <%
  // e.g.,

  // this says that A has to be “viewable” as Int. Let’s try it.
  class Container[A <% Int] {
    def addIt(x: A) = 123 + x
  }


  (new Container[String]).addIt("123")
  // > Int = 246

  (new Container[Int]).addIt(123)
  // > Int = 246

  // (new Container[Float]).addIt(123.2F)
  // Error: No implicit view available from Float => Int.
}
