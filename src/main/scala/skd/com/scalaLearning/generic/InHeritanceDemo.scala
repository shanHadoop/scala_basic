package skd.com.scalaLearning.generic

object InHeritanceDemo extends App {

  //Multiple Inheritance: In Multiple inheritance ,one class can have more than one superclass and
  // inherit features from all parent classes. Scala does not support multiple inheritance with classes,
  // but it can be achieved by traits.


  //Multiple Inheritance thru traits
  trait Opening { def open(): Unit }
  trait Window extends Opening { override def open(): Unit = println("Opening window") }
  trait Door extends Opening { override def open(): Unit = println("Opening door") }



  class Doordow extends Door with Window
  val myDoordow = new Doordow
  println(myDoordow.open())





}
