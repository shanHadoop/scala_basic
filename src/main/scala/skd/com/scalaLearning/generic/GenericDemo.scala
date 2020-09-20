package skd.com.scalaLearning.generic

//Generic classes are classes which take a type as a parameter. They are particularly useful for collection classes.

object GenericDemo extends App{

  // Example - 1
  class Stack[AB] {
    private var elements: List[AB] = Nil
    def push(x: AB) { elements = x :: elements }
    def peek: AB = elements.head
    def pop(): AB = {
      val currentTop = peek
      elements = elements.tail
      currentTop
    }
  }

//  val stack = new Stack[Int]
//  stack.push(1)
//  stack.push(2)
//  println(stack.pop)  // prints 2
//  println(stack.pop)
//
//
//  val stackString = new Stack[String]
//  stackString.push("One")
//  stackString.push("Two")
//  stackString.push(2.toString)
//  println(stack.pop)  // prints Two
//  println(stack.pop)



  //Example -2

  def listOfDuplicates[A](x: A, length: Int): List[A] = {
    if (length < 1)
      Nil
    else
      x :: listOfDuplicates(x, length - 1)
  }
  println(listOfDuplicates[Int](3, 4))  // List(3, 3, 3, 3)
  println(listOfDuplicates("La", 8))

  println(listOfDuplicates("La", 8))

}
