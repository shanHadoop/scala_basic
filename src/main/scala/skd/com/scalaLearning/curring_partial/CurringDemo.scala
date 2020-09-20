package skd.com.scalaLearning.curring_partial

// Curring is the one of the concept mostly used in functional programming it work with combinatory logic.

// Currying splits method with multiple parameters into a chain of functions – each with one parameter

// Currying is a means of transforming a function that takes more than one argument into a chain of calls
// to functions, each of which takes a single argument

object CurringDemo extends App {
// def add(a:Int,b:Int,x:Int) = a  + b + x

 def  addCurried  =  (a:Int)  => (b:Int) => a + b
 def  addCurriedNew  =  ((a:Int,x:Int)  => ((b:Int) => a + b + x))

  //
  def addCurried1(a:Int) (b:Int)(c:Int) =  a + b + c

  //println(add(20,30,40))
  val parFun = addCurried(20)
 // println(parFun(30))

  // here below is called partial applied function
  val addStep1 = addCurried1(20)_
  val addStep2 = addStep1(30)(20)

  println(addStep2)



}

