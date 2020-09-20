package skd.com.scalaLearning.`implicit`

object ImplicitFunctionDemo extends App{


  implicit def intToString(num:Int)= {s"String value is $num" }
 //  def intToStr(num:Int):String = s"now $num"

//  val numberIs :Int = 10
////  val numStr  = String.valueOf(numberIs)
////
////  numStrtoUpperCase()
//  println(numberIs.toUpperCase())



  def functionTakingString(s:String)= s

  println(functionTakingString(20))

}
