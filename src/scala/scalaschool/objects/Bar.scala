package scala.scalaschool.objects

// Classes and Objects can have the same name. The object is called a ‘Companion Object’. We commonly use Companion
// Objects for Factories.

// Here is a trivial example that only serves to remove the need to use ‘new’ to create an instance.
class Bar(foo: String)

object Bar {
  def apply(foo: String) = new Bar(foo)
}

