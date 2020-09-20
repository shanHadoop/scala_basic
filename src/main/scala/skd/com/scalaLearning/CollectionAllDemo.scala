package skd.com.scalaLearning

object CollectionAllDemo {
//  https://www.tutorialspoint.com/scala/scala_collections.htm
//  ******************************************************************************
//
//  SET
//
//  import scala.collection.mutable
//
//  // Creating and initilazing set
//  var myset = Set("G", "Geek", "for")
//
//  // Adding new element in set
//
//  scala> myset += "shantanu"
//  res13: scala.collection.mutable.Set[String] = Set(for, G, Geek, shantanu)
//
//
//  // Adding set with set
//  scala> myset ++=Set("shantanu1")
//  res15: scala.collection.mutable.Set[String] = Set(for, G, Geek, shantanu, shantanu1)
//
//  // Adding list with set
//  myset ++== List("Geeks12", "geek23", "G")
//
//  // Adding elements using add() method
//  myset.add("GeeksforGeeks")
//
//  // Deleting elements in set  // using -= and --= methods
//  scala> myset -= "shantanu"
//
//  scala> myset --= List("G", "GEEK")
//
//  https://www.tutorialspoint.com/scala/scala_sets.htm
//  *****************************************************************************************************************
//  List
//  // List of Strings
//  val fruit: List[String] = List("apples", "oranges", "pears")
val fruit = List("apples", 1, 'c', 10L)
//
//  // List of Integers
//  val nums: List[Int] = List(1, 2, 3, 4)
//
//  // Empty List.
//  val empty: List[Nothing] = List()
//
//  // Two dimensional list
//  val dim: List[List[Int]] =
//    List(
//      List(1, 0, 0),
//      List(0, 1, 0),
//      List(0, 0, 1)
//    )
//
//
//  // create a list
//  val ls = "pears" :: Nil
//  val ls = Nil
//
//
//  val fruit1 = "apples" :: ("oranges" :: ("pears" :: Nil))
//  val fruit2 = "mangoes" :: ("banana" :: Nil)
//
//  // use two or more lists with ::: operator
//  var fruit = fruit1 ::: fruit2
//  println( "fruit1 ::: fruit2 : " + fruit )
//
//  // use two lists with Set.:::() method
//  fruit = fruit1.:::(fruit2)
//  println( "fruit1.:::(fruit2) : " + fruit )
//
//  // pass two or more lists as arguments
//  fruit = List.concat(fruit1, fruit2)
//  println( "List.concat(fruit1, fruit2) : " + fruit  )
//
//  // Repeats apples three times.
//  val fruit = List.fill(3)("apples")
//
//  https://www.tutorialspoint.com/scala/scala_lists.htm
//
//
//
//
//  ******************************************************************
//  Map()
//  // Empty hash table whose keys are strings and values are integers:
//  var A:Map[Char,Int] = Map()
//
//  // A map with keys and values.
//  val colors = Map("red" -> "#FF0000", "azure" -> "#F0FFFF")
//
//  A + = ('I' -> 1)
//  A + = ('J' -> 5)
//
//
//  val colors = Map("red" -> "#FF0000", "azure" -> "#F0FFFF", "peru" -> "#CD853F")
//
//  val nums: Map[Int, Int] = Map()
//
//  println( "Keys in colors : " + colors.keys )
//  println( "Values in colors : " + colors.values )
//
//  //Concatenating Maps
//  You can use either ++ operator or Map.++() method to concatenate two or more Maps, but while adding Maps it will remove duplicate keys.
//  val colors1 = Map("red" -> "#FF0000", "azure" -> "#F0FFFF", "peru" -> "#CD853F")
//  val colors2 = Map("blue" -> "#0033FF", "yellow" -> "#FFFF00", "red" -> "#FF0000")
//
//  // use two or more Maps with ++ as operator
//  var colors = colors1 ++ colors2
//  println( "colors1 ++ colors2 : " + colors )
//
//  // use two maps with ++ as method
//  colors = colors1.++(colors2)
//  println( "colors1.++(colors2)) : " + colors )
//
//
//  //iterate
//  colors.keys.foreach{ i =>
//    print( "Key = " + i )
//    println(" Value = " + colors(i) )}
//}
//
//colors.values.foreach{ i =>
//  println(" Value = " + i )}
//}
//
//http://tutorialspoint.com/scala/scala_maps.htm
//
//
//******************************************************************************************************
//Tuple :--

}
