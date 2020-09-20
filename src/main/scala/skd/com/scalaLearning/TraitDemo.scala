package skd.com.scalaLearning

import java.util.logging.Logging

import scala.collection.mutable.ArrayBuffer

object TraitDemo extends App {

//  ***************
//  Trait
//  *************
//  A minimal trait is simply the keyword trait and an identifier:
//    Traits become especially useful as generic types and with abstract methods.
  // Trait cannot have constructor parameters
  // Every trait has a single parameter less constructor
  // Trait can extends a class , that class become a super class of any class mising in the trait.

//
//  trait loggedException extends Exception with Logging{
//    def log(): Unit ={
//     log(getMessage(""))
//   }
//   }

  trait Iterator[A] {
    def hasNext: Boolean
    def next(): A
  }


  trait Pet {
    val name: String
   // val place:String
   // var leg: Int

  }

  trait Animal {
    val place:String

  }


  trait withGrey {
def big()
  }
//----------------------------------
  class Cat(val name: String) extends Pet with Animal with withGrey {
  override val place: String = "Bangalore"
  val leg = 10;

  override def big(): Unit = {
    ""
  }
}
  class Dog(val name: String) extends Pet

  val dog = new Dog("Harry")
  val cat = new Cat("Sally")

  val animals = ArrayBuffer.empty[Pet]
  animals.append(dog)
  animals.append(cat)
  animals.foreach(pet => println(pet.name))


//  //---------------------------------------------------
//  Trait is used for defining Enum
//    _______________________________
  sealed trait DayOfWeek
  case object Sunday extends DayOfWeek
  case object Monday extends DayOfWeek
  case object Tuesday extends DayOfWeek
  case object Wednesday extends DayOfWeek
  case object Thursday extends DayOfWeek
  case object Friday extends DayOfWeek
  case object Saturday extends DayOfWeek


}
