//package day1
//
//class FunctionSyntax {
////  functions
////  GOOD
//  def f(x: Int) = { x * x }
//
//
// // BAD
//  def f1(x: Int) =  { x * x }
////  Define function.
////  Hidden error: without = it’s a procedure returning Unit; causes havoc. Deprecated in Scala 2.13.
////  GOOD
//  def f(x: Any) = println(x)
//
////  BAD
////  def f(x) = println(x)
////  Define function.
////  Syntax error: need types for every arg.
//
//  //  Type alias.
//  type R = Double
//
//
//  //  Call-by-value.
//  def f(x: R)
//
//  //  Call-by-name (lazy parameters).
//  def f(x: => R)
//
//// Annonymous function
//  val f = (x: R) => x * x
//
//
////Anonymous function: underscore is positionally matched arg.
//  (1 to 5).map(_ * 2)
//
//  // OR
//  (1 to 5).reduceLeft(_ + _)
//
//  //Anonymous function: to use an arg twice, have to name it.
//  (1 to 5).map(x => x * x)
//
//  //  Anonymous function: block style returns last expression.
//  (1 to 5).map { x =>
//    val y = x * 2
//    println(y)
//    y
//  }
//
////  Anonymous functions: pipeline style (or parens too).
//  (1 to 5) filter {
//    _ % 2 == 0
//  } map {
//    _ * 2
//  }
//
//
//  //   Composing method
//  //Anonymous functions: to pass in multiple blocks, need outer parens.
//  def compose(g: R => R, h: R => R) =
//    (x: R) => g(h(x))
//
//  val f = compose(_ * 2, _ - 1)
//
////
////  scala> def compose(g :Int => Int, h:Int =>Int) = (x:Int) => g(h(x))
////  compose: (g: Int => Int, h: Int => Int)Int => Int
////
////  scala> compose(_*2,_*3)
////  res0: Int => Int = <function1>
////
////    scala> res0(10)
////    res1: Int = 60
//
//}
