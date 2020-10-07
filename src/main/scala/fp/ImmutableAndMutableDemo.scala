package fp

import scala.collection.mutable
import scala.collection.parallel.ForkJoinTaskSupport
import scala.collection.parallel.mutable.ParArray

object ImmutableAndMutableDemo extends App {
//Immutablitiy By Default

  //it is OK ==     val x = if(myBoolean) expr1 else expr2

//  it is NOT ok
//  var x: ExprType = null
//  if (myBoolean) x = expr1 else x = expr2


  case class Item(name:String)
  class Player( var health:Int=100,  var items:mutable.Buffer[Item]= mutable.Buffer.empty)

  val player = new Player()
  player.health = 100
  player.items.+=(Item("Shantanu"))

  println(player.health  + player.items.mkString("-----------"))

  // Parallel collection

  val pc = ParArray(1,2,3)
  val pc1 = ParArray(1,2,3)
  pc.tasksupport = new ForkJoinTaskSupport(new scala.concurrent.forkjoin.ForkJoinPool(3))
  println(pc map { _ + 1})


  println(pc1 map ( {
    _ + 1
  }))

  def getFibo(n:Int) :Seq[Int] = {
    val fibs = mutable.Buffer(1,1)
    while(fibs.length < n) {
      fibs.append(fibs(fibs.length-1) + fibs(fibs.length-2))
      }
fibs
  }

  println(getFibo(10))


}
