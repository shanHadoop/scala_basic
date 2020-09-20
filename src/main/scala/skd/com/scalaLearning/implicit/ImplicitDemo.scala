package skd.com.scalaLearning.`implicit`


object ImplicitDemo extends App {
  // Scala “implicits” allow you to omit calling methods or referencing variables
  // directly but instead rely on the compiler to make the connections for you. For example,
  // you could write a function to convert from and Int to a String and rather than call that function explicitly,
  // you can ask the compiler to do it for you, implicitly.

//  There are three categories of “implicits”;
//
//  Implicit parameters (aka implicit values) will be automatically passed values that have been marked as implicit
//  Implicit functions are defs that will be called automatically if the code wouldn’t otherwise compile
//  Implicit classes extend behaviour of existing classes you don’t otherwise control (akin to categories in Objective-C)

//  def example2(implicit x: Int, y: Int)               // x and y are implicit
//  def example3(x: Int, implicit y: Int)               // wont compile
//  def example4(x: Int)(implicit y: Int)               // only y is implicit
//  def example5(implicit x: Int)(y: Int)               // wont compile
//  def example6(implicit x: Int)(implicit y: Int)      // wont compile


def mul10(implicit a:Int) = a * 10

implicit val b:Long = 50;
implicit  val x = (num:Int)=> num
 implicit val myNum = 10
  val myNum1 :Int = 20

  println(mul10)

}
