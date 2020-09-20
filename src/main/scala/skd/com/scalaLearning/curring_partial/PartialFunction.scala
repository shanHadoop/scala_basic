package skd.com.scalaLearning.curring_partial

//As the name suggests, partial functions are only partial implementations.
// They do not cover every possible scenario of incoming parameters.

// PartialFunction[A,B]
//  here A  is input type   eg Tuple, Int, String, Foo
//       B is output type  eg Tuple, Int, String, Foo


// take 1 parameter and return and 1 parameter
object PartialFunction extends App{

  val list: List[Double] = List(4, 16, 25, -9)

  val squareRoot: PartialFunction[Double, Double] = {
    case d: Double if d > 0 => Math.sqrt(d)
  }

  val powerNum:PartialFunction[Double,Double] ={
    case d:Double if d  >0  => d * d
  }

  val resultWithNormal = list.map(Math.sqrt(_))

  println(resultWithNormal)
 // result: List[Double] = List(2.0, 4.0, 5.0, NaN)


println(squareRoot.isDefinedAt(0))
println(squareRoot.isDefinedAt(10))
println(squareRoot(100))

  val resultWithPartial = list.collect(squareRoot)
  println(resultWithPartial)

  val sqrtMy =  (x:Double) => x * x


  // andThen combine two function with AND operation.
  val compbined= squareRoot.andThen(sqrtMy)

println(  list.collect(compbined))

}
