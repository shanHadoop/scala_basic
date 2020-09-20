package skd.com.scalaLearning.pattern.matching

object PatMat_DataType extends App{

  def checkVal(value:Any) =
    value match {
      case x:Int if(x==10) => s"$x is a Int"
      case x:String => s"$x is a String"
      case x:Double => s"$x is a Double"
      case x:Char => s"$x is a Char"
      case x:Boolean => s"$x is a boolean"
      //case x:Any => s" ${x} its other number"
      case _ => s"its other number"
    }


  println(checkVal(10))
  println(checkVal("Shantanu"))
  println(checkVal(true))
  println(checkVal(1000L))
  println(checkVal(10.00))
  println(checkVal('S'))
}
