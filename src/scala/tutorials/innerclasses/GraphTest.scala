package scala.tutorials.innerclasses

import scala.tutorials.innerclasses.Graph

// We now enrich the above example with types to state explicitly what the
// type of the various defined entities is:
object GraphTest extends App {
  val g: Graph = new Graph
  val n1: g.Node = g.newNode
  val n2: g.Node = g.newNode
  val n3: g.Node = g.newNode

  n1.connectTo(n2)
  n3.connectTo(n1)
}
