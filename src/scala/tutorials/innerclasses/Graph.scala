package scala.tutorials.innerclasses

// Opposed to Java-like languages where such inner classes are members of
// the enclosing class, in Scala such inner classes are bound to the outer object.
class Graph {
  class Node {
    var connectedNodes: List[Node] = Nil

    def connectTo(node: Node) {
      if (connectedNodes.find(node.equals).isEmpty) {
        connectedNodes = node :: connectedNodes
      }
    }
  }

  var nodes: List[Node] = Nil

  def newNode: Node = {
    val res = new Node
    nodes = res :: nodes
    res
  }
}
