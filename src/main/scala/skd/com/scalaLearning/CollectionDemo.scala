/*
import java.awt.Color

import scala.collection.immutable.{LinearSeq, SortedSet}
import scala.collection.mutable

object CollectionDemo extends App{

  Traversable(1, 2, 3)
  Iterable("x", "y", "z")
  Map("x" -> 24, "y" -> 25, "z" -> 26)
  Set(Color.red, Color.green, Color.blue)
  SortedSet("hello", "world")
  mutable.Buffer('x','y', 'z')
  IndexedSeq(1.0, 2.0)
  LinearSeq('a', 'b', 'c')

  // SET
//  Additions + and ++, which add one or more elements to a set, yielding a new set.
//  Removals -, --, which remove one or more elements from a set, yielding a new set.
//  Set operations for union, intersection, and set difference. Each of these operations exists
//  in two forms: alphabetic and symbolic. The alphabetic versions are intersect, union, and diff, whereas the symbolic versions are &, |, and &~. In fact, the ++ that Set inherits from Traversable can be seen as yet another alias of union or
//  |, except that ++ takes a Traversable argument whereas union and | take sets.
//


//  // Immutable set
//  val variable_name: Set[type] = Set(item1, item2, item3)
//  or
//  val variable_name = Set(item1, item2, item3)
//
//  // Mutable Set
//  var variable_name: Set[type] = Set(item1, item2, item3)
//  or
//  var variable_name = Set(item1, item2, item3)
var myset1: Set[String] = Set("Geeks", "GFG",
  "GeeksforGeeks", "Geek123")

var myset2 = Set(10, 100, 1000, 10000, 100000)

  // Create two sets.
  val results1 = Set(10, 11, 15)
  val results2 = Set(2, 3, 15)

  // Combine the sets.
  // ... This eliminates duplicate elements.
  //     Ordering of elements is not retained.
  val results3 = results1 ++ results2
  println(results3.+(99))
  println(results3.++(results2))



  var myList1 = List(1,2,3,5,6,7)
  var myList2 = List(11,22,33,1,2)

  myList1.+(10)






}
*/
