package scala.tutorials


// Classes in Scala are static templates that can be instantiated into many objects at runtime. Here is a class
// definition which defines a class Point:

class Point(xc: Int, yc: Int) extends Similarity {
  var x: Int = xc
  var y: Int = yc

  def move(dx: Int, dy: Int) {
    x = x + dx
    y = y + dy
  }

  def isSimilar(obj: Any) =
      obj.isInstanceOf[Point] &&
      obj.asInstanceOf[Point].x == x


  override def toString(): String = "(" + x + ", " + y + ")";

}

// The class defines two variables x and y and two methods: move and toString.

// move takes two integer arguments but does not return a value (the implicit return type Unit corresponds to void in
// Java-like languages).

// toString, on the other hand, does not take any parameters but returns a String value. Since toString overrides the
// pre-defined toString method, it has to be tagged with the override flag.
