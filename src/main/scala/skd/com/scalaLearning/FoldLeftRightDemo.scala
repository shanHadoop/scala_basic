package skd.com.scalaLearning

//Fold : Like reduce fold also takes a binary operation which merges all the elements
// from the collection and returns a single value. The difference is that fold allows
// us to define an initial value. Due to this property, fold can also manage empty collections.
// If the collection is empty, the value initialized becomes the final answer. Due to this we
// can also return a different value from the set of collection using initial value of some other
// datatype. Reduce can only return the value of the same type because its initial value is the first
// value from the collection.

//  In:
//    initial value
//      way to combine stuff with initial value
//    collection
//  Out:
//    combined stuff
//      And reduce is like this:





//def fold[A1 >: A](z: A1)(func: (A1, A1) => A1): A1
//
//def foldLeft[B](z: B)(func: (B, A) => B): B
//
//
//val foo = List(1, 2, 3)
//foo.foldLeft(0)(_ + _)
//
//// now try fold:
//foo.fold(0)(_ + _)
//
//
//
//foldLeft :--
//  List(a,b,c).foldRight(z)(f) = f(a, f(b, f(c, z)))
//
//foldRight :-
//  List(a,b,c).foldLeft(z)(f) = f(f(f(z, a), b), c)

object FoldLeftRightDemo  extends App{

      val numbers = List(5, 4, 8, 6, 2,3,1,0)
      val addTwo = (x:Int, y:Int) => {
    println("Fold v1= " + x +" v2= " + y)
    x min y }


  val a = numbers.foldLeft(0)(addTwo)


//      val a =  numbers.fold(10) { (z, i) =>
//      {
//        println("fold v1= " + z +" v2= " + i)
//        z + i
//      }
//      }
      println(a)

  // FOLD-LEFT
//      val b =  numbers.foldLeft(0) { (z, i) =>
//        println("foldleft v1= " + z +" v2= " + i)
//        z + i
//
//      }
//      println(b)

  // FOLD-RIGHT
//      val c =  numbers.foldRight(0) { (z, i) =>
//        println("fold right v1= " + z +" v2= " + i)
//        z + i
//
//      }
//      println(c)
//

}
