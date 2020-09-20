package skd.com.scalaLearning.hof

//we use the phrase “higher order function” for both methods and functions
// that take functions as parameters or that return a function.
object HighOrderDemo1 extends App {

  val sal= Seq(100,200,300,40, 10, 100)
  val doubleSal = (x:Int) => x * 2

  val dubledsal1 = sal.map(doubleSal)
//  val dubledsal2 = sal.map(x => doubleSal(x))
//  val dubledsal3 = sal.map(doubleSal(_))

dubledsal1.foreach(x => println(x))
}
