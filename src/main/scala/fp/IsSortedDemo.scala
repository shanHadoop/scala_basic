package fp

object IsSortedDemo extends App{

  def isSorted[A](as:Array[A], funcOrdered:(A,A) => Boolean):Boolean= {
    def go(n:Int):Boolean = {
      if (n >= as.length-1) true
      else if(funcOrdered(as(n),as(n+1))) false
      else go(n + 1)
    }
    go(0)
  }

val myArra= Array("Nihar", "Amit","Aaa")

  def isSort(a:String, b:String) = a <= b

  println(isSorted(myArra,isSort))


  case class Employee(name:String,age:Int)

  val EArr= Array(Employee("Ahan1",99),Employee("Ahan2",90),Employee("Ahan3",9),Employee("Ahan",119))

  def shorEmployee(a:Employee, b:Employee) = a.age < b.age
  println(isSorted(EArr,shorEmployee))


}

