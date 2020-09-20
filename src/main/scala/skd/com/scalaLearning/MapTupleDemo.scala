package skd.com.scalaLearning

import scala.annotation.tailrec

object MapTupleDemo extends App {

  def add(network: Map[String, Set[String]], person: String):Map[String,Set[String]] = {
    network + (person -> Set())
  }

  def friend(network: Map[String, Set[String]], a: String, b: String) = {
    val friendA = network(a)
    val friendB = network(b)

    network + (a -> (friendA + b)) + (b -> (friendB + a))
  }

  def unfriend(network: Map[String, Set[String]], a: String, b: String) = {
    val friendA = network(a)
    val friendB = network(b)

    network + (a -> (friendA - b)) + (b -> (friendB - a))
  }

  def remove(network: Map[String, Set[String]], person: String): Map[String, Set[String]] = {
    def removeAux(frnds: Set[String], accNetwork: Map[String, Set[String]]): Map[String, Set[String]] = {
      if (accNetwork.isEmpty) accNetwork
      else removeAux(frnds.tail, unfriend(accNetwork, person, frnds.head))
    }
    val unfrineded= removeAux(network(person),network)
  network - (person)
  }


  val emptyNetwork:Map[String,Set[String]]= Map()

val networked= add(add(add(add(emptyNetwork,"Shantanu"),"Amit"),"Madh"),"Mohan")
  println(networked)
  var netsWork = friend(friend(friend(friend(networked,"Amit","Madh"),"Amit","Shantanu"),"Shantanu","Mohan"),"Amit","Mohan")


  def findMaxNet(netWork:Map[String,Set[String]]):String={
    netWork.maxBy(kv => kv._2.size)._1
  }

  println(findMaxNet(netsWork))

// println(netsWork)
  def isConnectionThere(network:Map[String,Set[String]],a :String, b :String):Boolean ={
    @tailrec
    def bts(target:String, consideredPeople:Set[String], discoveredPeople:Set[String]):Boolean = {
      if (discoveredPeople.isEmpty) false
      else {
        val person = discoveredPeople.head
        if (person == target) true
        else if (consideredPeople.contains(person)) bts(target,consideredPeople,discoveredPeople.tail)
        else bts(target,consideredPeople-person,discoveredPeople.tail ++ network(person))
      }
    }
    bts(b,Set(),network(a) +  a)
  }


  println(isConnectionThere(netsWork,"Amit","Mohan"))
}

