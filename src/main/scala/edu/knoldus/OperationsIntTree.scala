package edu.knoldus


  abstract class IntTree
  case object EmptyTree extends IntTree
  case class Node(elem: Int, left: IntTree, right: IntTree) extends IntTree

class OperationsIntTree {
  def contains(t: IntTree, v: Int): Boolean = t match {
    case Node(elem, left, right) if (elem == v) => true
    case Node(elem, left, right) => if (elem > v) contains(left, v) else contains(right, v)
    case _ => false
  }


  def insert(t: IntTree, v: Int): IntTree = t match {
    case Node(elem, left, right) if (elem > v) => Node(elem, insert(left, v), right)
    case Node(elem, left, right) if (elem < v) => Node(elem, left, insert(right, v))
    case EmptyTree =>  Node(v, EmptyTree, EmptyTree)
    case _ => t
  }

}

