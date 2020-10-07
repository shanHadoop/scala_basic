package ayush.sessions

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

object SyntaxSugarDemo extends App{


  // You can call method with curly braket "{}" instead of paranthesis "()" , only if you take 1 parameters.
  def methodCall[A](sf:A,fn:A) = s"Hello Well Come to India Mrs/Mrs $sf and $fn"
  val out = methodCall("Shantanu", "Sweety")


List(1,2,3,4).map(println(_))
  Set(1,2,3,4).map(println(_))
  Seq(1,2,3,4).map(println(_))
  Option(1,2,3,4).map(println(_))
  Future(5).map(println(_))


  // Trait

  trait Dummy {
    def pr(arg:String):String
   }

  val dummy:Dummy = (name:String ) =>(name)

  class Person(name:String) {
    def `my name is and address is `(addr:String) = {
      s"My name is $name and Adress is $addr"
    }
  }

 //
  val p = new Person("Shantanu")

  val s = p `my name is and address is ` "Bangalore"

  println(s)


}
