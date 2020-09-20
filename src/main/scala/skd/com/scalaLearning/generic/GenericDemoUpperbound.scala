package skd.com.scalaLearning.generic

object GenericDemoUpperbound extends App{
  class Thing
  class Vehicle extends Thing
  class Car extends Vehicle
  class Jeep extends Car
  class Coupe extends Car
  class Motorcycle extends Vehicle
  class Employee


  class Parking1 [A](val place: A)
  class Parking2 [A](val place1: A, val place2: A)
  class Parking3 [A,B](val place1: A, val place2: B)


  var p1 = new Parking1[Motorcycle](new Motorcycle )
  //new Parking[Motorcycle](new Jeep )// wont't compile
  //  new Parking[Motorcycle](new Car)   // Won't compile
  //  new Parking[Motorcycle](new Vegetable)  // Won't compile

  new Parking1[Car](new Jeep)
  new Parking1[Car](new Coupe)
  new Parking1[Vehicle](new Jeep)

  // here we can create a create Employee type also
  new Parking1[Employee](new Employee)

  //Upper Bound
  // Parking[A <: Vehicle] means that the A type must be type or subtype of Vehicle.
  class ParkingUpper[A <: Vehicle](val place: A)

  new  ParkingUpper[Car](new Car)
  // new Parking[Vehicle] shouldBe a[Parking[_]]
  // new Parking[Car] shouldBe a[Parking[_]]
  // new Parking[Jeep] shouldBe a[Parking[_]]
  // new Parking[Motorcycle] shouldBe a[Parking[_]]

  // Lower Bound    A >: B means that A must be B or higher from B, being B the frontier (bound).
  // [A >: Vehicle] will restrict A to supertypes of Vehicle, Vehicle included.
  class ParkingLower[A >: Jeep](val place: A)
  new ParkingLower[Car](new Car)


}
