package skd.com.scalaLearning.Day2

import java.util.UUID

object CBNvsCBV extends App {


  //    calledByValue(1257387745764245L)
  //
  //    calledByName(System.nanoTime())
  //    //  printFirst(infinite(), 34)
  //

//
//  def calledByValue(x: Long): Unit = {
//    println("by value: " + 1257387745764245L)
//    println("by value: " + 1257387745764245L)
//  }
//
//  def calledByName(x: => Long): Unit = {
//    println("by name: " + System.nanoTime())
//    println("by name: " + System.nanoTime())
//
//
//  }
//
//
//  def callByValue(x: String) = {
//    println("callByValue" + x)
//    println("callByValue" + x)
//  }
//
//
//  def callByName(x: => String) = {
//    println("callByName " + x)
//    println("callByName " + x)
//  }
//
//
// (callByName(UUID.randomUUID().toString))
//  (callByValue(UUID.randomUUID().toString))
//
//  val l1 = List(1,2,3,4,5)
//  val l2 = List("a","b","c")

  val list1 = List("word1","word2","word3","word4","word5","word6","word7","word8","word9","word10")
  val list2 = List("word1","word411","word211","word4","word1","word4")
  println(list1 diff list2)
  println(list2 diff list1)

val str = "My name aa   is Shantanu      Kumar   Dutta"
  val stopWord = List("is","my","a", "are","ku")
val myMap = Map(1->list1,2->list2)
  println(myMap.values.map(x => x))
  println(myMap.values.flatMap(x => x))
  println(str.toLowerCase.split("\\s+").filterNot(stopWord.contains(_)).mkString(" "))

  //
  //
  //class MyPerson
  //
  //  //  def infinite(): Int = 1 + infinite()
  //  //  def printFirst(x: Int, y: => Int) = println(x)
  //type A = MyPerson
  //val x :Option[A]= Some(new MyPerson)
  //
  //  type myInt = Int
  //
  //  val y :Option[myInt] = Some(19)
  ////
  ////  //val x:Option[String]= Some("Shantanu")
  ////  def printFullName(fname: String, surName: Option[String]) {
  ////    println(surName)
  ////if (surName.isDefined) println(fname + surName.get) else println(fname)
  ////
  ////}
  ////
  ////  printFullName("Shantanu",None)
  //
  //  val result = y.getOrElse(0) + 100
  //  println(result)
  //
  //}
  //

}
