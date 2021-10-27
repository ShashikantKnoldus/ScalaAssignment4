package edu.knoldus
import org.scalatest.flatspec.AnyFlatSpec


class TestIntTree extends AnyFlatSpec {
  val obj=new OperationsIntTree
  var temp =obj.insert(EmptyTree,10)

  //Test case Insert
  "When we insert 10 in empty tree" should "return Node(10,EmptyTree,EmptyTree)"in{
    assert(Node(10,EmptyTree,EmptyTree)==temp)
  }


  "When we insert 4 in  tree" should "return Node(10,Node(4,EmptyTree,EmptyTree),EmptyTree)"in{
    assert(Node(10,Node(4,EmptyTree,EmptyTree),EmptyTree)== obj.insert(temp,4))
  }


  //Test case Contains
  "When we check 10 in present or not" should "return true"in{
    assert(true==obj.contains(temp,10))
  }
  "When we check 16 in present or not" should "return false"in{
    assert(false==obj.contains(temp,16))
  }

}
