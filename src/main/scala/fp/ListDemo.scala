package fp



sealed trait List[+A]
case object Nil extends List[Nothing]
case class Cons[+A] (head: A, tail:List[A]) extends List[A]

object ListDemo extends App {
  val result = List(1,2,3,4,5) match {
    case Cons(x, Cons(2,Cons(4,_))) => x
    case Nil => 4
    case Cons(x, Cons(y, Cons(3, Cons(4,_)))) => x + y
    case Cons(h,sTail) => h + List.sum(sTail)
  }

  println(s"result is $result")

}
object List{
def sum(ints:List[Int]):Int= ints match {
  case Nil => 0
  case Cons(headX, tailX) => headX + sum(tailX)
}

  def product(ds:List[Double]):Double = ds match {
    case Nil => 0
    case Cons(0.0,_) => 0
    case Cons(head, tail) => head * product(tail)
  }

  def apply[A](mvalL:A*):List[A] =  {
  if (mvalL.isEmpty) Nil
    else Cons(mvalL.head , apply(mvalL.tail:_*))
    }

}