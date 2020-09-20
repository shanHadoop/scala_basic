package skd.com.scalaLearning


object ReduceLeftRight extends App{
  //Reduce : Reduce function is applied on collection data structure in scala that contains lists,
  // sets, maps, sequence and tuples. Parameter in the reduce function is a binary operation which
  // merges all the elements from the collection and returns a single value. The first two values
  // is combined with the binary operation and the resultant of that operation combines with the
  // next value of the collection and atlast we obtain a single value.



  //  In:
  //    way to combine stuff
  //      collection
  //  Out:
  //    combined stuff

  //
  //  List(1,2,3).reduce(1){_ * _}
  //  List(1,2,3).reduce{_ * _}

val addTwo = (x:Int, y:Int) => {
  println("reduce v1= " + x +" v2= " + y)
  x max y }

  val numbers = List.empty
val a = numbers.foldLeft(0)(addTwo)
 //val a = numbers.reduceRight((x,y) => addTwo(x,y))
//  val a =  numbers.reduce { (z, i) =>
//  {
//    println("reduce v1= " + z +" v2= " + i)
//    z + i
//  }
//  }
  println(a)
//
//  //Reduce-LEFT
//  val b =  numbers.reduceLeft{ (z, i) =>
//    println("reduceleft v1= " + z +" v2= " + i)
//    z + i
//
//  }
//  println(b)
//
//  //Reduce-RIGHT
//  val c =  numbers.reduceRight{ (z, i) =>
//    println("reduce right v1= " + z +" v2= " + i)
//    z + i
//
//  }
//  println(c)


}







