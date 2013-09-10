package scala.tutorials.innerclasses

import scala.tutorials.innerclasses.Graph

// If we now have two graphs, the type system of Scala does not allow us
// to mix nodes defined within one graph with the nodes of another graph,
// since the nodes of the other graph have a different type. Here is an illegal program
object IllegalGraphTest extends App {
  val g: Graph = new Graph
  val n1: g.Node = g.newNode
  val n2: g.Node = g.newNode

  n1.connectTo(n2)

  // legal
  val h: Graph = new Graph
  val n3: h.Node = h.newNode
  //  n1.connectTo(n3) // illegal!
}
