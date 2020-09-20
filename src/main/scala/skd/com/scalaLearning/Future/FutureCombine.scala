package skd.com.scalaLearning.Future

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
object FutureCombine extends App{


  val m1 = Future(Map('A'->1, 'B'->1))
  val m2 = Future(Map('A'->1, 'B'->1))
  val m3 = Future(Map('A'->1, 'B'->1))
  val m4 = Future(Map('A'->1, 'C'->1))

  //Future(Map('A'->4,'B'->3, 'C' -> 1 ))

val myData= for {
  x1 <- m1
  x2 <- m2
  x3 <- m3
  x4 <- m4
} yield (x1.toList++x2.toList++x3.toList++x4.toList)


  //Future(List(('A',1), ('B',1), ('A' , 1) , ('B', 1),('A',1), ('B',1) , ('A',1), ('C',1))

 val groupedData =  myData.map(x =>  x.groupBy(_._1).map{
    case (k,v) => k -> v.map(_._2).sum
  } )

  groupedData.foreach(println)
  Thread.sleep(5000)
}
