package scala.scalaschool.partialfunction

case class PhoneExt(name: String, ext: Int)

object MatchingPhoneExt {
  val extensions = List(PhoneExt("steve", 100), PhoneExt("robey", 200))
  // > extensions: List[PhoneExt] = List(PhoneExt(steve,100), PhoneExt(robey,200))

  extensions.filter { case PhoneExt(name, extension) => extension < 200 }
  // > List[PhoneExt] = List(PhoneExt(steve,100))

  // Why does this work?

  // filter takes a function. In this case a predicate function of (PhoneExt) => Boolean.
  // A PartialFunction is a subtype of Function so filter can also take a PartialFunction!
}
