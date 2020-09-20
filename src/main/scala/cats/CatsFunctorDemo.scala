package cats
//
//
import cats.instances.list._
import cats.instances.int._
import cats.Show
import cats.syntax.show._

object CatsFunctorDemo extends App {


 val len :String => Int =(x) => x.length
//
val l:List[String] = List("Shantanu","Kumar","ABC","DUTTA")
//  val y = l.map(len)
//  val x = Functor[List].map(l) (len)
//  println(x)
//  println(y)

  import cats.syntax.functor._
  import cats.syntax.functor._
  val either : Either[Int,String] = Right("Shantan")
  val z = either.map(_ + "Dutta")

  println(z)


  val x = l.fproduct(len)
  println(x)

}
