package skd.com.scalaLearning.curring_partial

object PartialFunctionDemo extends App{
val list:List[Double] = List(100,81,0,-9,4,16)

  val squareRoot: PartialFunction[Double, Double] = {
    case d: Double if d > 10 => Math.sqrt(d)
  }

  val squareRoot1 = new PartialFunction[Int,Double] {
    def apply(x:Int) = Math.sqrt(x)
    override def isDefinedAt(x: Int): Boolean = x > 100
  }

  println(list.collect(squareRoot))

  //println(list.collect(squareRoot1))
  // converts 1 to "one", etc., up to 5
  val convert1to5 = new PartialFunction[Int, String] {
    val nums = Array("one", "two", "three", "four", "five")
    def apply(i: Int) = nums(i-1)
    def isDefinedAt(i: Int) = i > 0 && i < 6
  }

  // converts 6 to "six", etc., up to 10
  val convert6to10 = new PartialFunction[Int, String] {
    val nums = Array("six", "seven", "eight", "nine", "ten")
    def apply(i: Int) = nums(i-6)
    def isDefinedAt(i: Int) = i > 5 && i < 11
  }

  val SquareRoot = new PartialFunction[Int, String] {
    val nums = Array("six", "seven", "eight", "nine", "ten")
    def apply(i: Int) = nums(i-6)
    def isDefinedAt(i: Int) = i > 5 && i < 11
  }




  // multiple parameter
  case class Foo(a:String,b:String)
  val multiArgPartial: PartialFunction[(String, Long, Foo), Int] = {
    case ("OK", _, Foo("bar", _)) => 0 // Use underscore to accept any value for a given parameter
  }


  //orElse
  val handle1to10 = convert1to5 orElse convert6to10

  println(handle1to10(3))

  println(handle1to10(9))



}
