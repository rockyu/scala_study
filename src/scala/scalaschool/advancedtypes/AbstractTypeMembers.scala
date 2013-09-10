package scala.scalaschool.advancedtypes

object AbstractTypeMembers {

  trait Foo {
    type A;
    val x: A;

    def getX: A = x
  }

  (new Foo { type A = Int; val x = 123 }).getX
  // > Int = 123

  (new Foo { type A = String; val x = "hey" }).getX
  // > java.lang.String = hey
}
