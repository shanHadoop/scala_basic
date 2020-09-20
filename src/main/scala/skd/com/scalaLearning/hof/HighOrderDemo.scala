package skd.com.scalaLearning.hof

object HighOrderDemo extends App{
  // Displays output by assigning
  // value and calling functions
//  println(myApply(format, 32))     //  format(32)
//  println(myApply(doubleTheDouble, 10))   //  doubleTheDouble(10)
//
//  def myApply(funName: Double => String, y: Double) = funName(y)
//
//  // Defining a function for
//  // the format and using a
//  // method toString()
//  def format(z: Double) = "{" + z.toString() + "}"
//  def doubleTheDouble(x:Double) ={s"Double of $x is ${x * x}"}
//



  def applyOpr(f1:(Int,Int)=>Int, x:Int, y:Int)= f1(x,y)

  def add(a:Int, b:Int) = a + b
  def sub(a:Int, b:Int) = a - b

  def mul(a:Int, b:Int) = a * b

  def div(a:Int, b:Int) = a / b



  println(applyOpr(add,20,5))    // add( 20, 5)
  println(applyOpr(sub,20,5))
  println(applyOpr(mul,20,5))
  println(applyOpr(div,20,5))

}
