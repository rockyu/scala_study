package scala.tutorials.inference

// It is also not compulsory to specify type parameters when polymorphic methods are called
// or generic classes are instantiated. The Scala compiler will infer such missing type
// parameters from the context and from the types of the actual method/constructor parameters.
case class MyPair[A, B](x: A, y: B)
