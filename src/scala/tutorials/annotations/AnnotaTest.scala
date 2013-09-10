package scala.tutorials.annotations

import java.io.{IOException, BufferedReader, FileReader}

// In the following example we add the throws annotation to the definition of the method read in order to
// catch the thrown exception in the Java main program.

// A Java compiler checks that a program contains handlers for checked exceptions by analyzing which checked
// exceptions can result from execution of a method or constructor. For each checked exception which is a possible
// result, the throws clause for the method or constructor must mention the class of that exception or one of the
// superclasses of the class of that exception. Since Scala has no checked exceptions,
// Scala methods must be annotated with one or more throws annotations such that Java code can catch exceptions
// thrown by a Scala method.

class Reader(fname: String) {

  private val in = new BufferedReader(new FileReader(fname))

  @throws(classOf[IOException])
  def read() = in.read()
}
