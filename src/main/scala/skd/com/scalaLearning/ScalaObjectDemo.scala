package skd.com.scalaLearning

object Objects extends App {

  // SCALA DOES NOT HAVE CLASS-LEVEL FUNCTIONALITY ("static")
  object Person {

    // type + its only instance
    // "static"/"class" - level functionality
    val N_EYES = 2
    def canFly: Boolean = false

    // factory method
    //
    def apply(mother: Person, father: Person): Person = new Person("Bobbie")
  }
  class Person(val name: String) {
    // instance-level functionality
  }
  // COMPANIONS

  println(Person.N_EYES)
  println(Person.canFly)

  val x:String = ""

  // Scala object = SINGLETON INSTANCE
  val mary = new Person("Mary")
  val john = new Person("John")
  println(mary == john)

  val person1 = Person
  val person2 = Person
  println(person1 == person2)

  val bobbie = Person(mary, john)
  val bobbie1 = Person
  val bobbie2 = new Person("XYX")


  println(bobbie == person1)
  // Scala Applications = Scala object with
  // def main(args: Array[String]): Unit
println(bobbie.name)

  val k = 6.67e-11

}
