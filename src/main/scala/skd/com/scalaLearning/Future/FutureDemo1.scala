package skd.com.scalaLearning.Future

import scala.concurrent.{Await, Future}
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration
import scala.concurrent.duration._

object FutureDemo1 extends App{


  def add(a:Int,b:Int)={
    Future{
             a + b
    }
  }


  def sub(resulFromAdd:Int,b:Int)={
    Future{
      resulFromAdd - b
    }
  }
//
//  def mul(a:Int,b:Int)={
//    Future{
//      a * b
//    }
//  }
  println("Add started")
 // val rest = add(10,11)
  println("Add finished")

  // Blocking synchronously

//  println( Await.result(rest, 60 second))
//


   add(10,11).onComplete(r => sub(r.get,1).onComplete(s => println(s)))


    println("Thread main completed")


    println("Thread After waiting")


  Thread.sleep(4000)





}
