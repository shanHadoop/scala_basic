package skd.com.scalaLearning.Future

object HighOrderDemo2 extends App{
val seq = List(1,2,3,4,5,6,7,8,9,10)

// seq.map(x => println(x))
  //seq.map(println(_))
val table = 5
 val x =  seq.map(x =>x * table)
  val y =  seq.foreach(x =>x * table)

  println(x.length)

  x.foreach(println(_))







}
