sealed abstract class Tree

case class Node(value: Int, left: Tree, right: Tree) extends Tree

case class Leaf(value: Int) extends Tree

val a = Node(20, Leaf(10), Leaf(30))
val b = Node(40, Leaf(37), Leaf(50))
val c = Node(35, a, b)
println(c)

def sumTree(t: Tree): Int = t match {
	case Leaf(value) => value
	case Node(value, left, right) => value + sumTree(left) + sumTree(right)
}

println(sumTree(c))
println(sumTree(Node(10, Leaf(5), Leaf(20))))