package skd.com.scalaLearning.Future

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

object FutureDemo extends App{
  val m1 = Future(Map(("A" -> 1), ("B" -> 1)))

  val m2 = Future(Map(("A" -> 1), ("C" -> 1)))

  val m3 = Future(Map(("C" -> 5), ("D" -> 1)))

  val list = List(m1, m2, m3)

  def merge(first: Map[String, Int], second: Map[String, Int]): Map[String, Int] = {
    first ++ second.map { case (k, v) => (k, v + first.getOrElse(k, 0)) }
  }

  val res = Future.sequence(list).map(x =>x.reduce((a,b) => merge(a,b)))


  //   OR

 // val res = Future.sequence(list).map(_.reduce(merge _))


  res.onComplete(x =>  println(x.get.mkString("---")))

  Thread.sleep(1000)


}
