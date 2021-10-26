package edu.knoldus
import org.scalatest.flatspec.AnyFlatSpec

import scala.collection.immutable.{HashMap, HashSet}
class Test extends AnyFlatSpec {
 val obj= new SetOperations
 val set1=Set(1,2,3,4)
  val set2=Set(2,3,5,6)
  //Test case Union
  "Union of set1 and set2" should "(1,2,3,4,5,6)"in{
    assert(HashSet(5,1,6,2,3,4)==obj.unionSet(set1,set2))
  }
 //Test case Intersection
 "Intersection of set1 and set2" should "(1,2,3,4,5,6)"in{
  assert(HashSet(2,3)==obj.intersectionSet(set1,set2))
 }
}
