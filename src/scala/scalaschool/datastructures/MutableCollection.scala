package scala.scalaschool.datastructures

object MutableCollection {
  // HashMap defines getOrElseUpdate, +=

  val numbers = collection.mutable.Map(1 -> 2)

  numbers.get(1)
  // > Option[Int] = Some(2)

  numbers.getOrElseUpdate(2, 3)
  // > Int = 3

  numbers
  // > scala.collection.mutable.Map[Int,Int] = Map((2,3), (1,2))

  numbers += (4 -> 1)
  // > numbers.type = Map((2,3), (4,1), (1,2))
}
