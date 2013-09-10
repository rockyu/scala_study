package scala.scalaschool.objects

// Objects are used to hold single instances of a class. Often used for factories.
object Timer extends App {
  var count = 0

  def currentCount(): Long = {
    count += 1
    count
  }

  Timer.currentCount()
}