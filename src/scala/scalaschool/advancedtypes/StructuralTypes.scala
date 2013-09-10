package scala.scalaschool.advancedtypes

// Scala has support for structural types — type requirements are expressed by interface structure instead of a
// concrete type.
object StructuralTypes {
  def foo(x: {def get: Int}) = 123 + x.get

  foo(new {def get = 10})
  // > Int = 133

  // This can be quite nice in many situations, but the implementation uses reflection, so be performance-aware!
}
