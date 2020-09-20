package skd.com.scalaLearning.hof

object HOFDemo extends App {


  val ls = List(1,2,3,4,5,6,7,8,9)

  val addTwo = (x:Int) => x + 2

  ls.map(addTwo)

}
