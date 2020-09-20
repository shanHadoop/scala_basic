package skd.com.scalaLearning.generic

object ScalaCovariantDemo extends App {
  //  class Foo[+A] // A covariant class



  //  A type parameter A of a generic class can be made covariant by using the annotation +A.
  //  For some class List[+A], making A covariant implies that for two types A and B where A is a subtype of B,
  //  then List[A] is a subtype of List[B]. This allows us to make very useful and intuitive subtyping relationships using generics.
//  S  <-  p
//  List[S] <- List[p]

//  Dog is parent
//  Puppy is child
//
//  Foo(Dog) -- parent
//
//  Foo(puppy) -- child

//  List[Dog]
//  List[Puppy]

  // class Foo[+A]

  class Animal[+T](val animial:T)

  // Covariant
//  Dog -> Puppy
//  Animal[Dog]   -> Animal[Puppy]




  class Dog
  class Puppy extends Dog

  class AnimalCarer(val dog:Animal[Dog])

  object ScalaCovarianceTest{
    def main(args: Array[String]) {
      val puppy = new Puppy
      val dog = new Dog

      val puppyAnimal:Animal[Puppy] = new Animal[Puppy](puppy)
      val dogAnimal:Animal[Dog] = new Animal[Dog](dog)

      val dogCarer = new AnimalCarer(new Animal[Dog](dog))
      val puppyCarer = new AnimalCarer( new Animal[Puppy](puppy))

      println("Done.")
    }
  }

}
