package skd.com.scalaLearning

object TupleDemo extends App {
  val e = new HelloGetEmploee

  val e1= e.getEployee()

  println(s"Employee id ${e1._1} and name is ${e1._2} and Add is ${e1._3}")
  println(e1.toString())

  val ed1 = e.getEployeeD()

  println(s"Employee id ${ed1.id} and name is ${ed1.name} and Add is ${ed1.add}")


}

case class Employee1(id:Int, name:String, add:String)


class HelloGetEmploee {


  def getEployee()={
    // fetching

    (1,"XYZ" , "ADD")

  }
  def getEployeeD()={
    // fetching

    Employee1(1,"XYZ" ,"ADD")

  }

}