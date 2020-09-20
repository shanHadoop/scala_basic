package skd.com.scalaLearning.generic

import skd.com.scalaLearning.generic.ScalaCovariantDemo.{Dog, Puppy}

object ContravariantDemo extends App {
  //  class Bar[-A] // A contravariant class

  //A type parameter A of a generic class can be made contravariant by using the annotation -A.
  // This creates a subtyping relationship between the class and its type parameter that is similar,
  // but opposite to what we get with covariance. That is, for some class Writer[-A], making A
  // contravariant implies that for two types A and B where A is a subtype of B, Writer[B] is a subtype of Writer[A].

  //
  //  Variance is used to indicate subtyping in terms of Containers(eg: List). In most of the languages,
  // if a function requests object of Class Animal, passing any class that inherits Animal(eg: Dog) would be valid.
  // However, in terms of Containers, these need not be valid. If your function wants Container[A], what are the possible
  // values that can be passed to it? If B extends A and passing Container[B] is valid, then it is Covariant(eg: List[+T]).
  // If, A extends B(the inverse case) and passing Container[B] for Container[A] is valid, then it is Contravariant.
  // Else, it is invariant(which is the default). You could refer to an article where I have tried explaining
  // contraVARIANT
  // Dog -> Puppy
  // Animal[Puppy]  -> Annimal[Dog]
}
  abstract class Type[-T]{
    def typeName
  }

  class SuperType extends Type[AnyVal] {
    override
    def typeName: Unit = println("SuperType")


  class SubType extends Type[Int] {
    override
    def typeName: Unit = println("SubType")
  }

  class TypeCarer{
    def display(t: Type[Int])={
      t.typeName
    }

//    val superTypeWithAnyVal = new SuperType
//    val subTypeWithInt = new SubType

    val typeCarer = new TypeCarer

    typeCarer.display(new SubType)                // but type carer take Type[Int]
    typeCarer.display(new SuperType)         // but type carer take Type[Int] but here it accepted
  }



}
