package skd.com.scalaLearning

import Objects.Person

object CaseClassDemo extends App {


  class Person(var name:String, id:Int)
  case class Per(name:String,id:Int)
  case class PerWithAdd(name:String, id:Int, add:String)

  var p = new Person("Shantanu", 1)
  var p1 = new Person("Shantanu", 1)
  p.name = "ING"

  var pp = Per("Shantanu", 1)
  val ppnew = pp.copy(name= "Shantanu Kumar")
  var pp1 = Per("Shantanu", 1)
println(p.name)
  println(p == p1)
  println(pp == pp1)



}
