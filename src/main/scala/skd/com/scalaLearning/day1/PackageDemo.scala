package skd.com.scalaLearning.day1

class PackageDemo {


//  packages
//  import scala.collection._
//  Wildcard import.
//  import scala.collection.Vector
//
//  import scala.collection.{Vector, Sequence}
//  Selective import.
//  import scala.collection.{Vector => Vec28}
//  Renaming import.
//  import java.util.{Date => _, _}
//  Import all from java.util except Date.
//    At start of file:
//  package pkg
//
//  Packaging by scope:
//  package pkg {
//    ...
//  }
//
//  Package singleton:
//  package object pkg {
//    ...
//  }
//  Declare a package.
//  data structures
//    (1, 2, 3)
//  Tuple literal (Tuple3).
//  var (x, y, z) = (1, 2, 3)
//  Destructuring bind: tuple unpacking via pattern matching.
//  BAD
//  var x, y, z = (1, 2, 3)
//  Hidden error: each assigned to the entire tuple.
//  var xs = List(1, 2, 3)
//  List (immutable).
//    xs(2)
//  Paren indexing (slides).
//  1 :: List(2, 3)
//  Cons.
//  1 to 5
//  same as
//    1 until 6
//
//  1 to 10 by 2
//  Range sugar.
//  ()
//  Empty parens is singleton value of the Unit type.
//  Equivalent to void in C and Java.
//    control constructs
//  if (check) happy else sad
//  Conditional.
//  if (check) happy
//
//  same as
//  if (check) happy else ()
//  Conditional sugar.
//  while (x < 5) {
//    println(x)
//    x += 1
//  }
//  While loop.
//  do {
//    println(x)
//    x += 1
//  } while (x < 5)
//  Do-while loop.
//  import scala.util.control.Breaks._
//
//  breakable {
//    for (x <- xs) {
//      if (Math.random < 0.1)
//        break
//    }
//  }
//  Break (slides).
//  for (x <- xs if x % 2 == 0)
//    yield x * 10
//
//  same as
//    xs.filter(_ % 2 == 0).map(_ * 10)
//  For-comprehension: filter/map.
//  for ((x, y) <- xs zip ys)
//    yield x * y
//
//  same as
//    (xs zip ys) map {
//    case (x, y) => x * y
//  }
//  For-comprehension: destructuring bind.
//  for (x <- xs; y <- ys)
//    yield x * y
//
//  same as
//    xs flatMap { x =>
//    ys map { y =>
//      x * y
//    }
//  }
//  For-comprehension: cross product.
//  for (x <- xs; y <- ys) {
//    val div = x / y.toFloat
//    println("%d/%d = %.1f".format(x, y, div))
//  }
//  For-comprehension: imperative-ish.
//  sprintf style.
//  for (i <- 1 to 5) {
//    println(i)
//  }
//  For-comprehension: iterate including the upper bound.
//  for (i <- 1 until 5) {
//    println(i)
//  }





}
