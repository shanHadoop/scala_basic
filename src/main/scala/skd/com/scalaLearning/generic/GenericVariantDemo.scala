package skd.com.scalaLearning.generic

object GenericVariantDemo extends App{

  trait Thing
  class Vehicle extends Thing
  class Car extends Vehicle
  class Jeep extends Car
  class Coupe extends Car
  class Motorcycle extends Vehicle
  class Bicycle extends Vehicle
  class Tricycle extends Bicycle
  class Employee

  // Can we limit Parking to all the subtypes of Vehicles, above Tricycle?
  class Parking[A >: Bicycle <: Vehicle](val plaza: A)

  //Error:(17, 3) inferred type arguments [Object] do not conform to class Parking's type parameter bounds
  // [A >: generic.GenericVariantDemo.Bicycle <: generic.GenericVariantDemo.Vehicle]
  //  new Parking(new AnyRef)

 // new Parking(new Employee)


  //What is Variance?
  //Variance defines Inheritance relationships of Parameterized Types. Variance is all about Sub-Typing.

// Variance :- it is the co-relation of subtype relations of the complex type and the subtyping relationships of their
  // component type scala scala support variance annotations of the type parameter of generic class
  //  class Foo[A]      //  Invariant class
  //  class Foo[+A]  //  A covariant class
  //  class Foo[-A]   // Contravariant class

//
//  Covariant in Scala
//  If “S” is subtype of “T” then List[S] is is a subtype of List[T].
//
//  This kind of Inheritance Relationship between two Parameterized Types is known as “Covariant”

}
