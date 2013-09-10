package scala.scalaschool.traits

// traits are collections of fields and behaviors that you can extend or mixin to your classes
trait Car {
  val brand: String
}

trait Shiny {
  val shineRefraction: Int
}

// One class can extend several traits using the with keyword
class BMW extends Car with Shiny {
  val brand = "BMW"
  val shineRefraction = 12
}


// When do you want a Trait instead of an Abstract Class? If you want to define an interface-like type,
// you might find it difficult to choose between a trait or an abstract class. Either one lets you define a type with
// some behavior, asking extenders to define some other behavior.
//
// Some rules of thumb:
// - Favor using traits. It’s handy that a class can extend several traits; a class can extend only one class.
// - If you need a constructor parameter, use an abstract class. Abstract class constructors can take parameters;
// trait constructors can’t. For example, you can’t say trait t(i: Int) {}; the i parameter is illegal.